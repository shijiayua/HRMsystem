<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.10.2.min.js"></script>
    <script type="text/javascript">
       $(function () {
           $("#dept").change(function () {
               var dept_id = $(this).val();
                   $.ajax({
                       url:"${pageContext.request.contextPath}/user/queryjob",
                       type:"post",
                       data:{
                           "id":dept_id
                       },
                       success:function (data){
                           for (var i = 0; i < data.length; i++) {
                               var jid= data[i].id
                               var tt="<option  value='jid'>" + data[i].job_name+ "</option>";
                               alert(tt);
                               $("#jobtext").append(tt);
                           }
                       }
                   });
           });
       })
    </script>
</head>
<body>
    <table border="1" cellpadding="1" cellspacing="1">
       <tr>
        <td style="text-align: center">个人简历</td>
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
                    <option value="小学">小学</option>
                    <option value="初中">初中</option>
                    <option value="高中">高中</option>
                    <option value="本科">本科</option>
                    <option value="研究生">研究生</option>
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
                <td>
                    <select name="application_dept" id="dept">
                        <option>--部门--</option>
                        <c:forEach items="${requestScope.departments}" var="department">
                            <option id="gt">${department.dept_name}</option>
                        </c:forEach>
                    </select>
                    <select name="application_job" id="jobtext">
                        <option id="gt2">--职位--</option>
                    </select>
                </td>
                <td>政治面貌</td>
                <td><input type="text" name="politic_status"></td>
            </tr>
            <tr>
                <td>上份工作</td>
                <td><input type="text" name="last_job"></td>
                <td>工作经验</td>
                <td><input type="text" name="experience"></td>
            </tr>
            <tr>
                <td>期望薪资</td>
                <td><input type="text" name="expected_salary"></td>
                <td>兴趣爱好</td>
                <td><input type="text" name="hobby"></td>
            </tr>
            <tr>
                <td><input type="submit" name="submit" value="保存"></td>
                <td></td>
                <td><button><a href="${pageContext.request.contextPath}/user/login/">返回</a></button></td>
                <td></td>
            </tr>
        </form>
    </table>
</body>
</html>
