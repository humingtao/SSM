<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="path" value="${pageContent.request.contextPath } "/>
<html>
<head>
    <meta charset="utf-8"/>
    <title>欢迎注册新鲜e客</title>
    <link rel="stylesheet" href="${path}/assets/css/sign.css"/>
    <link href="//netdna.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">
    <script type="text/javascript" src="${path}/assets/js/jquery-3.2.1.min .js"></script>
    <script src="${path}/assets/js/sign.js" type="text/javascript" charset="utf-8"></script>
    <script>
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
                                } else {
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
    <!--logo-->
    <div class="logo">
        <div class="container">
            <div class="logo-img">
                <a href="javascript:void(0)"><img src="${path}/assets/img/logo.png" width="165px"/></a>
            </div>
        </div>
    </div>
    <!--中间部分-->
    <div class="content">
        <div class="contnet-top"></div>
        <div class="container2">
            <div class="content-left">
                <img src="${path}/assets/img/zs_register.png"/>
            </div>
            <div class="contnet-right">
                <div class="sign-box">
                    <div class="sign-title">
                        注册账号
                    </div>
                    <form action="/user/zhuce" method="post" onsubmit="return checkinput()">
                        <!--用户名-->
                        <div class="error">
                            <span id="usernamespan">${message}</span>
                        </div>
                        <div class="sign-row-1">
                            <div class="userimg">
                                <i class="fa fa-mobile" aria-hidden="true"
                                   style="float:left;margin-top: 12px;margin-left: 18px"></i>
                            </div>
                            <div class="form-input">
                                <input class="username" type="text" id="username" name="username" placeholder="手机号"
                                       maxlength="11" value="${loginvo.username}"
                                       style="padding-left: 10px;font-size: 16px;"/>
                            </div>
                        </div>
                        <!--密码-->
                        <div class="error3">
                            <span id="passwordspan"></span>
                        </div>
                        <div class="sign-row-2">
                            <div class="passimg">
                                <i class="fa fa-lock" aria-hidden="true"
                                   style="float:left;margin-top: 12px;margin-left: 16px"></i>
                            </div>
                            <div class="form-input">
                                <input class="password" type="password" id="password" onblur="checkpassword()"
                                       name="password" placeholder="设置6~20位密码"
                                       style="padding-left: 10px;font-size: 16px;"/>
                            </div>
                        </div>
                        <!--确认密码-->
                        <div class="error3">
                            <span id="confirmspan"></span>
                        </div>
                        <div class="sign-row-3">
                            <div class="passimg">
                                <i class="fa fa-lock" aria-hidden="true"
                                   style="float:left;margin-top: 12px;margin-left: 16px"></i>
                            </div>
                            <div class="form-input">
                                <input class="confirmpass" type="password" id="confirmpassword" onblur="checkconfirm()"
                                       name="confirmpassword" placeholder="确认密码"
                                       style="padding-left: 10px;font-size: 16px;"/>
                            </div>
                        </div>
                        <!--验证码-->
                        <div class="error3">
                            <span id="codespan">${codemessage}</span>
                        </div>
                        <div class="sign-row-4">
                            <div class="codeimg">
                                <i class="fa fa-picture-o" aria-hidden="true"
                                   style="float:left;margin-top: 12px;margin-left: 15px"></i>
                            </div>
                            <div class="form-input">
                                <input class="code" type="text" id="code" name="code" placeholder="请输入图片验证码"
                                       onblur="checkcode()" style="padding-left: 10px;font-size: 16px;"/>
                                <img id="validcode" src="${path}/kaptcha"
                                     style="height: 40px;margin-right: 15px;float: right"/>
                            </div>
                        </div>
                        <!--短信验证-->
                        <div class="error3">
                            <span id="messspan"></span>
                        </div>
                        <div class="sign-row-5">
                            <div class="messimg">
                                <i class="fa fa-text-width" aria-hidden="true"
                                   style="float:left;margin-top: 12px;margin-left: 15px"></i>
                            </div>
                            <div class="form-input">
                                <input class="mess" type="text" id="message" onblur="checkmessage()" name="mess"
                                       placeholder="请输入短信验证码" style="padding-left: 10px;font-size: 16px;"/>
                            </div>
                            <div class="messspan2" style="height:39px">
                                <a href="javascript:void(0)">获取短信验证码</a>
                            </div>
                        </div>
                        <!--多选框-->
                        <div class="sign-row-6">
                            <label><input type="checkbox" checked="checked" class="checkbox"/>
                                <div style="float: left;margin-left:8px ;font-size: 12px;margin-top: 18px;">
                                    我已阅读并同意《用户注册协议》
                                </div>
                            </label>
                            <div style="float: right; font-size: 12px;margin-top: 18px;">
                                <a href="/user/index">立即登录</a>
                            </div>
                        </div>
                        <!--注册按钮-->
                        <div class="sign-button">
                            <button type="submit" class="button">立即注册</button>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>
    <!--底部的五个部分-->
    <div class="bottom">
        <div class="font-ul">
            <ul>
                <li>
                    <a href="javascript:void(0)"><i class="fa fa-ils fa-lg" aria-hidden="true"></i>
                        正品原汁原味</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                    <table style="margin-top: -42px;margin-left:150px;height: 60px;border-color: #656565;border-left-style: solid;border-width: 1px;">
                        <tr>
                            <td align="top"></td>
                        </tr>
                    </table>
                </li>
                <li>
                    &nbsp;&nbsp;<a href="javascript:void(0)"><i class="fa fa-stack-exchange fa-lg"
                                                                aria-hidden="true"></i>
                    快速订单确认</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                    <table style="margin-top: -42px;margin-left:150px;height: 60px;border-color: #656565;border-left-style: solid;border-width: 1px;"/>
                    <tr>
                        <td align="top"></td>
                    </tr>
                    </table>
                </li>
                <li>
                    &nbsp;&nbsp;<a href="javascript:void(0)"><i class="fa fa-send fa-lg" aria-hidden="true"></i>
                    通州区物流派送</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                    <table style="margin-top: -42px;margin-left:175px;height: 60px;border-color: #656565;border-left-style: solid;border-width: 1px;"/>
                    <tr>
                        <td align="top"></td>
                    </tr>
                    </table>
                </li>
                <li>
                    &nbsp;&nbsp;<a href="javascript:void(0)"><i class="fa fa-xing fa-lg" aria-hidden="true"></i>
                    用户收货确认</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                    <table style="margin-top: -42px;margin-left:150px;height: 60px;border-color: #656565;border-left-style: solid;border-width: 1px;"/>
                    <tr>
                        <td align="top"></td>
                    </tr>
                    </table>
                </li>
                <li>
                    &nbsp;<a href="javascript:void(0)"><i class="fa fa-thumbs-o-up fa-lg" aria-hidden="true"></i>
                    百万用户口碑</a>
                </li>
            </ul>
        </div>
    </div>
    <div class="foot">
        <div class="foot-1">
            <ul class="foot-1-ul">
                <li style="color: #3F4042;"><b>品农商城</b></li>
                <a href="javascript:void(0)">
                    <li style="color: #828282;">关于我们</li>
                </a>
                <a href="javascript:void(0)">
                    <li style="color: #828282;">法律政策</li>
                </a>
                <a href="javascript:void(0)">
                    <li style="color: #828282;">联系我们</li>
                </a>
            </ul>
        </div>
        <div class="foot-1">
            <ul class="foot-1-ul">
                <li style="color: #3F4042;"><b>新手指南</b></li>
                <a href="javascript:void(0)">
                    <li style="color: #828282;">正品保证</li>
                </a>
                <a href="javascript:void(0)">
                    <li style="color: #828282;">购物指南</li>
                </a>
                <a href="javascript:void(0)">
                    <li style="color: #828282;">费用说明</li>
                </a>
            </ul>
        </div>
        <div class="foot-1">
            <ul class="foot-1-ul">
                <li style="color: #3F4042;"><b>帮助中心</b></li>
                <a href="javascript:void(0)">
                    <li style="color: #828282;">实名认证</li>
                </a>
                <a href="javascript:void(0)">
                    <li style="color: #828282;">签收说明</li>
                </a>
                <a href="javascript:void(0)">
                    <li style="color: #828282;">运输时效</li>
                </a>
            </ul>
        </div>
        <div class="foot-2">
            <ul class="foot-1-ul">
                <li style="color: #3F4042;"><b>联系我们</b></li>
                <a href="javascript:void(0)">
                    <li style="color: #828282;">周一至周日8:00-20:00(节假日除外)</li>
                </a>
                <a href="javascript:void(0)">
                    <li style="color: #828282;">联系客服：400-6286-510</li>
                </a>
                <a href="javascript:void(0)">
                    <li style="color: #828282;">备案号：京ICP备16048908号</li>
                </a>
            </ul>
        </div>
        <div class="foot-finally">
            <div style="float: left;">
                <a href="javascript:void(0)"><img src="${path}/assets/img/code_app_android.png" width="100px"
                                                  height="110px" style="margin-top: 20px;"/></a>
            </div>
            <div style="float: left;margin-left: 12px;">
                <a href="javascript:void(0)"><img src="${path}/assets/img/code_app_iphone.png" width="100px"
                                                  height="110px" style="margin-top: 20px;"/></a>
            </div>
            <div style="float: right;margin-right: 10px;">
                <a href="javascript:void(0)"><img src="${path}/assets/img/code_wx_tong_tang.png" width="100px"
                                                  height="110px" style="margin-top: 22px;"/></a>
            </div>
        </div>
    </div>
</div>
</body>
</html>
