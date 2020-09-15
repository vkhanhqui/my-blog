<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<!-- icon -->
<link rel="icon" type="image/png"
	href="<c:url value="/resources/images/icons/fox.ico" />">
<!-- font awesome -->
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.7.2/css/all.min.css" />
<!-- google font -->
<link href="https://fonts.googleapis.com/css?family=Candal|Lora"
	rel="stylesheet">
<!-- custom style -->
<link rel="stylesheet" href="<c:url value="/resources/css/style.css" />">
<!-- back to top -->
<link rel="stylesheet"
	href="<c:url value="/resources/css/backtotop.css" />">

<title>Single Post</title>
<%@ page isELIgnored="false"%>
</head>

<body>
	<!-- header -->
	<header>
		<div class="logo">
			<h1 class="logo-text">
				<a href="/vkhanhqui_myblog_war/"><span>Khanh</span>Qui</a>
			</h1>
		</div>
		<i class="fa fa-bars menu-toggle"></i>
		<ul class="nav">
			<li><a href="/vkhanhqui_myblog_war/">Home</a></li>
			<li><a href="/vkhanhqui_myblog_war/list/1">Posts</a></li>
			<li><a href="/vkhanhqui_myblog_war/contact">About</a></li>
			<li><a href="/vkhanhqui_myblog_war/login">Sign in/Sign up</a></li>
			<li><a href="#"> <i class="fa fa-user"></i> Khanh Qui <i
					class="fa fa-chevron-down" style="font-size: .8em;"></i>
			</a>
				<ul>
					<li><a href="#">Dashboard</a></li>
					<li><a href="#" class="logout">Logout</a></li>
				</ul></li>
		</ul>
	</header>
	<!-- /header -->
	<!-- page wrapper -->
	<div class="page-wrapper">
		<!-- content -->
		<div class="content clearfix">
			<!-- main content -->
			<div class="main-content single">
				<h1 class="post-title">${post.title}</h1>

				<div class="post-content">${post.content}</div>
			</div>
			<!-- /main content -->
			<!-- sidebar -->
			<div class="sidebar single">
				<div class="section">
					<h2 class="section-title">Search</h2>
					<form action="/vkhanhqui_myblog_war/keywords/" method="post">

						<input type="text" class="text-input" name="keywords"
							placeholder="Search..." />
						<div>
							<button type="submit" name="register-btn" class="btn btn-big">Find</button>
						</div>
					</form>
				</div>

				<div class="section popular">
					<h2 class="section-title">Popular</h2>
					<c:forEach var="one" items="${mostViewed}">
						<div class="post clearfix">
							<a href="/vkhanhqui_myblog_war/single/${one.id}"> <img
								src="<c:url value="${one.avatar}"/>" alt="" class="post-image">
							</a> <a href="/vkhanhqui_myblog_war/single/${one.id}" class="title"><h4>${one.description}</h4></a>
						</div>
					</c:forEach>
				</div>

				<div class="section topics">
					<h2 class="section-title">Categories</h2>
					<ul>
						<c:forEach var="one" items="${listOfCategories}">
							<li><a href="/vkhanhqui_myblog_war/categories/${one.name}/1">${one.name}</a></li>
						</c:forEach>
					</ul>
				</div>
			</div>
			<!-- /sidebar -->
		</div>
		<!-- /content -->
	</div>
	<!-- /page wrapper -->

	<!-- footer -->

	<div class="footer">
		<div class="footer-content">
			<div class="footer-section about">
				<h1 class="logo-text">
					<span>Khanh</span>Qui
				</h1>
				<p>Far far away, behind the word mountains, far from the
					countries Vokalia and Consonantia, there live the blind texts.</p>
				<div class="contact">
					<span><i class="fas fa-phone"></i> &nbsp; 123-456-789</span> <span><i
						class="fas fa-envelope"></i> &nbsp; info@gmail.com</span>
				</div>
				<div class="socials">
					<a href="#"><i class="fab fa-facebook"></i></a> <a href="#"><i
						class="fab fa-google-plus"></i></a> <a href="#"><i
						class="fab fa-github"></i></a>
				</div>
			</div>
			<div class="footer-section links">
				<h2>Quick Links</h2>
				<br>
				<ul>
					<a href="#">
						<li>Events</li>
					</a>
					<a href="#">
						<li>Team</li>
					</a>
					<a href="#">
						<li>Mentores</li>
					</a>
					<a href="#">
						<li>Gallery</li>
					</a>
					<a href="#">
						<li>Terms and Conditions</li>
					</a>
				</ul>
			</div>
			<div class="footer-section contact-form">
				<h2>Contact us</h2>
				<br>
				<form action="#" method="get">
					<input type="email" name="email" class="text-input contact-input"
						placeholder="Your email address...">
					<textarea name="message" class="text-input contact-input"
						placeholder="Your message..."></textarea>
					<button type="submit" class="btn btn-big">
						<i class="fas fa-envelope"></i> Send
					</button>
				</form>
			</div>
		</div>
	</div>

	<!-- /footer -->
	<a href="#" class="back-to-top"></a>


	<!-- jquery -->
	<script src="<c:url value="/resources/js/jquery-3.2.1.min.js"/>"></script>
	<!-- custom js -->
	<script src="<c:url value="/resources/js/custom.js"/>"></script>
	<!-- back to top -->
	<script src="<c:url value="/resources/js/backtotop.js"/>"></script>


</body>

</html>