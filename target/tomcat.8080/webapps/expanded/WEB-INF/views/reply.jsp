<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <title>Reply</title>
    <meta charset="utf-8">
    <meta name="viewport"
          content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <%@ page isELIgnored="false" %>
</head>
<body>

<section class="ftco-section ftco-degree-bg" id="content" style="padding: 0">
    <div class="container">
        <div class="row">
            <div class="col-lg-8 ftco-animate" style="padding-top: 0">
                <div class="pt-5 mt-5" style="margin-top: 0 !important; padding-top: 0 !important">
                    <div class="comment-form-wrap pt-5" style="padding-top: unset">
                        <h3 class="mb-5" style="padding-top: 0;text-align: center">Reply a comment</h3>
                        <form:form modelAttribute="reply" method="post"
                                   action="/detail/comments/reply/${parent.id}"
                                   class="p-5 bg-light">
                            <!-- need to associate this data with comment id -->
                            <span>Reply To:<span style="padding-left: 1em">${parent.creator}</span></span><br>
                            <form:hidden path="id"/>
                            <div class="form-group">
                                <form:label path="creator">Name *</form:label> <form:input type="text"
                                                                                           class="form-control"
                                                                                           path="creator"/>
                            </div>
                            <div class="form-group">
                                <form:label path="content">Content *</form:label>
                                <form:textarea path="content" cols="30" rows="10"
                                               class="form-control"/>
                            </div>
                            <div class="form-group">
                                <input type="submit" value="Reply Comment"
                                       class="btn py-3 px-4 btn-primary">
                            </div>
                        </form:form>
                    </div>
                </div>
            </div>
        </div>
    </div>
</section>
<!-- .section -->



</body>
</html>