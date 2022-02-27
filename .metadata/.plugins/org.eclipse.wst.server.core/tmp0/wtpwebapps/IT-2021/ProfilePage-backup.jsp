<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     
 
<!DOCTYPE html>
<html>
<head>
<title>Начало</title>
<link rel="stylesheet" href="css/style.css">
</head>
<body>
<%-- <jsp:useBean id="user" scope="request" /> --%>
 <header> </header>
 <div class="container">
 <div class="content">
 <div class="profile_picture"> 
 <img src="images/male.svg" alt="">
 </div>
 <div class="my_info">
 <h2>Профилна информация</h2>
 <p>Име: Иван Иванов
 </p>
 <p>Работа: Студент</p>
 <p>Описание: Известен факт е, че читателят обръща внимание на съдържанието, което чете, а не на оформлението му. 
 Свойството на Lorem Ipsum е, че до голяма степен има нормално разпределение на буквите и се че те по-лесно, 
 за разлика от нормален текст на английски език като  "Това е съдържание, това е съдържание".</p>
 </div>
 
 <h2 class="centered">Умения</h2>
 <div id="card1">

 <div class="card_column_one">
 <h3>Професионални</h3>
 <label for="java">Java</label>
<progress id="java" max="100" value="20"> </progress>

 
  <label for="html">HTML</label>
<progress id="html" max="100" value="30"> </progress>
 
 
  <label for="css">CSS</label>
<progress id="css" max="100" value="70"> </progress>
 
 
  <label for="javascript">JavaScript</label>
<progress id="javascript" max="100" value="10"> </progress>
 
  </div>
  <div class="card_column_two">
  
   <h3>Личностни</h3>
   
   <label for="communications">Комуникативност</label>
<progress id="communications" max="100" value="5"> </progress>

 
  <label for="teamwork">Екипна работа</label>
<progress id="teamwork" max="100" value="25"> </progress>
 
 
  <label for="creativity">Креативност</label>
<progress id="creativity" max="100" value="15"> </progress>
  </div>
   </div>
 
 
 <h2 class="centered">Контакти</h2>
 <div id="card2">
  <div class="card_column_one">
  <p class="contacts">Имейл</p>
  <p class="orange_text">ivan@tu-varna.bg</p>
  <p class="contacts">Телефон</p>
  <p class="orange_text_bottom">09876543219</p>
  </div>
 
   <div class="card_column_two">
  <p class="contacts">Град</p>
  <p class="orange_text">Варна</p>
  <p class="contacts">Улица</p>
  <p class="orange_text_bottom">Студентска 1</p>
   
   </div>
 
 </div>
</div>
</div>

 <footer> </footer>
</body>
</html>