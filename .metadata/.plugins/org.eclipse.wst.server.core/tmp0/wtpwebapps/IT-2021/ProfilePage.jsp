<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ page import="users.User" %>
  <%@ page import="users.Skill" %>
    
     
 
<!DOCTYPE html>
<html>
<head>
<title>Начало</title>
<link rel="stylesheet" href="css/style.css">
</head>
<body>
 <% User user = (User) request.getAttribute("registeredUser"); 
 User sessionUser = (User) session.getAttribute("sessionUser"); 
 %>
<jsp:include page="Header.jsp"></jsp:include>
 <div class="container">
 
 
 <% if(request.getAttribute("message") == null) { %>
 <div>
 
 <h2>Добре дошли!</h2>
 
 <form action="cookie" method="post"> 
 
 <input type="submit" value="Изключи" />
 
 </form>
 </div>
  
  <% } %>
 
 <div class="content">
 <div class="profile_picture"> 
 <img src="images/male.svg" alt="">
 </div>
 <div class="my_info">
 
 <% if(user.getId()==sessionUser.getId()) { %>
 
 <div>
 <a href="user?id=<%= user.getId()%>&action=edit">Редактирай профила</a>
 </div>
 
 <% } %>
 
 <h2>Профилна информация</h2>
 <p>Име: <%= user.getPersonalName() %>
 </p>
 <p>Работа: <%= user.getJobTitle() %></p>
 <p>Описание: <%= user.getDescription() %></p>
 </div>
 
 <h2 class="centered">Умения</h2>
 <div id="card1">

 <div class="card_column_one">
 <h3>Професионални</h3>
 
 <% for(Skill skill:user.getProffesionalSkills()) {%>
 <label><%= skill.getSkillName() %></label>
<progress max="100" value="<%= skill.getLevel()%>"> </progress>

 <%} %>
   
 
  </div>
  <div class="card_column_two">
  
   <h3>Личностни</h3>
   
    <% for(Skill skill:user.getPersonalSkills()) {%>
 <label><%= skill.getSkillName() %></label>
<progress max="100" value="<%= skill.getLevel() %>"> </progress>

 <%} %>
   
  </div>
   </div>
 
 
 <h2 class="centered">Контакти</h2>
 <div id="card2">
  <div class="card_column_one">
  <p class="contacts">Имейл</p>
  <p class="orange_text"><%= user.getEmail() %></p>
  <p class="contacts">Телефон</p>
  <p class="orange_text_bottom"><%= user.getPhone() %></p>
  </div>
 
   <div class="card_column_two">
  <p class="contacts">Град</p>
  <p class="orange_text"><%= user.getAddress().getCity() %></p>
  <p class="contacts">Улица</p>
  <p class="orange_text_bottom"><%= user.getAddress().getStreet() %></p>
   
   </div>
 
 </div>
</div>
</div>

 <footer> </footer>
</body>
</html>