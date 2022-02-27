<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="users.UserCollection" %> 
<%@ page import="users.User" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/style.css">

</head>
<body>
<jsp:include page="Header.jsp"></jsp:include>

<% UserCollection collection = UserCollection.getInstance(); %>

 <div class="container">
  <div class="content">
  
  <table>
  <tr>
  <th>Потребител</th>
  <th>Работа</th>
  <th>Информация</th>
  </tr>
  
  <% for(User user:collection.getUsers()){ %>
  
  <tr>
  <td><a href="user?id=<%= user.getId() %>"><%= user.getPersonalName() %></a></td>
  <td><%= user.getJobTitle() %></td>
  <td><%= user.getDescription() %></td>
  </tr>
  
  <% } %>
  
  </table>
  
  
 </div>
  </div>

</body>
</html>