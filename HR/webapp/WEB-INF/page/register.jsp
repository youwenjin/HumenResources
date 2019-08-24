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
    <script type="text/javascript"></script>
    <script>
        function check_password() {
            if ($("#pass").val() != $("#pass1").val()){
                alert("请保证两次输入密码的一致性！");
                $("#pass1").focus();
            }
        }
    </script>
</head>
<body>
<form action="register1" method="post">
    请输入姓名：<input type="text" name="name"><br>
    请输入密码：<input  type="password" name="pass"><br>
    请确认密码：<input  type="password" name="pass1"><br>
    <input type="submit" value="注册">
</form>
</body>
</html>    