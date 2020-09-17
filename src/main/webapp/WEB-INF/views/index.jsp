<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

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

<title>Home</title>
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
			<c:choose>
				<c:when test="${username==null}">
					<li><a href="/vkhanhqui_myblog_war/sign-in">Sign in/Sign
							up</a></li>
				</c:when>
				<c:otherwise>
					<li><a href="#"> <i class="fa fa-user"></i> ${username} <i
							class="fa fa-chevron-down" style="font-size: .8em;"></i>
					</a>
						<ul>
							<li><a href="/vkhanhqui_myblog_war/${role}/posts/index">Dashboard</a></li>
							<li><a href="/vkhanhqui_myblog_war/sign-in/logout"
								class="logout">Logout</a></li>
						</ul></li>
				</c:otherwise>
			</c:choose>
		</ul>
	</header>
	<!-- /header -->
	<!-- page wrapper -->
	<div class="page-wrapper">
		<!-- post slider -->
		<div class="post-slider">

			<h1 class="slider-title">Trending Posts</h1>
			<i class="fas fa-chevron-left prev"></i> <i
				class="fas fa-chevron-right next"></i>

			<div class="post-wrapper">
				<c:forEach var="one" items="${topFiveViewedPost}">
					<div class="post clearfix">
						<a href="/vkhanhqui_myblog_war/single/${one.id}"> <img
							src="<c:url value="${one.thumbnail}"/>" alt="" class="slider-image"></a>
						<div class="post-info">
							<h4>
								<a href="/vkhanhqui_myblog_war/single/${one.id}">${one.title}</a>
							</h4>
							<i class="far fa-user">Khanh Qui</i> &nbsp; <i
								class="far fa-calendar">Sep 13, 2020</i>
						</div>
					</div>
				</c:forEach>
			</div>
		</div>

		<!-- /post slider -->
		<!-- content -->
		<div class="content clearfix">
			<!-- main content -->
			<div class="main-content">
				<h1 class="recent-post-title">Related Posts</h1>

				<div class="pagination">
					<a href="/vkhanhqui_myblog_war/1" class="btn-paginate prev"><i
						class="fa fa-chevron-left"><i class="fa fa-chevron-left"></i></i></a>
					<a href="/vkhanhqui_myblog_war/${currentPage-3}"
						class="btn-paginate prev"><i class="fa fa-chevron-left"></i></a>
					<ul class="paginate">
						<%--                        --%>
						<c:forEach var="i" items="${pagedListNumber.pageList}">
							<c:choose>
								<c:when test="${i==currentPage}">
									<li><a class="active" href="/vkhanhqui_myblog_war/${i}">${i}</a></li>
								</c:when>
								<c:otherwise>
									<li><a href="/vkhanhqui_myblog_war/${i}">${i}</a></li>
								</c:otherwise>
							</c:choose>
						</c:forEach>
						<%--             /           --%>
					</ul>
					<a href="/vkhanhqui_myblog_war/${currentPage+3}"
						class=" btn-paginate prev"><i class="fa fa-chevron-right"></i></a>
					<a href="/vkhanhqui_myblog_war/${pagedListPost.pageCount}"
						class="btn-paginate prev"><i class="fa fa-chevron-right"><i
							class="fa fa-chevron-right"></i></i></a>
				</div>
				<%--				--%>
				<c:forEach var="one" items="${pagedListPost.pageList}">
					<div class="post">
						<a href="/vkhanhqui_myblog_war/single/${one.id}"> <img
							src="<c:url value="${one.thumbnail}"/>" alt="" class="post-image"></a>
						<div class="post-preview">
							<h2>
								<a href="/vkhanhqui_myblog_war/single/${one.id}">${one.title}</a>
							</h2>
							<i class="far fa-user">Khanh Qui</i> &nbsp; <i
								class="far calendar">Sep 13, 2020</i>
							<p class="preview-text">${one.description}</p>
							<a href="/vkhanhqui_myblog_war/single/${one.id}"
								class="btn read-more">Read More</a>
						</div>
					</div>
				</c:forEach>
				<%--		/		--%>
				<div class="pagination">
					<a href="/vkhanhqui_myblog_war/1" class="btn-paginate prev"><i
						class="fa fa-chevron-left"><i class="fa fa-chevron-left"></i></i></a>
					<a href="/vkhanhqui_myblog_war/${currentPage-3}"
						class="btn-paginate prev"><i class="fa fa-chevron-left"></i></a>
					<ul class="paginate">
						<%--                        --%>
						<c:forEach var="i" items="${pagedListNumber.pageList}">
							<c:choose>
								<c:when test="${i==currentPage}">
									<li><a class="active" href="/vkhanhqui_myblog_war/${i}">${i}</a></li>
								</c:when>
								<c:otherwise>
									<li><a href="/vkhanhqui_myblog_war/${i}">${i}</a></li>
								</c:otherwise>
							</c:choose>
						</c:forEach>
						<%--             /           --%>
					</ul>
					<a href="/vkhanhqui_myblog_war/${currentPage+3}"
						class=" btn-paginate prev"><i class="fa fa-chevron-right"></i></a>
					<a href="/vkhanhqui_myblog_war/${pagedListPost.pageCount}"
						class="btn-paginate prev"><i class="fa fa-chevron-right"><i
							class="fa fa-chevron-right"></i></i></a>
				</div>
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
								src="<c:url value="${one.thumbnail}"/>" alt="" class="post-image">
							</a> <a href="/vkhanhqui_myblog_war/single/${one.id}" class="title"><h4>${one.description}</h4>
							</a>
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
	<!-- slick -->
	<script src="<c:url value="/resources/js/slick.min.js"/>"></script>
	<!-- custom js -->
	<script src="<c:url value="/resources/js/custom.js"/>"></script>
	<!-- back to top -->
	<script src="<c:url value="/resources/js/backtotop.js"/>"></script>

</body>
</html>
