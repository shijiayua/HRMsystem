<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/11
  Time: 13:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
  <head>
    <!-- 最新版本的 Bootstrap 核心 CSS 文件 -->
      <link rel="stylesheet" href="${pageContext.request.contextPath}/bootraps/css/bootstrap.min.css" >
      <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.10.2.min.js"></script>
      <script src="${pageContext.request.contextPath}/bootraps/js/bootstrap.min.js" ></script>
      <%--<script src="${pageContext.request.contextPath}/js/jquery-1.7.2.js" ></script>--%>
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
             background: url("img/bg1.jpg");
          }
      </style>
  <script type="text/javascript">
          $(function () {
              $("#yanzhen").blur(function () {
                  var uname = $(this).val();
                  url = "${pageContext.request.contextPath}/user/input";
                  args = {"name":uname};
                  $.post(url,args,function (data) {
                      if(data=="111") {
                      //用户已经存在
                          $("#s1").text ("用户名已经存在");
                      }else {
                          $("#s1").text ("");
                      }
                 });
              });
              $(".pass1").blur(function () {
                  var p1 = $(".pass").val();
                  var p2 = $(".pass1").val();
                  if (p1 != p2) {
                      //两次密码不一致
                      $("#s2").text("两次密码不一致，请重新输入") ;
                  }else{
                      $("#s2").text("") ;
                  }
              });
          });
      </script>
  </head>
  <body>
  <div class="dfrom">
      <form action="${pageContext.request.contextPath}/user/add" method="post">
          <div class="form-group">
              <input id="yanzhen" type="text" name="name" placeholder="账号" required="required"/>
              <div><span id="s1" style="color: red"></span></div>
          </div>
          <div class="form-group">
              <input type="text" name="password" placeholder="密码" required="required" class="pass">
          </div>
          <div class="form-group">
              <input type="text" name="password1" placeholder="确认密码" required="required" class="pass1">
              <div><span id="s2" style="color: red"></span></div>
          </div>
          <div class="form-group">
              <input class="register" type="submit" name="submit" value="注册" >
              <input class="cancle" type="submit" name="cancel" value="取消">
          </div>
      </form>
  </div>
  </body>
</html>
