<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Confirmation</title>
</head>
<body>
    Hello, ${loginedUser.name}!
    <br><br>
    <a href="/"> Return to Login Form</a>
</body>
</html>
