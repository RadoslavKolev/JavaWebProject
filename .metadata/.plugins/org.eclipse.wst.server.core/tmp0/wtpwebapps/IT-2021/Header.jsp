<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
 <%@ page import="users.User" %>
<header>
<div>

<% 
HttpSession oldSession = request.getSession(false);

User sessionUser = (oldSession != null) ? (User) oldSession.getAttribute("sessionUser"): null;

if(sessionUser == null)
{
%>
<a href="Reg">Регистрация</a>
<a href="Login">Вход</a>
<% }
else	
{
%>

<form action="Logout" method="post">

<input type="submit" value="Изход" />

</form>

<% } %>

<a href="Users">Потребители</a>
</div>
</header>