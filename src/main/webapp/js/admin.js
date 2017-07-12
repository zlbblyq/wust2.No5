
function name1() {
    var name = document.getElementById("name").value;
    if (name.length == "") {
        document.getElementById("tel").innerHTML = "用户名不能为空"
        document.getElementById("tel").style.color = "red";
    }
 
}
//	function name2(){
//	document.getElementById("tel").innerHTML="请填写用户名"
//	document.getElementById("tel").style.color="#999";
//	}

function pwd() {
	var pwd = document.getElementById("paswd").value;
    if (pwd.length == "") {
        document.getElementById("pw").innerHTML = "密码不能为空"
        document.getElementById("pw").style.color = "red";
    }
 
}

function submit() {
    var name = document.getElementById("name").value;
    var qpw = document.getElementById("paswd").value;
    if ((name!="admin") && (qpw!="manage")) {
        alert("登录成功！");
       // window.location.href = 'http://localhost:52199/book/Login';
    }
    else {
        alert("请正确填写用户名和密码！");
    }
}


