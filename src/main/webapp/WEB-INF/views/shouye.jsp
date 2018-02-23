<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="path" value="${pageContent.request.contextPath } "/>
<html>
<head>
    <meta charset="UTF-8">
    <title>
        新鲜E客-首页
    </title>
    <link rel="stylesheet" type="text/css" href="${path}/assets/css/font-awesome.css">
    <link href="//netdna.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">
    <link rel="stylesheet" href="${path}/assets/css/shutter.css">
    <link rel="stylesheet" href="${path}/assets/css/firstlist.css">
    <script type="text/javascript" src="${path}/assets/js/jquery-3.2.1.min .js"></script>
    <style type="text/css">
        html, body {
            margin: 0;
            padding: 0;
        }

        .iw_poi_title {
            color: #CC5522;
            font-size: 14px;
            font-weight: bold;
            overflow: hidden;
            padding-right: 13px;
            white-space: nowrap
        }

        .iw_poi_content {
            font: 12px arial, sans-serif;
            overflow: visible;
            padding-top: 4px;
            white-space: -moz-pre-wrap;
            word-wrap: break-word
        }
    </style>
    <script type="text/javascript" src="http://api.map.baidu.com/api?key=&v=1.1&services=true"></script>
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
        <div class="logo-left">
            <form action="" method="post">
                <input class="keyword" type="text" id="keyword" name="keyword" placeholder="商品名称，如：鲜果"/>
                <input class="button1" type="button" value="搜索商品"/>
                <input class="button1" type="button" value="我的购物车"
                       onclick="javascript:window.location.href='javascript:void(0)'"/>
            </form>
        </div>
    </div>
    <div class="nav1">
        <div class="container">
            <div class="nav1-left">
                精选商品分类&nbsp;>
            </div>
            <div class="nav1-right">
                <a href="javascript:void(0)" style="color: red;">网站首页</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
                <a href="javascript:void(0)">品质生活</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
                <a href="javascript:void(0)">品农生鲜</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
                <a href="javascript:void(0)">直供专区</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
                <a href="javascript:void(0)">网点分布</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
                <a href="javascript:void(0)">特价专区</a>
            </div>
        </div>
    </div>
    <hr style="background-color: #89C323;height: 2px;margin-top: 10px;"/>
    <div class="banner">
        <div class="container">
            <div class="shutter">
                <div class="shutter-img">
                    <a href="#" data-shutter-title="Iron Man"><img src="${path}/assets/img/banner-1.jpg" alt="#"></a>
                    <a href="#" data-shutter-title="Super Man"><img src="${path}/assets/img/index/banner-2.jpg" alt="#"></a>
                    <a href="#" data-shutter-title="The Hulk"><img src="${path}/assets/img/index/banner-3.jpg" alt="#"></a>
                </div>
                <ul class="shutter-btn">
                    <li class="prev"></li>
                    <li class="next"></li>
                </ul>
                <!--<div class="shutter-desc">
                    <p>Iron Man</p>
                </div>-->
            </div>

            <script src="${path}/assets/js/jquery.min.js"></script>
            <script src="${path}/assets/js/velocity.js"></script>
            <script src="${path}/assets/js/shutter.js"></script>
            <script>
                $(function () {
                    $('.shutter').shutter({
                        shutterW: 1000, // 容器宽度
                        shutterH: 358, // 容器高度
                        isAutoPlay: true, // 是否自动播放
                        playInterval: 2000, // 自动播放时间
                        curDisplay: 3, // 当前显示页
                        fullPage: false // 是否全屏展示
                    });
                });
            </script>
        </div>
    </div>
    <div class="content" style="margin-top: -200px">
        <div class="container">
            <div class="contrnt-left">
                <div class="content-title">
                    热销产品
                </div>
                <div class="content-row">
                    <div class="product">
                        <a href="javascript:void(0)"><img src="${path}/assets/img/index/index-1-1.jpg"
                                                          style="width: 192px;height: 192px;"/></a>
                        <a href="javascript:void(0)">2L金纺柔顺剂（薰衣草）</a>
                        <span style="width: 100%;height: 50px;color: red;line-height: 50px;">￥25.8</span>
                    </div>
                    <div class="product">
                        <a href="javascript:void(0)"><img src="${path}/assets/img/index/index-1-2.jpg"
                                                          style="width: 192px;height: 192px;"/></a>
                        <a href="javascript:void(0)">雀巢瓶丝滑摩卡咖啡268ml</a>
                        <span style="width: 100%;height: 50px;color: red;line-height: 50px;">￥5.5</span>
                    </div>
                    <div class="product">
                        <a href="javascript:void(0)"><img src="${path}/assets/img/index/index-1-3.jpg"
                                                          style="width: 192px;height: 192px;"/></a>
                        <a href="javascript:void(0)">2L金纺柔顺剂（薰衣草）</a>
                        <span style="width: 100%;height: 50px;color: red;line-height: 50px;">￥25.8</span>
                    </div>
                </div>
                <div class="content-row">
                    <div class="product">
                        <a href="javascript:void(0)"><img src="${path}/assets/img/index/index-1-4.jpg"
                                                          style="width: 192px;height: 192px;"/></a>
                        <a href="javascript:void(0)">2L金纺柔顺剂（薰衣草）</a>
                        <span style="width: 100%;height: 50px;color: red;line-height: 50px;">￥25.8</span>
                    </div>
                    <div class="product">
                        <a href="javascript:void(0)"><img src="${path}/assets/img/index/index-1-5.jpg"
                                                          style="width: 192px;height: 192px;"/></a>
                        <a href="javascript:void(0)">2L金纺柔顺剂（薰衣草）</a>
                        <span style="width: 100%;height: 50px;color: red;line-height: 50px;">￥25.8</span>
                    </div>
                    <div class="product">
                        <a href="javascript:void(0)"><img src="${path}/assets/img/index/index-1-6.jpg"
                                                          style="width: 192px;height: 192px;"/></a>
                        <a href="javascript:void(0)">2L金纺柔顺剂（薰衣草）</a>
                        <span style="width: 100%;height: 50px;color: red;line-height: 50px;">￥25.8</span>
                    </div>
                </div>
            </div>
            <div class="contrnt-right">
                <div class="content-title">
                    最新上架
                </div>
                <div class="content-row">
                    <div class="product">
                        <a href="javascript:void(0)"><img src="${path}/assets/img/index/index-2-1.jpg"
                                                          style="width: 192px;height: 192px;"/></a>
                        <a href="javascript:void(0)">2L金纺柔顺剂（薰衣草）</a>
                        <span style="width: 100%;height: 50px;color: red;line-height: 50px;">￥25.8</span>
                    </div>
                    <div class="product">
                        <a href="javascript:void(0)"><img src="${path}/assets/img/index/index-2-2.jpg"
                                                          style="width: 192px;height: 192px;"/></a>
                        <a href="javascript:void(0)">2L金纺柔顺剂（薰衣草）</a>
                        <span style="width: 100%;height: 50px;color: red;line-height: 50px;">￥25.8</span>
                    </div>
                    <div class="product">
                        <a href="javascript:void(0)"><img src="${path}/assets/img/index/index-2-3.jpg"
                                                          style="width: 192px;height: 192px;"/></a>
                        <a href="javascript:void(0)">2L金纺柔顺剂（薰衣草）</a>
                        <span style="width: 100%;height: 50px;color: red;line-height: 50px;">￥25.8</span>
                    </div>
                </div>
                <div class="content-row">
                    <div class="product">
                        <a href="javascript:void(0)"><img src="${path}/assets/img/index/index-2-4.jpg"
                                                          style="width: 192px;height: 192px;"/></a>
                        <a href="javascript:void(0)">2L金纺柔顺剂（薰衣草）</a>
                        <span style="width: 100%;height: 50px;color: red;line-height: 50px;">￥25.8</span>
                    </div>
                    <div class="product">
                        <a href="javascript:void(0)"><img src="${path}/assets/img/index/index-2-5.jpg"
                                                          style="width: 192px;height: 192px;"/></a>
                        <a href="javascript:void(0)">2L金纺柔顺剂（薰衣草）</a>
                        <span style="width: 100%;height: 50px;color: red;line-height: 50px;">￥25.8</span>
                    </div>
                    <div class="product">
                        <a href="javascript:void(0)"><img src="${path}/assets/img/index/index-2-6.jpg"
                                                          style="width: 192px;height: 192px;"/></a>
                        <a href="javascript:void(0)">2L金纺柔顺剂（薰衣草）</a>
                        <span style="width: 100%;height: 50px;color: red;line-height: 50px;">￥25.8</span>
                    </div>
                </div>
            </div>
        </div>
        <div class="guanggao">
            <div class="container">
                <img src="${path}/assets/img/index/guanggao.png"/>
            </div>
        </div>
        <div class="content">
            <div class="container">
                <div class="contrnt-left">
                    <div class="content-title">
                        热销产品
                    </div>
                    <div class="content-row">
                        <div class="product">
                            <a href="javascript:void(0)"><img src="${path}/assets/img/index/index-3-1.jpg"
                                                              style="width: 192px;height: 192px;"/></a>
                            <a href="javascript:void(0)">2L金纺柔顺剂（薰衣草）</a>
                            <span style="width: 100%;height: 50px;color: red;line-height: 50px;">￥25.8</span>
                        </div>
                        <div class="product">
                            <a href="javascript:void(0)"><img src="${path}/assets/img/index/index-3-2.jpg"
                                                              style="width: 192px;height: 192px;"/></a>
                            <a href="javascript:void(0)">雀巢瓶丝滑摩卡咖啡268ml</a>
                            <span style="width: 100%;height: 50px;color: red;line-height: 50px;">￥5.5</span>
                        </div>
                        <div class="product">
                            <a href="javascript:void(0)"><img src="${path}/assets/img/index/index-3-3.jpg"
                                                              style="width: 192px;height: 192px;"/></a>
                            <a href="javascript:void(0)">2L金纺柔顺剂（薰衣草）</a>
                            <span style="width: 100%;height: 50px;color: red;line-height: 50px;">￥25.8</span>
                        </div>
                    </div>
                    <div class="content-row">
                        <div class="product">
                            <a href="javascript:void(0)"><img src="${path}/assets/img/index/index-3-4.jpg"
                                                              style="width: 192px;height: 192px;"/></a>
                            <a href="javascript:void(0)">2L金纺柔顺剂（薰衣草）</a>
                            <span style="width: 100%;height: 50px;color: red;line-height: 50px;">￥25.8</span>
                        </div>
                        <div class="product">
                            <a href="javascript:void(0)"><img src="${path}/assets/img/index/index-3-5.jpg"
                                                              style="width: 192px;height: 192px;"/></a>
                            <a href="javascript:void(0)">2L金纺柔顺剂（薰衣草）</a>
                            <span style="width: 100%;height: 50px;color: red;line-height: 50px;">￥25.8</span>
                        </div>
                        <div class="product">
                            <a href="javascript:void(0)"><img src="${path}/assets/img/index/index-3-6.jpg"
                                                              style="width: 192px;height: 192px;"/></a>
                            <a href="javascript:void(0)">2L金纺柔顺剂（薰衣草）</a>
                            <span style="width: 100%;height: 50px;color: red;line-height: 50px;">￥25.8</span>
                        </div>
                    </div>
                </div>
                <div class="contrnt-right">
                    <div class="content-title">
                        最新上架
                    </div>
                    <div class="content-row">
                        <div class="product">
                            <a href="javascript:void(0)"><img src="${path}/assets/img/index/index-4-1.jpg"
                                                              style="width: 192px;height: 192px;"/></a>
                            <a href="javascript:void(0)">2L金纺柔顺剂（薰衣草）</a>
                            <span style="width: 100%;height: 50px;color: red;line-height: 50px;">￥25.8</span>
                        </div>
                        <div class="product">
                            <a href="javascript:void(0)"><img src="${path}/assets/img/index/index-4-2.jpg"
                                                              style="width: 192px;height: 192px;"/></a>
                            <a href="javascript:void(0)">2L金纺柔顺剂（薰衣草）</a>
                            <span style="width: 100%;height: 50px;color: red;line-height: 50px;">￥25.8</span>
                        </div>
                        <div class="product">
                            <a href="javascript:void(0)"><img src="${path}/assets/img/index/index-4-3.jpg"
                                                              style="width: 192px;height: 192px;"/></a>
                            <a href="javascript:void(0)">2L金纺柔顺剂（薰衣草）</a>
                            <span style="width: 100%;height: 50px;color: red;line-height: 50px;">￥25.8</span>
                        </div>
                    </div>
                    <div class="content-row">
                        <div class="product">
                            <a href="javascript:void(0)"><img src="${path}/assets/img/index/index-4-4.jpg"
                                                              style="width: 192px;height: 192px;"/></a>
                            <a href="javascript:void(0)">2L金纺柔顺剂（薰衣草）</a>
                            <span style="width: 100%;height: 50px;color: red;line-height: 50px;">￥25.8</span>
                        </div>
                        <div class="product">
                            <a href="javascript:void(0)"><img src="${path}/assets/img/index/index-4-5.jpg"
                                                              style="width: 192px;height: 192px;"/></a>
                            <a href="javascript:void(0)">2L金纺柔顺剂（薰衣草）</a>
                            <span style="width: 100%;height: 50px;color: red;line-height: 50px;">￥25.8</span>
                        </div>
                        <div class="product">
                            <a href="javascript:void(0)"><img src="${path}/assets/img/index/index-4-6.jpg"
                                                              style="width: 192px;height: 192px;"/></a>
                            <a href="javascript:void(0)">2L金纺柔顺剂（薰衣草）</a>
                            <span style="width: 100%;height: 50px;color: red;line-height: 50px;">￥25.8</span>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!--中间部分-->

        <!--底部的五个部分-->
        <div class="bottom">
            <div class="font-ul">
                <ul>
                    <li>
                        <a href="javascript:void(0)"><i class="fa fa-ils fa-lg" aria-hidden="true"></i> 正品原汁原味
                        </a>&nbsp;&nbsp;&nbsp;&nbsp;
                        <table style="margin-top: -42px;margin-left:150px;height: 60px;border-color: #656565;border-left-style: solid;border-width: 1px;">
                            <tr>
                                <td align="top"></td>
                            </tr>
                        </table>
                    </li>
                    <li>
                        &nbsp;
                        <a href="javascript:void(0)"><i class="fa fa-stack-exchange fa-lg" aria-hidden="true"></i>
                            快速订单确认
                        </a>&nbsp;
                        <table style="margin-top: -42px;margin-left:150px;height: 60px;border-color: #656565;border-left-style: solid;border-width: 1px;">
                            <tr>
                                <td align="top"></td>
                            </tr>
                        </table>
                    </li>
                    <li>
                        &nbsp;
                        <a href="javascript:void(0)"><i class="fa fa-send fa-lg" aria-hidden="true"></i> 通州区物流派送
                        </a>
                        <table style="margin-top: -42px;margin-left:175px;height: 60px;border-color: #656565;border-left-style: solid;border-width: 1px;">
                            <tr>
                                <td align="top"></td>
                            </tr>
                        </table>
                    </li>
                    <li>
                        &nbsp;
                        <a href="javascript:void(0)"><i class="fa fa-xing fa-lg" aria-hidden="true"></i> 用户收货确认
                        </a>&nbsp;&nbsp;
                        <table style="margin-top: -42px;margin-left:150px;height: 60px;border-color: #656565;border-left-style: solid;border-width: 1px;">
                            <tr>
                                <td align="top"></td>
                            </tr>
                        </table>
                    </li>
                    <li>

                        <a href="javascript:void(0)"><i class="fa fa-thumbs-o-up fa-lg" aria-hidden="true"></i> 百万用户口碑
                        </a>
                    </li>
                </ul>
            </div>
        </div>
        <!--百度地图容器-->
        <div style="width:90%;height:550px;border:#ccc solid 1px;left: 60px" id="dituContent"></div>
        <script type="text/javascript">
            //创建和初始化地图函数：
            function initMap() {
                createMap();//创建地图
                setMapEvent();//设置地图事件
                addMapControl();//向地图添加控件
                addMarker();//向地图中添加marker
                addPolyline();//向地图中添加线
                addRemark();//向地图中添加文字标注
            }

            //创建地图函数：
            function createMap() {
                var map = new BMap.Map("dituContent");//在百度地图容器中创建一个地图
                var point = new BMap.Point(116.413338, 39.909242);//定义一个中心点坐标
                map.centerAndZoom(point, 14);//设定地图的中心点和坐标并将地图显示在地图容器中
                window.map = map;//将map变量存储在全局
            }

            //地图事件设置函数：
            function setMapEvent() {
                map.enableDragging();//启用地图拖拽事件，默认启用(可不写)
                map.enableScrollWheelZoom();//启用地图滚轮放大缩小
                map.enableDoubleClickZoom();//启用鼠标双击放大，默认启用(可不写)
                map.enableKeyboard();//启用键盘上下左右键移动地图
            }

            //地图控件添加函数：
            function addMapControl() {
                //向地图中添加缩放控件
                var ctrl_nav = new BMap.NavigationControl({
                    anchor: BMAP_ANCHOR_TOP_LEFT,
                    type: BMAP_NAVIGATION_CONTROL_LARGE
                });
                map.addControl(ctrl_nav);
                //向地图中添加缩略图控件
                var ctrl_ove = new BMap.OverviewMapControl({anchor: BMAP_ANCHOR_BOTTOM_RIGHT, isOpen: 1});
                map.addControl(ctrl_ove);
                //向地图中添加比例尺控件
                var ctrl_sca = new BMap.ScaleControl({anchor: BMAP_ANCHOR_BOTTOM_LEFT});
                map.addControl(ctrl_sca);
            }

            //标注点数组
            var markerArr = [{
                title: "我在这儿",
                content: "北京天安门",
                point: "116.403924|39.914555",
                isOpen: 0,
                icon: {w: 21, h: 21, l: 0, t: 0, x: 6, lb: 5}
            }
            ];

            //创建marker
            function addMarker() {
                for (var i = 0; i < markerArr.length; i++) {
                    var json = markerArr[i];
                    var p0 = json.point.split("|")[0];
                    var p1 = json.point.split("|")[1];
                    var point = new BMap.Point(p0, p1);
                    var iconImg = createIcon(json.icon);
                    var marker = new BMap.Marker(point, {icon: iconImg});
                    var iw = createInfoWindow(i);
                    var label = new BMap.Label(json.title, {"offset": new BMap.Size(json.icon.lb - json.icon.x + 10, -20)});
                    marker.setLabel(label);
                    map.addOverlay(marker);
                    label.setStyle({
                        borderColor: "#808080",
                        color: "#333",
                        cursor: "pointer"
                    });

                    (function () {
                        var index = i;
                        var _iw = createInfoWindow(i);
                        var _marker = marker;
                        _marker.addEventListener("click", function () {
                            this.openInfoWindow(_iw);
                        });
                        _iw.addEventListener("open", function () {
                            _marker.getLabel().hide();
                        })
                        _iw.addEventListener("close", function () {
                            _marker.getLabel().show();
                        })
                        label.addEventListener("click", function () {
                            _marker.openInfoWindow(_iw);
                        })
                        if (!!json.isOpen) {
                            label.hide();
                            _marker.openInfoWindow(_iw);
                        }
                    })()
                }
            }

            //创建InfoWindow
            function createInfoWindow(i) {
                var json = markerArr[i];
                var iw = new BMap.InfoWindow("<b class='iw_poi_title' title='" + json.title + "'>" + json.title + "</b><div class='iw_poi_content'>" + json.content + "</div>");
                return iw;
            }

            //创建一个Icon
            function createIcon(json) {
                var icon = new BMap.Icon("http://app.baidu.com/map/images/us_mk_icon.png", new BMap.Size(json.w, json.h), {
                    imageOffset: new BMap.Size(-json.l, -json.t),
                    infoWindowOffset: new BMap.Size(json.lb + 5, 1),
                    offset: new BMap.Size(json.x, json.h)
                })
                return icon;
            }

            //标注线数组
            var plPoints = [{
                style: "solid",
                weight: 4,
                color: "#f00",
                opacity: 0.6,
                points: ["2.134991|48.895959", "2.13844|48.899466", "2.138584|48.894632"]
            }
            ];

            //向地图中添加线函数
            function addPolyline() {
                for (var i = 0; i < plPoints.length; i++) {
                    var json = plPoints[i];
                    var points = [];
                    for (var j = 0; j < json.points.length; j++) {
                        var p1 = json.points[j].split("|")[0];
                        var p2 = json.points[j].split("|")[1];
                        points.push(new BMap.Point(p1, p2));
                    }
                    var line = new BMap.Polyline(points, {
                        strokeStyle: json.style,
                        strokeWeight: json.weight,
                        strokeColor: json.color,
                        strokeOpacity: json.opacity
                    });
                    map.addOverlay(line);
                }
            }

            //文字标注数组
            var lbPoints = [{point: "2.153532|48.885628", content: "我的标记"}
            ];

            //向地图中添加文字标注函数
            function addRemark() {
                for (var i = 0; i < lbPoints.length; i++) {
                    var json = lbPoints[i];
                    var p1 = json.point.split("|")[0];
                    var p2 = json.point.split("|")[1];
                    var label = new BMap.Label("<div style='padding:2px;'>" + json.content + "</div>", {
                        point: new BMap.Point(p1, p2),
                        offset: new BMap.Size(3, -6)
                    });
                    map.addOverlay(label);
                    label.setStyle({borderColor: "#999"});
                }
            }

            initMap();//创建和初始化地图
        </script>
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
                                                      height="110px"
                                                      style="margin-top: 20px;"/></a>
                </div>
                <div style="float: left;margin-left: 12px;">
                    <a href="javascript:void(0)"><img src="${path}/assets/img/code_app_iphone.png" width="100px"
                                                      height="110px"
                                                      style="margin-top: 20px;"/></a>
                </div>
                <div style="float: right;margin-right: 10px;">
                    <a href="javascript:void(0)"><img src="${path}/assets/img/code_wx_tong_tang.png" width="100px"
                                                      height="110px"
                                                      style="margin-top: 22px;"/></a>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>
