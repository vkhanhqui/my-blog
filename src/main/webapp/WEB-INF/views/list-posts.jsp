<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>List of Posts</title>
    <link href="<c:url value="/resources/css/bootstrap.min.css" />"
          rel="stylesheet">
    <%@ page isELIgnored="false" %>
</head>
<body>
<div class="container">
    <div class="col-md-offset-1 col-md-10">
        <h3 class="text-center">Post Management</h3>
        <hr/>

        <input type="button" value="add"
               onclick="window.location.href='show'; return false;"
               class="btn btn-primary"/> <br/>
        <br/>
        <div class="panel panel-info">
            <div class="panel-heading">
                <div class="panel-title">List of Posts</div>
            </div>
            <div class="panel-body">
                <table class="table table-striped table-bordered">
                    <tr>
                        <th>title</th>
                    </tr>

                    <!-- loop over and print our Posts -->
                    <c:forEach var="tempPost" items="${posts}">

                        <!-- construct an "update" link with Post id -->
                        <c:url var="updateLink" value="/posts/update">
                            <c:param name="postId" value="${tempPost.id}"/>
                        </c:url>

                        <!-- construct an "delete" link with Post id -->
                        <c:url var="deleteLink" value="/posts/delete">
                            <c:param name="postId" value="${tempPost.id}"/>
                        </c:url>

                        <tr>
                            <td>${tempPost.title}</td>
                            <td>
                                <!-- display the update link --> <a href="${updateLink}">update</a>
                                | <a href="${deleteLink}"
                                     onclick="if (!(confirm('do you want to delete it?'))) return false">delete</a>
                            </td>
                        </tr>

                    </c:forEach>

                </table>

            </div>
        </div>
    </div>

</div>

<script src="<c:url value="/resources/js/jquery-1.11.1.min.js" />"></script>
<script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>
</body>
</html>