<%--
  Created by IntelliJ IDEA.
  User: jixiegeming
  Date: 2019/8/23
  Time: 14:58
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
    <title>注册界面</title>
</head>
<body>
<form action="register1" method="post">
   用户名： <input type="text" name="name"><br>
    密码：<input type="text" name="pass"><br>
    <input type="submit" value="注册">
</form>
</body>
</html>    