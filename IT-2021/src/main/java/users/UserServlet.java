package users;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/user") 
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	UserCollection collection;
 
	public void init(ServletConfig config) throws ServletException {
		collection = UserCollection.getInstance();
	}

	 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  
		int id = Integer.parseInt(request.getParameter("id"));
		
		String action = request.getParameter("action");
		String page = (action!=null && !action.isEmpty() && action.equals("edit")) ? "EditProfilePage.jsp":"ProfilePage.jsp";
				
		Cookie cookies[] = request.getCookies();
		
		for(Cookie cookie:cookies)
		{
			if(cookie.getName().equals("message1"))
			{
				request.setAttribute("message",cookie.getName());
				break;
			}
		}

		HttpSession oldSession = request.getSession(false);		
		User sessionUser = (oldSession !=null) ? (User) oldSession.getAttribute("sessionUser"):null;
		
		
		if(sessionUser == null || sessionUser.getId() !=id)
		{
			sessionUser = collection.getById(id);			
		}
		
		request.setAttribute("registeredUser", sessionUser);
		
		if(sessionUser != null)
		{
			RequestDispatcher rd = request.getRequestDispatcher(page);
			rd.forward(request, response);
		}
		
		else			
			response.sendRedirect(request.getContextPath());		
	}

	 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				
		request.setCharacterEncoding("UTF-8");
		
		int id= Integer.parseInt(request.getParameter("id"));
		
		String name = request.getParameter("personal_name");
		String jobTitle = request.getParameter("job_title");
		String description = request.getParameter("description");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String city = request.getParameter("city");
		String street = request.getParameter("street");
	
		User updatedUser=collection.getById(id);
		
		updatedUser.setPersonalName(name);
		updatedUser.setJobTitle(jobTitle);
		updatedUser.setDescription(description);
		updatedUser.setEmail(email);
		updatedUser.setPhone(phone);
		updatedUser.getAddress().setCity(city);
		updatedUser.getAddress().setStreet(street);
				
		for(int i=0; i<updatedUser.getProffesionalSkills().size();i++)
		{
			String profSkillName = request.getParameter("profSkillName"+i);
			int profSkillLevel = Integer.parseInt(request.getParameter("profSkillLevel"+i));
			updatedUser.getProffesionalSkills().get(i).setSkillName(profSkillName);
			updatedUser.getProffesionalSkills().get(i).setLevel(profSkillLevel);
		}
		
		for(int i=0; i<updatedUser.getPersonalSkills().size();i++)
		{
			String personalSkillName = request.getParameter("personalSkillName"+i);
			int personalSkillLevel = Integer.parseInt(request.getParameter("personalSkillLevel"+i));
			updatedUser.getPersonalSkills().get(i).setSkillName(personalSkillName);
			updatedUser.getPersonalSkills().get(i).setLevel(personalSkillLevel);
		}
		
		collection.update();
		
		Cookie cookies[] = request.getCookies();
		
		for(Cookie cookie:cookies)
		{
			if(cookie.getName().equals("message1"))
			{
				request.setAttribute("message",cookie.getName());
				break;
			}
		}
		
		request.setAttribute("registeredUser", updatedUser);
		
		RequestDispatcher rd = request.getRequestDispatcher("/ProfilePage.jsp");
		rd.forward(request, response);
		 
	}

}
