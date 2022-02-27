package users;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/cookie")
public class CookieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession oldSession = request.getSession(false);
		
		User sessionUser = (oldSession !=null) ? (User) oldSession.getAttribute("sessionUser"):null;
		
		if(sessionUser != null)	
			
		{		
		
		Cookie message = new Cookie("message1","welcome");
		
		message.setMaxAge(60*60*24);
		
		response.addCookie(message);
		
		response.sendRedirect("user?id="+ sessionUser.getId());
		
		}
		
		else
		{
			response.sendRedirect(request.getContextPath());
		}
		
		
	}

}
