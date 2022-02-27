<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import = "users.User" %>
    
<header>
	<% 
		HttpSession mySession = request.getSession(false);
		User sessionUser = (mySession != null) ? (User) mySession.getAttribute("sessionUser"):null;
		if(sessionUser == null) {			
	%>
	<a href="Reg" style="color: white">Register|&nbsp;</a>    
	<a href="Login" style="color: white">Login|&nbsp;</a>
	<% } %>
	<a href="Users" style="color: white">Users</a>
	<%  if(sessionUser != null) {%>
	<form action="Logout" method="post">
		<input type="submit" value="Logout" style="color: white" />
	</form>	
	<%} %>	
</header>