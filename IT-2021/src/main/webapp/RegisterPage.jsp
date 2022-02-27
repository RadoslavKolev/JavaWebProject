<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Създаване на профил</title>
<link rel="stylesheet" href="css/style.css">
</head>
<body>

<jsp:include page="Header.jsp"></jsp:include>

 <div class="container">
  <h2 class="centered">Създаване на профил</h2>
  <div class="yellow_card">
  <form action="Reg" method="post" name="register">
  <label for="personal_name">Име:</label>
  <input type="text" placeholder="Въведете име за контакт" name="personal_name" id="personal_name" />
  <label for="username">Потребителско име:</label>
  <input type="text" placeholder="Въведете потребителско име" name="username" id="username" />
    <label for="password">Парола:</label>
  <input type="password" placeholder="Въведете парола поне с 8 символа" name="password" id="password"   minlength="8" />
  <label for="rep_password">Повторете паролата:</label>
  <input type="password" placeholder="Въведете парола поне с 8 символа" name="rep_password" id="rep_password"   minlength="8" /> 
  <input type="submit" name="submit" value="Вход"/>
  </form>
  </div>
</div>
</body>
</html>