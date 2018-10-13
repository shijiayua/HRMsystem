<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/13
  Time: 14:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript">
        $(function () {
            $("#deliver").click(function () {
                $.ajax({
                    url:"tecuitRecord",
                    data:{
                        id:${recuit.id},
                        name:
                    }
                })
            })
        })
    </script>
</head>
<body>
    <table border="1" cellspacing="1" cellpadding="1">
        <tr>
            <td>ID</td>
            <td>职位</td>
            <td>发布时间</td>
            <td>岗位职责</td>
            <td>职位要求</td>
            <td>公司地址</td>
            <td>给与薪资</td>
            <td>公司电话</td>
            <td>投递简历</td>
        </tr>
        <c:forEach items="${requestScope.recuitments}" var="recuit">
            <tr>
                <td>${recuit.id}</td>
                <td>${recuit.position}</td>
                <td>${recuit.publish_time}</td>
                <td>${recuit.dutys}</td>
                <td>${recuit.job_request}</td>
                <td>${recuit.company_address}</td>
                <td>${recuit.give_salary}</td>
                <td>${recuit.company_tel}</td>
                <td><a  id ="deliver" href="">投递简历</a></td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
