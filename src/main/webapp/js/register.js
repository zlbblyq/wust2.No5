function checkname(name){
	// open.database()
	//Transaction(){
	//"select name from user where name==?" name}
	
	if(name=="admin")
	 return 0;
	else 
	 return 1;
}
function name1() {
    var name = document.getElementById("name").value;
    if (name.length == "") {
        document.getElementById("tel").innerHTML = "用户名不能为空";
        document.getElementById("tel").style.color = "red";
    } else if(checkname(name)==0){
    	document.getElementById("tel").innerHTML = "该用户名已被使用";
        document.getElementById("tel").style.color = "red";
   
    }else {
        document.getElementById("tel").innerHTML = "√"
        document.getElementById("tel").style.color = "green";
    }
}
//	function name2(){
//	document.getElementById("tel").innerHTML="请填写用户名"
//	document.getElementById("tel").style.color="#999";
//	}
function pwd2() {
    document.getElementById("pw").innerHTML = "请填写6-12位的密码"
    document.getElementById("pw").style.color = "#999";

}
function pwd1() {
    p = document.getElementById("paswd").value;

    if (p.length >= 6 && p.length <= 20) {
        document.getElementById("pw").innerHTML = "√"
        document.getElementById("pw").style.color = "green";
    } else {
        document.getElementById("pw").innerHTML = "格式错误,请输入6-12位"
        document.getElementById("pw").style.color = "red";
    }
}
function validate() {
    var qpw = document.getElementById("paswd").value;
    var qpw2 = document.getElementById("paswd2").value;

    if (qpw == qpw2 && p.length >= 6 && p.length <= 20) {
        document.getElementById("qpwtx").innerHTML = "<font color='green'>√</font>";
        document.getElementById("button").disabled = false;
    }
    else {
        document.getElementById("qpwtx").innerHTML = "<font color='red'>两次密码不相同或者格式错误</font>";
        document.getElementById("button").disabled = true;
    }
}
function submit()
{
    var name = document.getElementById("name").value;
    var qpw = document.getElementById("paswd").value;
    var qpw2 = document.getElementById("paswd2").value;
    if ((name.length != "")&&(qpw.length >= 6 && qpw.length <= 20)&&(qpw == qpw2))
    {
        alert("注册成功，跳转到登陆界面！");
        window.location.href ='http://localhost:8080/wust2_No5/views/Login.html';
    }
    else {
        alert("请正确填写用户名和密码！");
    }
}