<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/17
  Time: 13:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <table>
        <tr>
            <td>序号</td>
            <td>应聘者</td>
            <td>投递时间</td>
            <td>查看状态</td>
            <td>面试状态</td>
            <td>查看</td>
            <td>删除</td>
        </tr>
        <c:forEach items="${requestScope.delRecords}" var="delRecords">
            <tr>
                <td>${delRecords.rid}</td>
                <td>${delRecords.interviewer}</td>
                <td>${delRecords.deliver_time}</td>
                <td>${delRecords.look_staus}</td>
                <td>${delRecords.interview_staus}</td>
                <td href="${pageContext.request.contextPath}/manger/consult?name=${delRecords.interviewer}">查看</td>
                <td href="">删除</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
