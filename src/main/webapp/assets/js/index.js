function checkusername() {
    var username = $("#username").val();
    if (username == "") {
        $("#usernamespan").css("color", "red");
        $("#usernamespan").text("请输入手机号");
    } else {
        var reg = /^(13[0-9]|14[5|7]|15[0|1|2|3|5|6|7|8|9]|18[0|1|2|3|5|6|7|8|9]|17[0-9])\d{8}$/;
        if (reg.test(username) == false) {
            $("#usernamespan").css("color", "red");
            $("#usernamespan").text("手机号不符合要求");
            return false;
        } else {
            $("#usernamespan").text("");
            return true;
        }
    }
}

function checkpassword() {
    var password = $("#password").val();
    if (password == "") {
        $("#passwordspan").css("color", "red");
        $("#passwordspan").text("密码不能为空");
        return false;
    } else {
        var reg = /^[0-9a-zA-Z]{6,16}$/;
        if (reg.test(password) == false) {
            $("#passwordspan").css("color", "red");
            $("#passwordspan").text("密码必须在6~16位");
            return false;
        } else {
            $("#passwordspan").text("");
            return true;
        }
    }
}

function checkcode() {
    var code = $("#code").val();
    if (code == "") {
        $("#codespan").css("color", "red");
        $("#codespan").text("验证码不能为空");
        return false;
    } else {
        $("#codespan").text("");
        return true;
    }
}

function checkinput() {
    if (checkusername() == true && checkpassword() == true &&
        checkcode() == true) {
        return true;
    } else {
        return false;
    }
}