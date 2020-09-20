<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
     
<html>
<head>
<meta charset="UTF-8">
<title>Upload Result</title>
<%@ page isELIgnored="false"%>
</head>
<body>
    
    <h3>Uploaded Files:</h3>

     
    <c:forEach items="${uploadedFiles}" var="file">
           - ${file} <br>
    </c:forEach>
 
</body>
</html>