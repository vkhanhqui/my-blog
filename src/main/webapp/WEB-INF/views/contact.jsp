<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Contact</title>
<jsp:include page="headerContact.jsp" />

<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

</head>
<body>

	<nav
		class="navbar px-md-0 navbar-expand-lg navbar-dark ftco_navbar bg-dark ftco-navbar-dark"
		id="ftco-navbar">
		<div class="container">
			<a class="navbar-brand" href="/blog/">M<i>e</i>.
			</a>
			<button class="navbar-toggler" type="button" data-toggle="collapse"
				data-target="#ftco-nav" aria-controls="ftco-nav"
				aria-expanded="false" aria-label="Toggle navigation">
				<span class="oi oi-menu"></span> Menu
			</button>

			<div class="collapse navbar-collapse" id="ftco-nav">
				<ul class="navbar-nav ml-auto">
					<li class="nav-item active"><a href="/blog/" class="nav-link">Home</a></li>
					<li class="nav-item"><a href="list" class="nav-link">Blogs</a></li>
					<li class="nav-item"><a href="contact" class="nav-link">Contact</a></li>
					<li class="nav-item"><a href="login" class="nav-link">Admin-login</a></li>
				</ul>
			</div>
		</div>
	</nav>
	<!-- END nav -->

	<section class="ftco-section contact-section" id="content">
		<div class="container">
			<div class="row d-flex mb-5 contact-info">
				<div class="col-md-12 mb-4">
					<h2 class="h3">Contact Information</h2>
				</div>
				<div class="w-100"></div>
				<div class="col-md-3">
					<p>
						<span>Address:</span> 198 West 21th Street, Suite 721 New York NY
						10016
					</p>
				</div>
				<div class="col-md-3">
					<p>
						<span>Phone:</span> <a href="tel://1234567920">+ 1235 2355 98</a>
					</p>
				</div>
				<div class="col-md-3">
					<p>
						<span>Email:</span> <a href="mailto:info@yoursite.com">info@yoursite.com</a>
					</p>
				</div>
				<div class="col-md-3">
					<p>
						<span>Website</span> <a href="#">yoursite.com</a>
					</p>
				</div>
			</div>
			<div class="row block-9 no-gutters">
				<div class="col-lg-6 order-md-last d-flex">
					<form action="#" class="bg-light p-4 p-md-5 contact-form">
						<div class="form-group">
							<input type="text" class="form-control" placeholder="Your Name">
						</div>
						<div class="form-group">
							<input type="text" class="form-control" placeholder="Your Email">
						</div>
						<div class="form-group">
							<input type="text" class="form-control" placeholder="Subject">
						</div>
						<div class="form-group">
							<textarea name="" id="" cols="30" rows="7" class="form-control"
								placeholder="Message"></textarea>
						</div>
						<div class="form-group">
							<input type="submit" value="Send Message"
								class="btn btn-primary py-3 px-5">
						</div>
					</form>

				</div>

				<div class="col-lg-6 d-flex">
					<div id="map" class="bg-white"></div>
				</div>
			</div>
		</div>
	</section>

	<footer class="ftco-footer ftco-bg-dark ftco-section">
		<div class="container">
			<div class="row mb-5">
				<div class="col-md">
					<div class="ftco-footer-widget mb-4">
						<h2 class="logo">
							<a href="#">Read<span>it</span>.
							</a>
						</h2>
						<p>Far far away, behind the word mountains, far from the
							countries Vokalia and Consonantia, there live the blind texts.</p>
						<ul
							class="ftco-footer-social list-unstyled float-md-left float-lft mt-5">
							<li class="ftco-animate"><a href="#"><span
									class="icon-twitter"></span></a></li>
							<li class="ftco-animate"><a href="#"><span
									class="icon-facebook"></span></a></li>
							<li class="ftco-animate"><a href="#"><span
									class="icon-instagram"></span></a></li>
						</ul>
					</div>
				</div>
				<div class="col-md">
					<div class="ftco-footer-widget mb-4">
						<h2 class="ftco-heading-2">latest News</h2>
						<div class="block-21 mb-4 d-flex">
							<a class="img mr-4 rounded"
								style="background-image: url(${pageContext.request.contextPath}/resources/homePage/images/image_1.jpg);"></a>
							<div class="text">
								<h3 class="heading">
									<a href="#">Even the all-powerful Pointing has no control
										about</a>
								</h3>
								<div class="meta">
									<div>
										<a href="#"><span></span> Oct. 16, 2019</a>
									</div>
									<div>
										<a href="#"><span></span> Admin</a>
									</div>
									<div>
										<a href="#"><span></span> 19</a>
									</div>
								</div>
							</div>
						</div>
						<div class="block-21 mb-4 d-flex">
							<a class="img mr-4 rounded"
								style="background-image: url(${pageContext.request.contextPath}/resources/homePage/images/image_2.jpg);"></a>
							<div class="text">
								<h3 class="heading">
									<a href="#">Even the all-powerful Pointing has no control
										about</a>
								</h3>
								<div class="meta">
									<div>
										<a href="#"><span></span> Oct. 16, 2019</a>
									</div>
									<div>
										<a href="#"><span></span> Admin</a>
									</div>
									<div>
										<a href="#"><span></span> 19</a>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
				<div class="col-md">
					<div class="ftco-footer-widget mb-4 ml-md-5">
						<h2 class="ftco-heading-2">Information</h2>
						<ul class="list-unstyled">
							<li><a href="#" class="py-1 d-block"><span
									class="ion-ios-arrow-forward mr-3"></span>Home</a></li>
							<li><a href="#" class="py-1 d-block"><span
									class="ion-ios-arrow-forward mr-3"></span>About</a></li>
							<li><a href="#" class="py-1 d-block"><span
									class="ion-ios-arrow-forward mr-3"></span>Articles</a></li>
							<li><a href="#" class="py-1 d-block"><span
									class="ion-ios-arrow-forward mr-3"></span>Contact</a></li>
						</ul>
					</div>
				</div>
				<div class="col-md">
					<div class="ftco-footer-widget mb-4">
						<h2 class="ftco-heading-2">Have a Questions?</h2>
						<div class="block-23 mb-3">
							<ul>
								<li><a href="#"><span class="icon icon-map-marker"></span><span
									class="text">address</span></a></li>
								<li><a href="#"><span class="icon icon-phone"></span><span
										class="text">phone number</span></a></li>
								<li><a href="#"><span class="icon icon-envelope"></span><span
										class="text">mail</span></a></li>
							</ul>
						</div>
					</div>
				</div>
			</div>

		</div>
	</footer>

	<a href="#" class="cd-top"
		style="background-image: url(https://thinhweb.com/wp-content/themes/thinhweb/images/cd-top-arrow.svg);">Back
		To Top</a>


	<script
		src="${pageContext.request.contextPath}/resources/homePage/js/jquery.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/resources/homePage/js/jquery-migrate-3.0.1.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/resources/homePage/js/popper.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/resources/homePage/js/bootstrap.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/resources/homePage/js/jquery.easing.1.3.js"></script>
	<script
		src="${pageContext.request.contextPath}/resources/homePage/js/jquery.waypoints.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/resources/homePage/js/jquery.stellar.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/resources/homePage/js/owl.carousel.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/resources/homePage/js/jquery.magnific-popup.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/resources/homePage/js/aos.js"></script>
	<script
		src="${pageContext.request.contextPath}/resources/homePage/js/jquery.animateNumber.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/resources/homePage/js/scrollax.min.js"></script>
	<script
		src="https://maps.googleapis.com/maps/api/js?key=AIzaSyBVWaKrjvy3MaE7SQ74_uJiULgl1JY0H2s&sensor=false"></script>
	<script
		src="${pageContext.request.contextPath}/resources/homePage/js/google-map.js"></script>
	<script
		src="${pageContext.request.contextPath}/resources/homePage/js/main.js"></script>
	<script
		src="${pageContext.request.contextPath}/resources/homePage/js/backtotop.js"></script>
</body>
</html>