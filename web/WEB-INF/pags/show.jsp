<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/12
  Time: 13:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <a>反馈</a>
    <a href="${pageContext.request.contextPath}/user/addresume">添加简历</a>
    <a href="${pageContext.request.contextPath}/user/showresume">查看简历</a>
    <a href="${pageContext.request.contextPath}/user/editpass">修改密码</a>
    <a href="${pageContext.request.contextPath}/user/editResume">修改简历</a>
    <a href="${pageContext.request.contextPath}/user/showAllRecuit">查看招聘信息</a>
    <a>其他</a>
    <a>退出</a>
</body>
</html>
