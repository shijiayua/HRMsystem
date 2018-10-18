<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/18
  Time: 10:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>员工个人信息</title>
</head>
<body>
    <table>
        <tr>
            <td>姓名</td>
            <td>${requestScope.employee.ename}</td>
            <td>性别</td>
            <td>${requestScope.employee.sex}</td>
        </tr>
        <tr>
            <td>年龄</td>
            <td>${requestScope.employee.age}</td>
            <td>学历</td>
            <td>${requestScope.employee.education}</td>
        </tr>
        <tr>
            <td>联系方式</td>
            <td>${requestScope.employee.tel}</td>
            <td>e-mail</td>
            <td>${requestScope.employee.email}</td>
        </tr>
        <tr>
            <td>职位</td>
            <td>${requestScope.employee.dept}${requestScope.employee.position}</td>
            <td>政治面貌</td>
            <td>${requestScope.employee.politic_status}</td>
        </tr>
        <tr>
            <td>入职时间</td>
            <td>${requestScope.employee.entry_time}</td>
            <td>爱好</td>
            <td>${requestScope.employee.hobble}</td>
        </tr>
    </table>
</body>
</html>
