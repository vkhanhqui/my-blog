
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
 
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Upload One File</title>
<%@ page isELIgnored="false"%>
</head>
<body>
     
    <h3>Upload One File:</h3>
 
    <!-- MyUploadForm -->
    <form:form modelAttribute="myUploadForm" method="POST"
                        action="" enctype="multipart/form-data">

             
        File to upload: <form:input path="fileDatas" type="file"/><br />  
         
           
        <input type="submit" value="Upload">
         
    </form:form>
     
</body>
 
</html>