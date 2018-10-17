<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/17
  Time: 14:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="/js/jquery-1.10.2.min.js"></script>
    <script type="text/javascript">
        $(function () {
            $(".cbtu").click(function () {
                $(".cdiv").css("display","block")
            });
        });
    </script>
</head>
<body>
<table border="1" cellpadding="1" cellspacing="1">
    <form action="${pageContext.request.contextPath}/user/feedback" method="post">
        <tr>
            <td>姓名</td>
            <td><input type="text" name="name" ><${requestScope.resume.name}/td>
            <td>年龄</td>
            <td><input type="text" name="age">${requestScope.resume.age}</td>
        </tr>
        <tr>
            <td>性别</td>
            <td><input type="text" name="sexy">${requestScope.resume.sex}</td>
            <td>学历</td>
            <td><select  name="education">
                <option>${requestScope.resume.education}</option>
            </select>
            </td>
        </tr>
        <tr>
            <td>联系方式</td>
            <td><input type="text" name="tel">${requestScope.resume.tel}</td>
            <td>email</td>
            <td><input type="email" name="email">${requestScope.resume.email}</td>
        </tr>
        <tr>
            <td>应聘职位</td>
            <td>
                <select name="application_dept" >
                    <option>${requestScope.resume.application_dept}</option>
                </select>
                <select name="application_job" >
                    <option >${requestScope.resume.application_job}</option>
                </select>
            </td>
            <td>政治面貌</td>
            <td><input type="text" name="politic_status">${requestScope.resume.politic_status}</td>
        </tr>
        <tr>
            <td>上份工作</td>
            <td><input type="text" name="last_job">${requestScope.resume.last_job}</td>
            <td>工作经验</td>
            <td><input type="text" name="experience">${requestScope.resume.experience}</td>
        </tr>
        <tr>
            <td>期望薪资</td>
            <td><input type="text" name="expected_salary">${requestScope.resume.expected_salary}</td>
            <td>兴趣爱好</td>
            <td><input type="text" name="hobby">${requestScope.resume.hobby}</td>
        </tr>
        <tr>
            <td><input type="submit" name="submit" value="面试" class="cbtu"></td>
            <td></td>
            <td><button><a href="${pageContext.request.contextPath}/user/login">返回</a></button></td>
            <td></td>
        </tr>
        <div class="cdiv" style="display: none">
            <input type="datetime" name="consulttime">
        </div>
    </form>
</table>
</body>
</html>
