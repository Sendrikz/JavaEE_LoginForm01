<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<html>
<head>
    <title>Form</title>
</head>
<body>
    <form:form action="processForm" modelAttribute="user">
        Login: <form:input path="login"/>
        <br><br>
        Password: <form:input path="password"/>
        <br><br>
        <input type="submit" value="Submit"/>
    </form:form>

    <!-- Option if invalid -->
    <c:choose>
        <c:when test="${successfulLogin == 'no'}">
            <script>
                alert("Invalid login or password");
            </script>
        </c:when>
    </c:choose>
</body>
</html>
