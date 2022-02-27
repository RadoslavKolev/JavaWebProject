<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Вход</title>
<link rel="stylesheet" href="css/style.css">

</head>
<body>

<jsp:include page="Header.jsp"></jsp:include>
<div class="container">
  <h2 class="centered">Влезте в системата</h2>
  <div class="yellow_card">
<form action="Login" method="post" name="login">
    <label for="username">Потребителско име:</label>
  <input type="text" placeholder="Въведете потребителско име" name="login_username" id="login_username" />
    <label for="password">Парола:</label>
  <input type="password" placeholder="Въведете парола поне с 8 символа" name="login_password" id="login_password" />
  <input type="submit" name="submit" value="Вход"/>
  </form>
   </div>
</div>
</body>
</html>