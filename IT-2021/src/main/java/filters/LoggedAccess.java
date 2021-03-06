package filters;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import users.User;

@WebFilter(urlPatterns= {"/user"})
public class LoggedAccess implements Filter {

    
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		HttpServletRequest req = (HttpServletRequest) request;
		
		HttpServletResponse res = (HttpServletResponse) response;
		
		req.setCharacterEncoding("UTF-8");
		
		int id = Integer.parseInt(request.getParameter("id"));
		
		String action = request.getParameter("action");
		
		HttpSession oldSession = req.getSession(false);
		
		User sessionUser = (oldSession !=null) ? (User) oldSession.getAttribute("sessionUser"):null;
		
		
		if(sessionUser == null)
		{
			res.sendRedirect(req.getContextPath());
		}
		
		else if(id!=sessionUser.getId() && action!=null && !action.isEmpty() && action.equals("edit"))
		{
			res.sendRedirect("user?id=" + sessionUser.getId());

		}
		
		else
		
		{
	 		chain.doFilter(request, response);
		}
	}

}
