<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Information</title>
    <link href="<c:url value="/resources/css/bootstrap.min.css" />"
          rel="stylesheet">
</head>
<body>
<div class="container">
    <div class="col-md-offset-2 col-md-7">
        <h3 class="text-center">Post Management</h3>
        <div class="panel panel-info">
            <div class="panel-heading">
                <div class="panel-title">add</div>
            </div>
            <div class="panel-body">
                <form:form action="save" cssClass="form-horizontal"
                           method="post" modelAttribute="post">

                    <!-- need to associate this data with post id -->
                    <form:hidden path="id"/>

                    <div class="form-group">
                        <label for="title" class="col-md-3 control-label">title</label>
                        <div class="col-md-9">
                            <form:input path="title" cssClass="form-control"/>
                        </div>
                    </div>

                    <div class="form-group">
                        <!-- Button -->
                        <div class="col-md-offset-3 col-md-9">
                            <button type="submit" class="btn btn-primary">save</button>
                        </div>
                    </div>

                </form:form>
            </div>
        </div>
    </div>
</div>

<script src="<c:url value="/resources/js/jquery-1.11.1.min.js" />"></script>
<script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>
</body>
</html>