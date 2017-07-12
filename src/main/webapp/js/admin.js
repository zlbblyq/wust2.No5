
function name1() {
    var name = document.getElementById("name").value;
    if (name.length == "") {
        document.getElementById("tel").innerHTML = "用户名不能为空"
        document.getElementById("tel").style.color = "red";
    }
    else if(name!="admin")
    {
        document.getElementById("tel").innerHTML = "用户名错误"
        document.getElementById("tel").style.color = "red";
    }
    else {
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
    }
    else if(p!= "manage") {
        document.getElementById("tel").innerHTML = "密码错误"
        document.getElementById("tel").style.color = "red";
    }
    else {
        document.getElementById("pw").innerHTML = "格式错误,请输入6-12位"
        document.getElementById("pw").style.color = "red";
    }
}
function submit() {
    var name = document.getElementById("name").value;
    var qpw = document.getElementById("paswd").value;
    if ((name.length != "") && (qpw.length >= 6 && qpw.length <= 20)&&(name=="admin")&&(qpw=="manage")) {
        alert("登录成功！");     
    }
    else {
        alert("请正确填写用户名和密码！");
    }
}

