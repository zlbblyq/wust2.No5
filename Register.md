
<html>
<head>
    <title>注册界面</title>
</head>
<body background="http://img17.3lian.com/d/file/201703/18/bd401938784fc55cbf94875be81f27ad.jpg" 
      background-size：100% >
    

    <script language="javascript">

function checkform2(){
if(document.form2.password1.value!=document.form2.password2.value)
{    alert("密码不一致");
document.form2.password.focus();
return false;
}
if(document.form2.username.value.length<1)
{    alert("用户名不能为空");
document.form2.username.focus();
return false;
}
if(document.form2.username.value="admin")
{    alert("用户名已存在");
document.form2.username.focus();
return false;
}

return true;}
    </script>
    <body>
        <div align="center">
            <font size=6 face="黑体" color="blue"><i>用户注册</i></font>
        </div>  <hr>
        <form method="post" name="form2" action="2.html" onsubmit="return checkform2();">
            <p align="center"><font size=4 face="黑体" color="white">  用户名&nbsp;&nbsp;:</font>  <input type="text" name="username"></p>
            <p align="center"><font size=4 face="黑体" color="white">  账&nbsp;&nbsp;户&nbsp;&nbsp;: </font> <input type="text" name="account"></p>
            <p align="center"><font size=4 face="黑体" color="white">  输入密码:</font>  <input type="password" id="password1"></p>
            <p align="center"> <font size=4 face="黑体" color="white"> 确认密码:</font>  <input type="password" id="password2"></p>
            <p align="right"><input type="submit" value="注册"></p>
        </form>
    </body>

