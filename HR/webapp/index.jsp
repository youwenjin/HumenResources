<%@ page import="com.you.model.Recruit" %>
<%@ page import="com.you.service.RecruitService" %>
<%@ page import="com.you.model.Page" %>
<%@ page import="java.util.List" %>
<%@ page import="org.springframework.context.ApplicationContext" %>
<%@ page import="org.springframework.context.support.ClassPathXmlApplicationContext" %>
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
    <script type="text/javascript" src="js/index.js"></script>
    <script src="js/jquery-1.7.2.js"></script>
</head>
<body>
<c:if test="${!empty register}">
    <script>
        alert("注册成功")
    </script>
</c:if>

    <%
        ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
        RecruitService recruitService= (RecruitService) context.getBean("recruitServiceImpl");

        Page<Recruit> recruitPage= (Page<Recruit>) request.getAttribute("recruitPage");
        if(recruitPage==null){
            recruitPage=recruitService.getRecruitByPage(1);
        }
        if(recruitPage.getList()!=null&&recruitPage.getList().size()!=0){
            for (Recruit rec : recruitPage.getList()) {
    %>




    <span><a href="register">游客注册</a></span>
    <span><a href="login">登录</a></span>
<table>
    <tr>
        <td>职位</td>
        <td>主题</td>
        <td>职位描述</td>
        <td>发布时间</td>
        <td>地址</td>
        <td>薪水</td>
        <td>联系人</td>
    </tr>
    <tr>
        <td><%=rec.getP_id()%></td>
        <td><%=rec.getT_title()%></td>
        <td><%=rec.getT_introduaction()%></td>
        <td><%=rec.getT_publish_time()%></td>
        <td><%=rec.getT_address()%></td>
        <td><%=rec.getT_salary()%></td>
        <td><%=rec.getE_id()%></td>
    </tr>
    <%
        }
    }else {
    %>
    <tr><td colspan="7">暂无招聘信息</td></tr>
    <%
        }
    %>
</table>

<div class="div4">
    <span>共 <%=recruitPage.getTotalPage()%> 页</span>
    <span>当前在第 <%=recruitPage.getPageNo()%> 页</span>
    <span><a href="recruit?pageNo=1">首页</a></span><%--相当于 <from method="get"  action="good" > name属性=pageNo--%>
    <span><a href="recruit?pageNo=<%=recruitPage.getPrevPage()%>">上一页</a></span>
    <span><a href="recruit?pageNo=<%=recruitPage.getNextPage()%>">下一页</a></span>
    <span><a href="recruit?pageNo=<%=recruitPage.getTotalPage()%>">尾页</a></span>

    <form action="recruit"  onsubmit="return checkNum(this.children[1].value)">
        <span>跳转到</span><input size="1" style="display: inline-block ;width: 40px" name="pageNo" type="number" min=1
                               max=<%= recruitPage.getTotalPage()%>>
        <input id="a" type="submit" value="跳转"  >
    </form>
</div>
</body>
</html>    