<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/13
  Time: 11:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="/js/jquery-1.7.2.js"></script>
    <script>
        $(function () {
            $(".oldpass").blur(function () {
                $.ajax( {
                    url:"editpass",
                    data:{
                        "password":$(this).val(),
                    },
                    sucess:function (data) {
                        if(data!="111"){
                            //不能查到能够查到
                            $("#gtr").text("密码错误");
                        }
                    },
                });
            });
            $(".confirmpass").blur(function () {
                var p1 = $(".newpass").val();
                var p2 = $("this").val();
                if(p1!=p2){
                    //两次密码不一致
                    $("#ss").text("两次密码不一致请重新输入");
                }
            });

        })
    </script>
</head>
<body>
        <form action="editSucess" method="post">
            原密码：<input type="password" name="oldpassword" class="oldpass">
            <span id="gt"></span>
            新密码：<input type="password" name="newpassword" class="newpass"><br/>
            确认密码：<input type="password" name="confirmpassword" class="confirmpass">
            <span id="ss"></span>
            <input type="submit" name="submit" value="提交" class="cfm">
            <input type="button" name="buttton" value="返回" >
        </form>
</body>
</html>
