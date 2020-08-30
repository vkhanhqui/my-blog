<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <title>Login</title>

    <jsp:include page="headerLogin.jsp"/>

    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
</head>
<body>

<div class="limiter">
    <div class="container-login100"
         style="background-image: url('<c:url value="/resources/loginPage/images/bg-01.jpg"/>');">
        <div class="wrap-login100 p-t-30 p-b-50">
            <span class="login100-form-title p-b-41"> Admin Login </span>
            <form class="login100-form validate-form p-b-33 p-t-5" method='post'>

                <div class="wrap-input100 validate-input"
                     data-validate="Enter username">
                    <input class="input100" type="text" name="username"
                           placeholder="User name"> <span class="focus-input100"
                                                          data-placeholder="&#xe82a;"></span>
                </div>

                <div class="wrap-input100 validate-input"
                     data-validate="Enter password">
                    <input class="input100" type="password" name="password"
                           placeholder="Password"> <span class="focus-input100"
                                                         data-placeholder="&#xe80f;"></span>
                </div>

                <div class="container-login100-form-btn m-t-32">
                    <button class="login100-form-btn">Login</button>
                </div>

            </form>
        </div>
    </div>
</div>


<div id="dropDownSelect1"></div>

<!--===================================import js============================================================-->
<script
        src="<c:url value="/resources/js/jquery-3.2.1.min.js" />"></script>
<!--===============================================================================================-->
<script
        src="<c:url value="/resources/loginPage/vendor/animsition/js/animsition.min.js" />"></script>
<!--===============================================================================================-->
<script
        src="<c:url value="/resources/js/popper.js" />"></script>
<script
        src="<c:url value="/resources/js/bootstrap.min.js" />"></script>
<!--===============================================================================================-->
<script
        src="<c:url value="/resources/loginPage/vendor/select2/select2.min.js" />"></script>
<!--===============================================================================================-->
<script
        src="<c:url value="/resources/loginPage/vendor/daterangepicker/moment.min.js" />"></script>
<script
        src="<c:url value="/resources/loginPage/vendor/daterangepicker/daterangepicker.js" />"></script>
<!--===============================================================================================-->
<script
        src="<c:url value="/resources/loginPage/vendor/countdowntime/countdowntime.js" />"></script>
<!--===============================================================================================-->
<script
        src="<c:url value="/resources/loginPage/js/main.js" />"></script>

<!--=====================================end import js==========================================================-->

</body>
</html>