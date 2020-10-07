<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

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
          href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.7.2/css/all.min.css"/>
    <!-- google font -->
    <link href="https://fonts.googleapis.com/css?family=Candal|Lora"
          rel="stylesheet">
    <!-- custom style -->
    <link rel="stylesheet" href="<c:url value="/resources/css/style.css" />">
    <!-- back to top -->
    <link rel="stylesheet"
          href="<c:url value="/resources/css/backtotop.css" />">

    <title>Single Post</title>
    <%@ page isELIgnored="false" %>
</head>

<body>
<!-- header -->
<header>
    <div class="logo">
        <h1 class="logo-text">
            <a href="/vkhanhqui_myblog_war_exploded/"><span>Khanh</span>Qui</a>
        </h1>
    </div>
    <i class="fa fa-bars menu-toggle"></i>
    <ul class="nav">
        <li><a href="/vkhanhqui_myblog_war_exploded/">Home</a></li>
        <li><a href="/vkhanhqui_myblog_war_exploded/list/1">Posts</a></li>
        <li><a href="/vkhanhqui_myblog_war_exploded/contact">About</a></li>
        <c:choose>
            <c:when test="${username==null}">
                <li><a href="/vkhanhqui_myblog_war_exploded/sign-in">Sign in/Sign
                    up</a></li>
            </c:when>
            <c:otherwise>
                <li><a href="#"> <i class="fa fa-user"></i> ${username} <i
                        class="fa fa-chevron-down" style="font-size: .8em;"></i>
                </a>
                    <ul>
                        <li><a href="/vkhanhqui_myblog_war_exploded/${role}/posts/index">Dashboard</a></li>
                        <li><a href="/vkhanhqui_myblog_war_exploded/sign-in/logout"
                               class="logout">Logout</a></li>
                    </ul>
                </li>
            </c:otherwise>
        </c:choose>
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
            <%--		comment		--%>
            <c:if test="${comments.size()>0}">
                <div class="articlePostCommentContain">
                    <h4 class="headTitle">Comments</h4>
                        <%--				--%>
                    <div class="articleComments">
                        <div class="articleComment">
                            <c:forEach var="parent" items="${comments}">

                                <div class="articleCommentContain">
                                    <div class="articleCommentImg">
                                        <img src="<c:url value="/resources/images/user.png"/>"
                                             alt="articleCommentImg">
                                    </div>
                                    <div class="articleCommentBody">
                                        <h4 class="articleCommentName">${parent.creator}</h4>
                                        <h6 class="articleCommentTime">
                                            <i class="fa fa-clock-o"></i>
                                                ${parent.date}
                                        </h6>
                                        <p class="articleCommentContent">${parent.content}</p>
                                    </div>
                                    <div class="articleReplyBtn">
                                        <i class="fa fa-reply"></i>
                                    </div>
                                </div>
                                <c:choose>
                                    <c:when test="${parent.children.size()>0}">
                                        <c:forEach var="child" items="${parent.children}">
                                            <div class="articleSubComments">
                                                <div class="articleSubComment">
                                                    <div class="articleCommentImg">
                                                        <img src="<c:url value="/resources/images/user.png"/>"
                                                             alt="articleCommentImg">
                                                    </div>
                                                    <div class="articleCommentBody">
                                                        <h4 class="articleCommentName">${child.creator}</h4>
                                                        <h6 class="articleCommentTime">
                                                            <i class="fa fa-clock-o"></i>
                                                                ${child.date}
                                                        </h6>
                                                        <p class="articleCommentContent"><span
                                                                style="background-color: #a3bde3">@${child.replyTo}:</span> ${child.content}
                                                        </p>
                                                    </div>
                                                    <div class="articleReplyBtn">
                                                        <i class="fa fa-reply"></i>
                                                    </div>
                                                </div>
                                            </div>
                                        </c:forEach>
                                        <c:if test="${username!=null}">
                                            <div class="articleSubComments">
                                                <div class="articleSubComment">
                                                    <div class="articleCommentImg">
                                                        <img src="<c:url value="/resources/images/user.png"/>"
                                                             alt="articleCommentImg">
                                                    </div>
                                                    <div class="articleCommentBody">
                                                        <h4 class="articleCommentName">${username}</h4>
                                                        <form action="/vkhanhqui_myblog_war_exploded/comments/${post.id}/${parent.id}/reply"
                                                              class="formComment" method="post">
					                            <textarea class="txtInp" name="reply" cols="100" rows="2"
                                                          placeholder="Message">
					                            </textarea>
                                                            <button class="btnComment"><i class="fas fa-reply"></i>
                                                                Reply
                                                            </button>
                                                        </form>
                                                    </div>
                                                </div>
                                            </div>
                                        </c:if>
                                    </c:when>
                                    <c:otherwise>
                                        <c:if test="${username!=null}">
                                            <div class="articleSubComments">
                                                <div class="articleSubComment">
                                                    <div class="articleCommentImg">
                                                        <img src="<c:url value="/resources/images/user.png"/>"
                                                             alt="articleCommentImg">
                                                    </div>
                                                    <div class="articleCommentBody">
                                                        <h4 class="articleCommentName">${username}</h4>
                                                        <form action="/vkhanhqui_myblog_war_exploded/comments/${post.id}/${parent.id}/reply"
                                                              class="formComment" method="post">
					                            <textarea class="txtInp" name="reply" cols="100" rows="2"
                                                          placeholder="Message">
					                            </textarea>
                                                            <button class="btnComment"><i class="fas fa-reply"></i>
                                                                Reply
                                                            </button>
                                                        </form>
                                                    </div>
                                                </div>
                                            </div>
                                        </c:if>
                                    </c:otherwise>
                                </c:choose>
                            </c:forEach>
                        </div>
                    </div>
                        <%--		/		--%>
                </div>
            </c:if>
            <%--			/comment	--%>
            <div class="articlePostCommentForm">
                <h4>Create Comment</h4>
                <form action="/vkhanhqui_myblog_war_exploded/comments/${post.id}" class="formComment" method="post">
						<textarea class="txtInp" name="comment" cols="30" rows="10" placeholder="Message...">
                            </textarea>
                    <button class="btnComment"><i class="fas fa-comment"></i> Comment</button>
                </form>
            </div>
        </div>
        <!-- /main content -->
        <!-- sidebar -->
        <div class="sidebar single">
            <div class="section">
                <h2 class="section-title">Search</h2>
                <form action="/vkhanhqui_myblog_war_exploded/keywords/" method="post">

                    <input type="text" class="text-input" name="keywords"
                           placeholder="Search..."/>
                    <div>
                        <button type="submit" name="register-btn" class="btn btn-big">Find</button>
                    </div>
                </form>
            </div>

            <div class="section popular">
                <h2 class="section-title">Popular</h2>
                <c:forEach var="one" items="${mostViewed}">
                    <div class="post clearfix">
                        <a href="/vkhanhqui_myblog_war_exploded/single/${one.id}"> <img
                                src="<c:url value="${one.thumbnail}"/>" alt="" class="post-image">
                        </a> <a href="/vkhanhqui_myblog_war_exploded/single/${one.id}" class="title">
                        <h4>${one.title}</h4></a>
                    </div>
                </c:forEach>
            </div>

            <div class="section topics">
                <h2 class="section-title">Categories</h2>
                <ul>
                    <c:forEach var="one" items="${listOfCategories}">
                        <li><a href="/vkhanhqui_myblog_war_exploded/categories/${one.id}/1">${one.name}</a></li>
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
                <li><a href="#"> Events </a></li>
                <li><a href="#"> Team </a></li>
                <li><a href="#"> Mentores </a></li>
                <li><a href="#"> Gallery </a></li>
                <li><a href="#"> Terms and Conditions </a></li>
            </ul>
        </div>
        <div class="footer-section contact-form">
            <h2>Contact us</h2>
            <br>
            <form action="#" method="get">
                <input type="email" name="email" class="text-input contact-input"
                       placeholder="Your email address...">
                <textarea name="message" class="text-input contact-input"
                          placeholder="Your message..." style="resize: none;"></textarea>
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