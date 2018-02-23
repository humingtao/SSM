<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:set var="path" value="${pageContent.request.contextPath } "/>
<html>
<head>
    <meta charset="utf-8"/>
    <title>新鲜e客</title>
    <link type="text/css" rel="stylesheet" href="${path}/assets/css/index.css"/>
    <link href="//netdna.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">
    <script type="text/javascript" src="${path}/assets/js/jquery-3.2.1.min%20.js"></script>
    <script type="text/javascript" src="${path}/assets/js/index.js"></script>
    <script type="text/javascript">
        $(document).ready(function () {
            $("#username").blur(function () {
                var username = $("#username").val();
                if (username == "") {
                    $("#usernamespan").css("color", "red");
                    $("#usernamespan").text("请输入手机号");
                } else {
                    var reg = /^(13[0-9]|14[5|7]|15[0|1|2|3|5|6|7|8|9]|18[0|1|2|3|5|6|7|8|9]|17[0-9])\d{8}$/;
                    if (reg.test(username) == false) {
                        $("#usernamespan").text("输入的手机号不符合要求");
                    } else {
                        $("#usernamespan").text("");
                        $.ajax({
                            type: "post",//请求类型
                            url: "/user/check?",//请求地址
                            async: true,//是否异步
                            datetype: "json",
                            data: "username=" + username,
                            success: function (result) {
                                //result指服务器返回的数据
                                var date = JSON.parse(result);
                                if (date.flag == false) {
                                    $("#usernamespan").text(date.msg);
                                }
                            }
                        });
                    }
                }
            });

            $("#code").blur(function () {
                var code = $("#code").val();
                if (code == "") {
                    $("#codespan").css("color", "red");
                    $("#codespan").text("验证码不能为空");
                    return false;
                } else {
                    $("#codespan").text("");
                    $.ajax({
                        type: "post",//请求类型
                        url: "/user/checkcode?",//请求地址
                        async: true,//是否异步
                        datetype: "json",
                        data: "code=" + code,
                        success: function (result) {
                            //result指服务器返回的数据
                            var date = JSON.parse(result);
                            if (date.flag == false) {
                                $("#codespan").text(date.msg);
                            }
                        }
                    })
                    return true;
                }
            });
            //更换验证码
            $("#validcode").click(
                function () {
                    $("#validcode").attr("src", "${path}/kaptcha?time=" + new Date());
                }
            );
        });
    </script>
</head>

<body>
<div class="big">
    <div class="nav">
        <div class="container">
            <div class="nav-right">
                您好，请
                <a href="/user/index">登录</a>&nbsp;&nbsp;&nbsp;&nbsp;
                <a href="/user/sign">免费注册</a>&nbsp;&nbsp;|&nbsp;&nbsp;
                <a href="javascript:void(0)">会员中心</a>&nbsp;&nbsp;|&nbsp;&nbsp;
                <a href="javascript:void(0)">Android下载</a>&nbsp;&nbsp;|&nbsp;&nbsp;
                <a href="javascript:void(0)">IOS下载</a>
            </div>
        </div>
    </div>
    <div class="logo">
        <div class="container">
            <div class="logo-img">
                <a href="/user/shouye"><img src="${path}/assets/img/logo.png" width="165px"/></a>
            </div>
        </div>
    </div>
    <div class="content">
        <div class="contnet-top"></div>
        <div class="container">
            <div class="content-left">
                <img src="${path}/assets/img/login-bg.png"/>
            </div>
            <div class="contnet-right">
                <div class="login-box">
                    <div class="login-title">
                        账户登录
                    </div>
                    <form action="/user/login" method="post" onsubmit="return checkinput()">
                        <!--用户名-->
                        <div class="error">
                            <span id="usernamespan"></span>
                        </div>
                        <div class="login-row-1">
                            <div class="userimg" style="height: 40px;width: 30px">
                                <i class="fa fa-user-o" style="margin-top: 11px" aria-hidden="true"></i>
                            </div>
                            <div class="form-input">
                                <input class="username" type="text" id="username" name="username" placeholder="请输入手机号"
                                       value="${login.username}" onblur="checkusername()" style="padding-left: 10px"
                                       ;maxlength="11"/>
                            </div>
                        </div>
                        <!--密码-->
                        <div class="error2">
                            <span id="passwordspan">${passmessage}</span>
                        </div>
                        <div class="login-row-2">
                            <div class="passimg" style="height: 40px;width: 30px">
                                <i class="fa fa-lock" aria-hidden="true" style="margin-top: 11px"></i>
                            </div>
                            <div class="form-input">
                                <input class="password" type="password" id="password" name="password"
                                       placeholder="请输入密码" onblur="checkpassword()" style="padding-left: 10px"/>
                            </div>
                        </div>
                        <!--验证码-->
                        <div class="error2">
                            <span id="codespan" style="font-size: 12px">${codemessage}</span>
                        </div>
                        <div class="login-row-3">
                            <div class="codeimg" style="height: 40px;width: 30px">
                                <i class="fa fa-lock" aria-hidden="true" style="margin-top: 11px"></i>
                            </div>
                            <div class="form-input">
                                <input class="code" type="text" id="code" name="code" placeholder="请输入验证码"
                                       style="padding-left: 10px;float: left;width: 150px" onblur="checkcode()"/>
                                <img id="validcode" src="${path}/kaptcha" style="height: 40px;margin-left: 5px"/>
                            </div>
                        </div>
                        <!--登录按钮-->
                        <div class="login-button">
                            <button type="submit" class="button">立即登录</button>
                        </div>
                        <div class="index-a"
                             style="text-align: left;float: left; font-size: 13px;margin-top: 10px;margin-left: 17px; ">
                            <a href="javascript:void(0)">忘记密码？</a>
                        </div>
                        <div class="index-a"
                             style="text-align: right;font-size: 13px;margin-top: 10px;margin-right: 15px;"><a
                                href="/user/sign">免费注册</a></div>
                    </form>
                </div>
            </div>
        </div>
    </div>
    <div class="copyright">
        Copyright © 2015 PinNong.All Rights Reserved | 备案号：京ICP备16048908号 北京通糖烟酒有限公司 版权所有
    </div>
</div>
</body>
</html>
