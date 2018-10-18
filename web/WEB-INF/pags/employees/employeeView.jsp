<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/17
  Time: 16:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>员工界面</title>
</head>
<body>
    当前用户：${sessionScope.employee.name}
    <a href="/employee/persondetails?name=${sessionScope.employee.name}">个人信息</a>
    <a href="">我的考勤</a>
    <a>我的奖惩</a>
    <a>部门职位</a>
    <a>我的薪资</a>
    <a>其他</a>
    <a>退出</a>
    <button>上班打卡</button>
    <button>下班打卡</button>
</body>
</html>
