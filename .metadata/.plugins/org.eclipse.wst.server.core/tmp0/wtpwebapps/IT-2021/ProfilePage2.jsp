<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%-- <%@ page import="users.Skill"%>
<%@ page import="users.Address"%> --%>


<!DOCTYPE html>
<html>
<head>

<title>Начало</title>
<link rel="stylesheet" href="css/style.css">
</head>
<body>

	<jsp:useBean id="registeredUser" class="users.User" scope="request">
		<jsp:setProperty name="loggedUser" property="*" />
	</jsp:useBean>

 	<header> </header>
	<div class="container">
		<div class="content">
			<div class="profile_picture">
				<img src="images/male.svg" alt="">
			</div>
			<div class="my_info">
				<h2>Профилна информация</h2>
				<p>
					Име:
					<jsp:getProperty name="registeredUser" property="personalName" />
				</p>
				<p>
					Работа:
					<jsp:getProperty name="registeredUser" property="jobTitle" /></p>
				<p>
					Описание:
					<jsp:getProperty name="registeredUser" property="description" />

				 
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
					<p class="orange_text"><jsp:getProperty name="registeredUser"
							property="email" /></p>
					<p class="contacts">Телефон</p>
					<p class="orange_text_bottom"><jsp:getProperty
							name="registeredUser" property="phone" /></p>
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