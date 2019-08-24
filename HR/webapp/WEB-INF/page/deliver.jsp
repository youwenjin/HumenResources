<%--
  Created by IntelliJ IDEA.
  User: jixiegeming
  Date: 2019/8/24
  Time: 16:16
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
    <title>投递记录</title>
</head>
<body>
简历
历史记录
</body>
</html>    