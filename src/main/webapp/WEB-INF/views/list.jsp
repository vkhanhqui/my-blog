<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="tg" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <title>List</title>
    <jsp:include page="headerList.jsp"/>
    <meta charset="utf-8">
    <meta name="viewport"
          content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <%@ page isELIgnored="false" %>
</head>
<body>

<nav
        class="navbar px-md-0 navbar-expand-lg navbar-dark ftco_navbar bg-dark ftco-navbar-dark"
        id="ftco-navbar">
    <div class="container">
        <button class="navbar-toggler" type="button" data-toggle="collapse"
                data-target="#ftco-nav" aria-controls="ftco-nav"
                aria-expanded="false" aria-label="Toggle navigation">
            <span class="oi oi-menu"></span> Menu
        </button>

        <div class="collapse navbar-collapse" id="ftco-nav">
            <ul class="navbar-nav ml-auto">
                <li class="nav-item active"><a href="/vkhanhqui_myblog_war/" class="nav-link">Home</a></li>
                <li class="nav-item"><a href="list" class="nav-link">Blogs</a></li>
                <li class="nav-item"><a href="contact" class="nav-link">Contact</a></li>
                <li class="nav-item"><a href="login" class="nav-link">Admin-login</a></li>
            </ul>
        </div>
    </div>
</nav>
<!-- END nav -->

<section class="ftco-section bg-light" id="content">
    <div class="container">
        <%--        --%>
        <jsp:useBean id="pagedListHolder" scope="request"
                     type="org.springframework.beans.support.PagedListHolder"/>
        <c:url value="/list" var="pagedLink">
            <c:param name="p" value="~"/>
        </c:url>
        <%--     /   --%>
        <div class="row d-flex">
            <%--				--%>
            <c:forEach var="post" items="${pagedListHolder.pageList}">

                <div class="col-md-4 d-flex ftco-animate">
                    <div
                            class="blog-entry justify-content-end">
                        <a href="detail" class="block-20"
                           style="background-image: url('<c:url value="${post.images}"/>');">
                        </a>
                        <div class="text p-4 float-right d-block">
                            <div class="topper d-flex align-items-center">
                                <div class="one py-2 pl-3 pr-1 align-self-stretch">
                                    <span class="day">${post.date.day}</span>
                                </div>
                                <div class="two pl-0 pr-3 py-2 align-self-stretch">
                                    <span class="yr">${post.date.year}</span> <span
                                        class="mos">${post.date.month}</span>
                                </div>
                            </div>
                            <h3 class="heading mb-3">
                                <a href="#">${post.title}</a>
                            </h3>
                            <p>${post.content}</p>
                            <p>
                                <a href="#" class="btn-custom"><span
                                        class="ion-ios-arrow-round-forward mr-3"></span>Read more</a>
                            </p>
                        </div>
                    </div>
                </div>

            </c:forEach>
            <%--		/		--%>
        </div>
        <div class="row mt-5">
            <div class="col text-center">
                <div class="block-27">
                    <ul>
                        <li><a href="#">&lt;</a></li>
                        <%--                        --%>
                        <c:forEach var="i" begin="1" end="${pagedListHolder.pageCount}">
                            <c:choose>
                                <c:when test="${i==1}">
                                    <li class="paging-items active"><span><a href="#">${i}</a></span></li>
                                </c:when>
                                <c:otherwise>
                                    <li class="paging-items"><a href="#">${i}</a></li>
                                </c:otherwise>
                            </c:choose>
                        </c:forEach>
                        <%--             /           --%>
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
                           style="background-image: url(<c:url value="/resources/homePage/images/image_1.jpg"/>);"></a>
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
                           style="background-image: url(<c:url value="/resources/homePage/images/image_2.jpg"/>);"></a>
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
                                class="ion-ios-arrow-forward mr-3"></span>Blogs</a></li>
                        <li><a href="#" class="py-1 d-block"><span
                                class="ion-ios-arrow-forward mr-3"></span>Contact</a></li>
                        <li><a href="#" class="py-1 d-block"><span
                                class="ion-ios-arrow-forward mr-3"></span>Sign up/Log in</a></li>
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
        src="<c:url value="/resources/homePage/js/jquery.min.js" />"></script>
<script
        src="<c:url value="/resources/homePage/js/jquery-migrate-3.0.1.min.js" />"></script>
<script
        src="<c:url value="/resources/homePage/js/popper.min.js" />"></script>
<script
        src="<c:url value="/resources/homePage/js/bootstrap.min.js" />"></script>
<script
        src="<c:url value="/resources/homePage/js/jquery.easing.1.3.js" />"></script>
<script
        src="<c:url value="/resources/homePage/js/jquery.waypoints.min.js" />"></script>
<script
        src="<c:url value="/resources/homePage/js/jquery.stellar.min.js" />"></script>
<script
        src="<c:url value="/resources/homePage/js/owl.carousel.min.js" />"></script>
<script
        src="<c:url value="/resources/homePage/js/jquery.magnific-popup.min.js" />"></script>
<script
        src="<c:url value="/resources/homePage/js/aos.js" />"></script>
<script
        src="<c:url value="/resources/homePage/js/jquery.animateNumber.min.js" />"></script>
<script
        src="<c:url value="/resources/homePage/js/scrollax.min.js" />"></script>
<script
        src="<c:url value="/resources/homePage/js/main.js" />"></script>
<script
        src="<c:url value="/resources/homePage/js/backtotop.js" />"></script>
<script
        src="<c:url value="/resources/homePage/js/custom.js" />"></script>
</body>
</html>