<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/12
  Time: 13:44
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
        <td>个人简历</td>
        </tr>
        <form action="save" method="post">
            <tr>
                <td>姓名</td>
                <td><input type="text" name="name"></td>
                <td>年龄</td>
                <td><input type="text" name="age"></td>
            </tr>
            <tr>
                <td>性别</td>
                <td><input type="text" name="sex"></td>
                <td>学历</td>
                <td><select  name="education">
                    <option value="1">小学</option>
                    <option value="2">初中</option>
                    <option value="3">高中</option>
                    <option value="4">本科</option>
                    <option value="5">研究生</option>
                </select>
                </td>
            </tr>
            <tr>
                <td>联系方式</td>
                <td><input type="text" name="tel"></td>
                <td>email</td>
                <td><input type="email" name="email"></td>
            </tr>
            <tr>
                <td>应聘职位</td>
                <%--待解决二级联动--%>
                <td>部门职位</td>
                <td>政治面貌</td>
                <td><input type="email" name="politic_status"></td>
            </tr>
            <tr>
                <td>上份工作</td>
                <td><input type="text" name="last_job"></td>
                <td>工作经验</td>
                <td><input type="email" name="experience"></td>
            </tr>
            <tr>
                <td>期望薪资</td>
                <td><input type="text" name="expected_salary"></td>
                <td>兴趣爱好</td>
                <td><input type="email" name="hobby"></td>
            </tr>
            <tr>
                <td><input type="submit" name="submit" value="保存"></td>
                <td></td>
                <td><button><a href="show.jsp">返回</a></button></td>
                <td></td>
            </tr>
        </form>
    </table>
</body>
</html>
