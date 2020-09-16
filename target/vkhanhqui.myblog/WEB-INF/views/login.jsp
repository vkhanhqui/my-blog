<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Đăng nhập</title>
    <%@ page isELIgnored="false"%>
</head>
<body>
<div class="container">
    <div class="col-md-12">
        <div class="panel panel-info">
            <div class="panel-heading">
                <div class="panel-title">
                    <legend>Vui lòng đăng nhập</legend>
                    <c:if test="${not empty error}">
                        <div class="alert alert-danger">
                            <spring:message code="AbstractUserDetailsAuthenticationProvider.badCredentials"/>
                            <br/>
                        </div>
                    </c:if>
                </div>
            </div>
            <div class="panel-body">
                <form action="postLogin" method="post">
                    <div class="form-group">
                        <input class="form:input-large" placeholder="User Name"
                               name='username' type="text">
                    </div>
                    <div class="form-group">
                        <input class=" form:input-large" placeholder="Password"
                               name='password' type="password" value="">
                    </div>
                    <input class="btn" type="submit" value="Đăng nhập">
                </form>
            </div>
        </div>
    </div>
</div>
</body>
</html>