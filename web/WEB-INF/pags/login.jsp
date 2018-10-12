<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/12
  Time: 9:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
    <!-- 最新版本的 Bootstrap 核心 CSS 文件 -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/bootraps/css/bootstrap.min.css" >
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.10.2.min.js"></script>
    <script src="${pageContext.request.contextPath}/bootraps/js/bootstrap.min.js" ></script>
    <style type="text/css">
        .dfrom{
            width: 300px;
            height: 350px;
            margin: auto;
            position: absolute;
            top: 0;
            left: 0;
            right: 0;
            bottom: 0;
        }
        .form-group{
            width: 300px;
        }
        body{
            background: url("${pageContext.request.contextPath}/img/bg1.jpg");
        }
    </style>
</head>
<body>
<div class="dfrom">
    <form action="login" method="post">
        <div class="form-group">
            <input id="yanzhen"type="text" name="name" placeholder="账号" required="required"/>
        </div>
        <div class="form-group">
            <input type="text" name="password" placeholder="密码" required="required" class="pass">
        </div>
        <div class="form-group">
            <input class="register" type="submit" name="submit" value="登录" style="color: orangered">
            <input class="cancle" type="submit" name="cancel" value="取消" style="color: orangered">
        </div>
    </form>
</div>
</body>
</html>
