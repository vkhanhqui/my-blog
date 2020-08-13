<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html lang="en">
<head>
<title>Home</title>
<jsp:include page="headerHome.jsp" />
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
</head>
<body>

	<nav
		class="navbar px-md-0 navbar-expand-lg navbar-dark ftco_navbar bg-dark ftco-navbar-light"
		id="ftco-navbar">
		<div class="container">
			<a class="navbar-brand" href="/">M<i>e</i>.
			</a>
			<button class="navbar-toggler" type="button" data-toggle="collapse"
				data-target="#ftco-nav" aria-controls="ftco-nav"
				aria-expanded="false" aria-label="Toggle navigation">
				<span class="oi oi-menu"></span> Menu
			</button>

			<div class="collapse navbar-collapse" id="ftco-nav">
				<ul class="navbar-nav ml-auto">
					<li class="nav-item active"><a href="/"
						class="nav-link">Home</a></li>
					<li class="nav-item"><a href="list" class="nav-link">Blogs</a></li>
					<li class="nav-item"><a href="contact" class="nav-link">Contact</a></li>
					<li class="nav-item"><a href="login" class="nav-link">Sign
							up/Log in</a></li>
				</ul>
			</div>
		</div>
	</nav>
	<!-- END nav -->

	<div class="hero-wrap js-fullheight"
		style="background-image: url('${pageContext.request.contextPath}/resources/homePage/images/bg_1.jpg');"
		data-stellar-background-ratio="0.5">
		<div class=""></div>
		<div class="container">
			<div
				class="row no-gutters slider-text js-fullheight align-items-center justify-content-start"
				data-scrollax-parent="true">
				<div class="col-md-12 ftco-animate">
					<h2 class="subheading">Hello! Welcome to</h2>
					<h1 class="mb-4 mb-md-0">home</h1>
					<div class="row">
						<div class="col-md-7">
							<div class="text">
								<p>Far far away, behind the word mountains, far from the
									countries Vokalia and Consonantia, there live the blind texts.
									Separated they live in Bookmarksgrove right at the coast of the
									Semantics, a large language ocean.</p>
								<div class="mouse">
									<a href="#" class="mouse-icon">
										<div class="mouse-wheel">
											<span class="ion-ios-arrow-round-down"></span>
										</div>
									</a>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>

	<section class="ftco-section">
		<div class="container">
			<div class="row">
				<div class="col-md-12">
					<div class="case">
						<div class="row">
							<div class="col-md-6 col-lg-6 col-xl-8 d-flex">
								<a href="detail" class="img w-100 mb-3 mb-md-0"
									style="background-image: url(${pageContext.request.contextPath}/resources/homePage/images/image_1.jpg);"></a>
							</div>
							<div class="col-md-6 col-lg-6 col-xl-4 d-flex">
								<div class="text w-100 pl-md-3">
									<span class="subheading">Illustration</span>
									<h2>
										<a href="detail">title</a>
									</h2>
									<ul class="media-social list-unstyled">
										<li class="ftco-animate"><a href="#"><span
												class="icon-twitter"></span></a></li>
										<li class="ftco-animate"><a href="#"><span
												class="icon-facebook"></span></a></li>
										<li class="ftco-animate"><a href="#"><span
												class="icon-instagram"></span></a></li>
									</ul>
									<div class="meta">
										<p class="mb-0">
											<a href="#">11/13/2019</a> | <a href="#">12 min read</a>
										</p>
									</div>
								</div>
							</div>
						</div>
					</div>
					<div class="case">
						<div class="row">
							<div class="col-md-6 col-lg-6 col-xl-8 d-flex">
								<a href="detail" class="img w-100 mb-3 mb-md-0"
									style="background-image: url(${pageContext.request.contextPath}/resources/homePage/images/image_2.jpg);"></a>
							</div>
							<div class="col-md-6 col-lg-6 col-xl-4 d-flex">
								<div class="text w-100 pl-md-3">
									<span class="subheading">Application</span>
									<h2>
										<a href="detail">title</a>
									</h2>
									<ul class="media-social list-unstyled">
										<li class="ftco-animate"><a href="#"><span
												class="icon-twitter"></span></a></li>
										<li class="ftco-animate"><a href="#"><span
												class="icon-facebook"></span></a></li>
										<li class="ftco-animate"><a href="#"><span
												class="icon-instagram"></span></a></li>
									</ul>
									<div class="meta">
										<p class="mb-0">
											<a href="#">11/13/2019</a> | <a href="#">12 min read</a>
										</p>
									</div>
								</div>
							</div>
						</div>
					</div>
					<div class="case">
						<div class="row">
							<div class="col-md-6 col-lg-6 col-xl-8 d-flex">
								<a href="detail" class="img w-100 mb-3 mb-md-0"
									style="background-image: url(${pageContext.request.contextPath}/resources/homePage/images/image_3.jpg);"></a>
							</div>
							<div class="col-md-6 col-lg-6 col-xl-4 d-flex">
								<div class="text w-100 pl-md-3">
									<span class="subheading">Design</span>
									<h2>
										<a href="detail">title</a>
									</h2>
									<ul class="media-social list-unstyled">
										<li class="ftco-animate"><a href="#"><span
												class="icon-twitter"></span></a></li>
										<li class="ftco-animate"><a href="#"><span
												class="icon-facebook"></span></a></li>
										<li class="ftco-animate"><a href="#"><span
												class="icon-instagram"></span></a></li>
									</ul>
									<div class="meta">
										<p class="mb-0">
											<a href="#">11/13/2019</a> | <a href="#">12 min read</a>
										</p>
									</div>
								</div>
							</div>
						</div>
					</div>
					<div class="case">
						<div class="row">
							<div class="col-md-6 col-lg-6 col-xl-8 d-flex">
								<a href="detail" class="img w-100 mb-3 mb-md-0"
									style="background-image: url(${pageContext.request.contextPath}/resources/homePage/images/image_4.jpg);"></a>
							</div>
							<div class="col-md-6 col-lg-6 col-xl-4 d-flex">
								<div class="text w-100 pl-md-3">
									<span class="subheading">Illustration</span>
									<h2>
										<a href="detail">title</a>
									</h2>
									<ul class="media-social list-unstyled">
										<li class="ftco-animate"><a href="#"><span
												class="icon-twitter"></span></a></li>
										<li class="ftco-animate"><a href="#"><span
												class="icon-facebook"></span></a></li>
										<li class="ftco-animate"><a href="#"><span
												class="icon-instagram"></span></a></li>
									</ul>
									<div class="meta">
										<p class="mb-0">
											<a href="#">11/13/2019</a> | <a href="#">12 min read</a>
										</p>
									</div>
								</div>
							</div>
						</div>
					</div>
					<div class="case">
						<div class="row">
							<div class="col-md-6 col-lg-6 col-xl-8 d-flex">
								<a href="detail" class="img w-100 mb-3 mb-md-0"
									style="background-image: url(${pageContext.request.contextPath}/resources/homePage/images/image_5.jpg);"></a>
							</div>
							<div class="col-md-6 col-lg-6 col-xl-4 d-flex">
								<div class="text w-100 pl-md-3">
									<span class="subheading">Illustration</span>
									<h2>
										<a href="detail">title</a>
									</h2>
									<ul class="media-social list-unstyled">
										<li class="ftco-animate"><a href="#"><span
												class="icon-twitter"></span></a></li>
										<li class="ftco-animate"><a href="#"><span
												class="icon-facebook"></span></a></li>
										<li class="ftco-animate"><a href="#"><span
												class="icon-instagram"></span></a></li>
									</ul>
									<div class="meta">
										<p class="mb-0">
											<a href="#">11/13/2019</a> | <a href="#">12 min read</a>
										</p>
									</div>
								</div>
							</div>
						</div>
					</div>
					<div class="case">
						<div class="row">
							<div class="col-md-6 col-lg-6 col-xl-8 d-flex">
								<a href="detail" class="img w-100 mb-3 mb-md-0"
									style="background-image: url(${pageContext.request.contextPath}/resources/homePage/images/image_6.jpg);"></a>
							</div>
							<div class="col-md-6 col-lg-6 col-xl-4 d-flex">
								<div class="text w-100 pl-md-3">
									<span class="subheading">Illustration</span>
									<h2>
										<a href="detail">title</a>
									</h2>
									<ul class="media-social list-unstyled">
										<li class="ftco-animate"><a href="#"><span
												class="icon-twitter"></span></a></li>
										<li class="ftco-animate"><a href="#"><span
												class="icon-facebook"></span></a></li>
										<li class="ftco-animate"><a href="#"><span
												class="icon-instagram"></span></a></li>
									</ul>
									<div class="meta">
										<p class="mb-0">
											<a href="#">11/13/2019</a> | <a href="#">12 min read</a>
										</p>
									</div>
								</div>
							</div>
						</div>
					</div>
					<div class="case">
						<div class="row">
							<div class="col-md-6 col-lg-6 col-xl-8 d-flex">
								<a href="detail" class="img w-100 mb-3 mb-md-0"
									style="background-image: url(${pageContext.request.contextPath}/resources/homePage/images/image_7.jpg);"></a>
							</div>
							<div class="col-md-6 col-lg-6 col-xl-4 d-flex">
								<div class="text w-100 pl-md-3">
									<span class="subheading">Illustration</span>
									<h2>
										<a href="detail">title</a>
									</h2>
									<ul class="media-social list-unstyled">
										<li class="ftco-animate"><a href="#"><span
												class="icon-twitter"></span></a></li>
										<li class="ftco-animate"><a href="#"><span
												class="icon-facebook"></span></a></li>
										<li class="ftco-animate"><a href="#"><span
												class="icon-instagram"></span></a></li>
									</ul>
									<div class="meta">
										<p class="mb-0">
											<a href="#">11/13/2019</a> | <a href="#">12 min read</a>
										</p>
									</div>
								</div>
							</div>
						</div>
					</div>
					<div class="case">
						<div class="row">
							<div class="col-md-6 col-lg-6 col-xl-8 d-flex">
								<a href="detail" class="img w-100 mb-3 mb-md-0"
									style="background-image: url(${pageContext.request.contextPath}/resources/homePage/images/image_8.jpg);"></a>
							</div>
							<div class="col-md-6 col-lg-6 col-xl-4 d-flex">
								<div class="text w-100 pl-md-3">
									<span class="subheading">Illustration</span>
									<h2>
										<a href="detail">title</a>
									</h2>
									<ul class="media-social list-unstyled">
										<li class="ftco-animate"><a href="#"><span
												class="icon-twitter"></span></a></li>
										<li class="ftco-animate"><a href="#"><span
												class="icon-facebook"></span></a></li>
										<li class="ftco-animate"><a href="#"><span
												class="icon-instagram"></span></a></li>
									</ul>
									<div class="meta">
										<p class="mb-0">
											<a href="#">11/13/2019</a> | <a href="#">12 min read</a>
										</p>
									</div>
								</div>
							</div>
						</div>
					</div>
					<div class="case">
						<div class="row">
							<div class="col-md-6 col-lg-6 col-xl-8 d-flex">
								<a href="detail" class="img w-100 mb-3 mb-md-0"
									style="background-image: url(${pageContext.request.contextPath}/resources/homePage/images/image_9.jpg);"></a>
							</div>
							<div class="col-md-6 col-lg-6 col-xl-4 d-flex">
								<div class="text w-100 pl-md-3">
									<span class="subheading">Illustration</span>
									<h2>
										<a href="detail">title</a>
									</h2>
									<ul class="media-social list-unstyled">
										<li class="ftco-animate"><a href="#"><span
												class="icon-twitter"></span></a></li>
										<li class="ftco-animate"><a href="#"><span
												class="icon-facebook"></span></a></li>
										<li class="ftco-animate"><a href="#"><span
												class="icon-instagram"></span></a></li>
									</ul>
									<div class="meta">
										<p class="mb-0">
											<a href="#">11/13/2019</a> | <a href="#">12 min read</a>
										</p>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
			<div class="row mt-5">
				<div class="col text-center">
					<div class="block-27">
						<ul>
							<li><a href="#">&lt;</a></li>
							<li class="active"><span>1</span></li>
							<li><a href="#">2</a></li>
							<li><a href="#">3</a></li>
							<li><a href="#">4</a></li>
							<li><a href="#">5</a></li>
							<li><a href="#">&gt;</a></li>
						</ul>
					</div>
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
							<a href="#">M<span>e</span>.
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
								<li><span class="icon icon-map-marker"></span><span
									class="text">address</span></li>
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

</body>
</html>



