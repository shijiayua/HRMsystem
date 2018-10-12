<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/11
  Time: 13:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
  <head>
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
      <script>
//有问题，待解决
          $(function () {
              $("#yanzhen").blur(function () {
                  var uname = $(this).val()
                   url = "${pageContext.request.contextPath}/input";
                   args = {"name":uname};
                  $.post(url,args,function (data) {
                        if(data=="111") {
                            //用户已经存在
                            $("#s1").text = "用户名已将存在"
                            return false;
                        }
                        return true;
                  });
              });
              $(".pass1").blur(function () {
                  var p1 = $(".pass").val();
                  var p2 = $("this").val();
                  if(p1!=p2){
                      //两次密码不一致
                      $("#ss").text="两次密码不一致，请重新输入";
                  }
              });
          });
      </script>
  </head>
  <body>
        <div class="dfrom">
        <form action="add" method="post">
            <div class="form-group">
                <input id="yanzhen"type="text" name="name" placeholder="账号" required="required"/>
                <div><span id="s1" style="color: red"></span></div>
            </div>
            <div class="form-group">
                <input type="text" name="password" placeholder="密码" required="required" class="pass">
            </div>
            <div class="form-group">
                <input type="text" name="password1" placeholder="确认密码" required="required" class="pass1">
                <div><span id="ss" style="color: red"></span></div>
            </div>
            <div class="form-group">
                <input class="register" type="submit" name="submit" value="注册" style="color: orangered">
                <input class="cancle" type="submit" name="cancel" value="取消" style="color: orangered">
            </div>
        </form>
        </div>
  </body>
</html>
