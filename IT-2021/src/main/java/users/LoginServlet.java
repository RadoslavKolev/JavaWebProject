package users;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(urlPatterns={"/Login","/index.html","/index.jsp"})
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	UserCollection collection;

	public void init(ServletConfig config) throws ServletException {
		collection = UserCollection.getInstance();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
 RequestDispatcher rd = request.getRequestDispatcher("/LoginPage.jsp");
 rd.forward(request, response);
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();


		String username = request.getParameter("login_username");
		String password = request.getParameter("login_password");

		User user = new User(username,password);
		
		if(collection.checkifExist(user))
		{
			User registeredUser = collection.getUser(user.getUserName());
			
			HttpSession oldSession = request.getSession(false);
			
			if(oldSession != null)
			{
				oldSession.invalidate();
			}
			
			HttpSession newSession = request.getSession(true);
			
			newSession.setAttribute("sessionUser", registeredUser);
			
			response.sendRedirect("user?id="+ registeredUser.getId() + "&action=edit");
		}
		
		else
		{
			out.print("<p style='color:red; text-align:center'>Невалидно потребителско име или парола!</p>");
			RequestDispatcher rd = request.getRequestDispatcher("/LoginPage.jsp");
			rd.include(request, response);
		}
		
	}

}
