<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

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
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.7.2/css/all.min.css"/>
    <!-- google font -->
    <link href="https://fonts.googleapis.com/css?family=Candal|Lora" rel="stylesheet">
    <!-- custom style -->
    <link rel="stylesheet" href="<c:url value="/resources/css/style.css" />">

    <title>Sign up</title>
    <%@ page isELIgnored="false" %>
</head>

<body>
<!-- header -->
<header>
    <div class="logo">
        <h1 class="logo-text"><a href="/vkhanhqui_myblog_war/"><span>Khanh</span>Qui</a></h1>
    </div>
    <i class="fa fa-bars menu-toggle"></i>
    <ul class="nav">
        <li><a href="/vkhanhqui_myblog_war/">Home</a></li>
        <li><a href="/vkhanhqui_myblog_war/list/1">Posts</a></li>
        <li><a href="/vkhanhqui_myblog_war/contact">About</a></li>
        <li><a href="/vkhanhqui_myblog_war/login">Sign in/Sign up</a></li>
        <li>
            <a href="#">
                <i class="fa fa-user"></i>
                Khanh Qui
                <i class="fa fa-chevron-down" style="font-size: .8em;"></i>
            </a>
            <ul>
                <li><a href="#">Dashboard</a></li>
                <li><a href="#" class="logout">Logout</a></li>
            </ul>
        </li>
    </ul>
</header>
<!-- /header -->

<div class="auth-content">
    <form:form action="#" modelAttribute="member" method="post">
        <h2 class="form-title">Sign up</h2>

        <!--    <div class="msg success">
               <li>Username required</li>
           </div> -->

        <div>
            <label>Username</label>
            <form:input type="text" name="username" class="text-input" path="username" />
        </div>
        <div>
            <label>Email</label>
            <form:input type="text" name="email" class="text-input" path="email" />
        </div>
        <div>
            <label>Password</label>
            <form:input type="password" name="password" class="text-input" path="password" />
        </div>
<%--        <div>--%>
<%--            <label>Password Confirmation</label>--%>
<%--            <form:input type="password" name="passwordConfirmation" class="text-input" />--%>
<%--        </div>--%>
        <div>
            <button type="submit" name="register-btn" class="btn btn-big">Register</button>
        </div>
        <p>Or <a href="/vkhanhqui_myblog_war/sign-in">Sign In</a></p>
    </form:form>
</div>

<!-- jquery -->
<script src="<c:url value="/resources/js/jquery-3.2.1.min.js"/>"></script>
<!-- custom js -->
<script src="<c:url value="/resources/js/custom.js"/>"></script>
</body>

</html>