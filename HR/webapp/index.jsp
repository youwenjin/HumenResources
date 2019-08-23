<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: jixiegeming
  Date: 2019/8/22
  Time: 14:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<head>
    <base href="<%=basePath%>"/>
    <title>主页</title>
    <script src="js/jquery.js"></script>
</head>
<body>
<c:if test="${!empty register}">
    <script>
        alert("注册成功")
    </script>
</c:if>

    <span><a href="register">游客注册</a></span>
    <span><a href="login">登录</a></span>
    <span><a></a></span>

</body>
</html>    