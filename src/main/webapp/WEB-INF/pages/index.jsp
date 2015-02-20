<%--
  Created by IntelliJ IDEA.
  User: max
  Date: 16/02/15
  Time: 21:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8"/>
    <title>Login</title>
    <meta name="author" content="Max"/>
    <meta name="description" content="JSP and AJAX demo"/>
    <meta name="keywords" content="JSP, AJAX, jQuery"/>

    <link rel="icon" type="img/ico" href="favicon.ico">

    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>

    <script src="res/js/jquery-2.1.3.js"></script>
    <script src="res/js/basic.js"></script>
    <link rel="stylesheet" href="res/css/basic.css" type="text/css" media="screen"/>
</head>
<body>

<p class="large">How to make AJAX calls using JSP and jQuery</p>

<form id="updateUsername">
    <label for="username">What is your name?</label>
    <input type="text" id="username" name="username"/>
    <input type="submit"/>
</form>
<p id="displayName"></p>
<hr/>
<p class="small">Tutorial by JavaGeek: www.javageek.ru</p>


<%--<%--%>
<%--String name = request.getParameter("name");--%>
<%--if(!name.isEmpty()) {--%>
<%--pageContext.setAttribute("name", name, PageContext.SESSION_SCOPE);--%>
<%--}--%>
<%--%>--%>
<%--<%= pageContext.getAttribute("name", PageContext.SESSION_SCOPE)%>--%>
</body>
</html>
