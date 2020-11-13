<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>My Notes</title>
    </head>
    <body>
        <<h1>Welcome ${email}</h1>
        <h2>Admin Functionality...</h2>
        <p>
            <a href="<c:url value='login?logout'/>">Log out</a>
        </p>
    </body>
</html>
