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
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.7.2/css/all.min.css" />
<!-- google font -->
<link href="https://fonts.googleapis.com/css?family=Candal|Lora"
	rel="stylesheet">
<!-- custom style -->
<link rel="stylesheet" href="<c:url value="/resources/css/admin.css" />">
    <title>Alter Users</title>
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
							<li><a href="/vkhanhqui_myblog_war/admin/posts/index">Dashboard</a></li>
							<li><a href="/vkhanhqui_myblog_war/sign-in/logout"
								class="logout">Logout</a></li>
						</ul></li>
				</c:otherwise>
			</c:choose>
		</ul>
	</header>
	<!-- /header -->
<!-- admin page wrapper -->
<div class="admin-wrapper">
    <div class="left-sidebar">
        <ul>
            <li><a href="/vkhanhqui_myblog_war/admin/posts/index">Manage Posts</a></li>
            <li><a href="/vkhanhqui_myblog_war/admin/users/index">Manage Users</a></li>
        </ul>
    </div>

    <div class="admin-content">
        <div class="button-group">
				<a href="/vkhanhqui_myblog_war/admin/users/create" class="btn btn-big">Add User</a> <a
					href="/vkhanhqui_myblog_war/admin/users/index" class="btn btn-big">Manage Users</a>
			</div>

        <div class="content">
            <h2 class="page-title">Alter User</h2>
            ${message}
            <form action="/vkhanhqui_myblog_war/admin/users/alter/${userId}" method="post">
                <div>
                    <label>Email</label>
                    <input type="text" name="email" class="text-input">
                </div>
                <div>
                    <label>Password</label>
                    <input type="password" name="password" class="text-input">
                </div>
                <div>
                    <label>Password Confirmation</label>
                    <input type="password" name="passwordConfirmation" class="text-input">
                </div>
                <div>
                    <label>Add Role</label>
                    <select name="role" class="text-input">
                        <option value="MEMBER">MEMBER</option>
                        <option value="ADMIN">ADMIN</option>
                    </select>
                </div>
                <div>
                    <button type="submit" class="btn btn-big">Alter User</button>
                </div>

            </form>
        </div>
    </div>
</div>
<!-- /admin page wrapper -->



	<!-- jquery -->
	<script src="<c:url value="/resources/js/jquery-3.2.1.min.js"/>"></script>
	<!-- custom js -->
	<script src="<c:url value="/resources/js/custom.js"/>"></script>
</body>

</html>