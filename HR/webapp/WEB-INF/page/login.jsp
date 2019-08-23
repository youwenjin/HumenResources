<%--
  Created by IntelliJ IDEA.
  User: jixiegeming
  Date: 2019/8/23
  Time: 15:41
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
    <title>欢迎登录</title>
</head>
<body>
<form action="login1" method="post">
    账号：<input type="text" name="name"><br>
    密码：<input type="text" name="pass"><br>
    <input type="submit" value="登录">
</form>

</body>
</html>    