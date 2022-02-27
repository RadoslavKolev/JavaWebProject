package users;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Reg") 
public class RegServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	UserCollection collection;

 
	public void init(ServletConfig config) throws ServletException {
		
		collection = UserCollection.getInstance();
		
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		RequestDispatcher rd = request.getRequestDispatcher("/RegisterPage.jsp");
		 rd.forward(request, response);
		
	}

 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		request.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();

		
		String personalName = request.getParameter("personal_name");
		String userName = request.getParameter("username");
		String password = request.getParameter("password");
		String re_password = request.getParameter("rep_password");
		
		if(personalName==null || personalName.isEmpty() || userName==null ||userName.isEmpty() || password==null || password.isEmpty())
		{
			out.print("<p style='color:red; text-align:center'>Моля, въведете всички полета!</p>");
			RequestDispatcher rd = request.getRequestDispatcher("/RegisterPage.jsp");
			rd.include(request, response);
		}
		
		else if(!password.equals(re_password))
		{
			out.print("<p style='color:red; text-align:center'>Въведените пароли не съвпадат!</p>");
			RequestDispatcher rd = request.getRequestDispatcher("/RegisterPage.jsp");
			rd.include(request, response);

		}
		
		else
		{
			User user = new User(personalName,userName,password);
			
			ArrayList<Skill> profSkill = new ArrayList<Skill>();
			profSkill.add(new Skill()); 
			profSkill.add(new Skill()); 
			profSkill.add(new Skill()); 
			profSkill.add(new Skill()); 
			
			user.setProffesionalSkills(profSkill);
			
			ArrayList<Skill> personalSkill = new ArrayList<Skill>();
			personalSkill.add(new Skill()); 
			personalSkill.add(new Skill()); 
			personalSkill.add(new Skill()); 
			
			user.setPersonalSkills(personalSkill);
			
			if(collection.getUser(userName)==null)
			{
				collection.addUser(user);
				//User registeredUser = collection.getUser(user.getUserName());
									
				//out.print("<p style='color:red; text-align:center'>" + registeredUser.getPersonalName() + ", Вие се регистрирахте успешно!</p>");
				response.sendRedirect("LoginPage.jsp");
			}
			
			else
			{
				out.print("<p style='color:red; text-align:center'>Потребителското име е заето!</p>");
				RequestDispatcher rd = request.getRequestDispatcher("/RegisterPage.jsp");
				rd.include(request, response);

			}
		}
		
	}

}
