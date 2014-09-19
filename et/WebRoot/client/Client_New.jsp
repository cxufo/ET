
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>招贤纳士</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<script type="text/javascript" src="<%=basePath%>js/sportframework.js"></script>
<script type="text/javascript" src="<%=basePath%>js/etindex.js"></script>
<!-- 引用Admin框架式样 -->
<link rel="stylesheet" type="text/css" href="css/Admin_Style.css">
<link rel="stylesheet" type="text/css"
	href="<%=basePath%>css/common.css">
<link rel="stylesheet" type="text/css"
	href="<%=basePath%>css/etindex.css">
<link rel="stylesheet" type="text/css" href="<%=basePath%>css/intro.css">
<link rel="stylesheet" type="text/css"
	href="<%=basePath%>css/Client_ContactUs.css">
<link rel="stylesheet" type="text/css"
	href="<%=basePath%>css/Client_New.css">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
</head>

<body style="height: 600px;">
	<!-- 首页顶部导航栏 -->
	<div id="i-div-top">
		<!-- 导航项 -->
		<div id="i-div-navigation">
			<ul id="i-ul-navigation">
				<li style="background-color: #ED1C24;"><a href="index.jsp">&nbsp;&nbsp;<img
						alt="" src="<%=basePath%>image/icons/home.png"><br>&nbsp;&nbsp;首页
				</a></li>

				<li style="background-color: #FF7F27;"><a
					href="client/index.jsp  ">&nbsp;&nbsp;<img alt=""
						src="<%=basePath%>image/icons/introduction.png"><br>&nbsp;&nbsp;简介
				</a></li>

				<li style="background-color: #FFCC00;"><a
					href="client/index.jsp ">&nbsp;&nbsp;<img alt=""
						src="<%=basePath%>image/icons/service.png"><br>&nbsp;&nbsp;服务
				</a></li>

				<li style="background-color: #22B14C;"><a
					href="client/Client_New.jsp">&nbsp;&nbsp;<img alt=""
						src="<%=basePath%>image/icons/newspaper.png"><br>新闻动态
				</a></li>

				<li style="background-color: #00A2E8;"><a
					href=" client/Client_Recruitment.jsp">&nbsp;&nbsp;<img alt=""
						src="<%=basePath%>image/icons/zhaoping.png"><br>招贤纳士
				</a></li>

				<li style="background-color: #3F48CC;"><a
					href="client/Client_ContactUs.jsp">&nbsp;&nbsp;<img alt=""
						src="<%=basePath%>image/icons/contact.png"><br>联系我们
				</a></li>
			</ul>
		</div>
	</div>


	<div id="" class="client_mainContent">
		<div class="main_box_topimg">
			<img alt="" src="image/zhaopintopimg.png"
				style="height:100%;width:100%;margin-left:0%">
		</div>

		<div class="new_main_box">
			<div class="new_main_box_leftnewlist">
				<div class="new_box_title">新闻动态>></div>
				<ul class="new_box_group">
					<li class="new_list_item"><a href="client/Client_New_Show.jsp">安全行车提示-校车安全出行专题</a>
						<img alt="" src="http://www.che03.com/statics/images/boot/new.gif">
						<span class="list_item_righttime">2014-09-18 20:27:17</span>
						<p class="list_new_neirong_jianjie">
							当前各地学校陆续开学，中小学通勤校车、大学长途返校客流骤增。尤其是经过暑期休整后，部分校车驾驶人及校车线路发生调整，一些校车技
							... <a href="client/Client_New_Show.jsp" style="float: right;">[查看全文]</a>
						</p></li>
					<li class="new_list_item"><a href="client/Client_New_Show.jsp">安全行车提示-校车安全出行专题</a>
						<img alt="" src="http://www.che03.com/statics/images/boot/new.gif">
						<span class="list_item_righttime">2014-09-18 20:27:17</span>
						<p class="list_new_neirong_jianjie">
							当前各地学校陆续开学，中小学通勤校车、大学长途返校客流骤增。尤其是经过暑期休整后，部分校车驾驶人及校车线路发生调整，一些校车技
							... <a href="client/Client_New_Show.jsp" style="float: right;">[查看全文]</a>
						</p></li>
					<li class="new_list_item"><a href="client/Client_New_Show.jsp">安全行车提示-校车安全出行专题</a>
						<img alt="" src="http://www.che03.com/statics/images/boot/new.gif">
						<span class="list_item_righttime">2014-09-18 20:27:17</span>
						<p class="list_new_neirong_jianjie">
							当前各地学校陆续开学，中小学通勤校车、大学长途返校客流骤增。尤其是经过暑期休整后，部分校车驾驶人及校车线路发生调整，一些校车技
							... <a href="client/Client_New_Show.jsp" style="float: right;">[查看全文]</a>
						</p></li>
					<li class="new_list_item"><a href="client/Client_New_Show.jsp">安全行车提示-校车安全出行专题</a>
						<img alt="" src="http://www.che03.com/statics/images/boot/new.gif">
						<span class="list_item_righttime">2014-09-18 20:27:17</span>
						<p class="list_new_neirong_jianjie">
							当前各地学校陆续开学，中小学通勤校车、大学长途返校客流骤增。尤其是经过暑期休整后，部分校车驾驶人及校车线路发生调整，一些校车技
							... <a href="client/Client_New_Show.jsp" style="float: right;">[查看全文]</a>
						</p></li>
					<li class="new_list_item"><a href="client/Client_New_Show.jsp">安全行车提示-校车安全出行专题</a>
						<img alt="" src="http://www.che03.com/statics/images/boot/new.gif">
						<span class="list_item_righttime">2014-09-18 20:27:17</span>
						<p class="list_new_neirong_jianjie">
							当前各地学校陆续开学，中小学通勤校车、大学长途返校客流骤增。尤其是经过暑期休整后，部分校车驾驶人及校车线路发生调整，一些校车技
							... <a href="client/Client_New_Show.jsp" style="float: right;">[查看全文]</a>
						</p></li>
					<li class="new_list_item"><a href="client/Client_New_Show.jsp">安全行车提示-校车安全出行专题</a>
						<img alt="" src="http://www.che03.com/statics/images/boot/new.gif">
						<span class="list_item_righttime">2014-09-18 20:27:17</span>
						<p class="list_new_neirong_jianjie">
							当前各地学校陆续开学，中小学通勤校车、大学长途返校客流骤增。尤其是经过暑期休整后，部分校车驾驶人及校车线路发生调整，一些校车技
							... <a href="client/Client_New_Show.jsp" style="float: right;">[查看全文]</a>
						</p></li>
				</ul>
				<!-- <div class="new_box_nextpage">
						下一页
				</div> -->
			</div>
			<!-- <div class="new_main_box_right ">
			</div>
			 -->
		</div>
	</div>

	<div class="c-div-buttom"
		style="height:100px;width:100%;background:#DEDEDE;border-top: 1px solid red;">
		<div
			style="width:100%;height:40px;text-align:center;font-size:14px;margin-top:20px; float:left;">
			<span>贵州一特电子商务有限公司,无微不至的服务给最美的你！</span>
			<div id="footer" class="foot"
				style="padding:10px auto;background-color:#DEDEDE;color:#222222;">
				<ul class="links ft">
					<li class="links_item no_extra"><a
						style="color:#222222; font-size: 14px;"
						href="http://www.tencent.com" target="_blank">关于ET</a></li>
					<li class="links_item"><a
						style="color:#222222; font-size: 14px;"
						href="http://www.baidu.com" target="_blank">服务协议</a></li>
					<li class="links_item"><a
						style="color:#222222; font-size: 14px;"
						href="http://www.baidu.com" target="_blank">运营规范</a></li>
					<li class="links_item"><a
						style="color:#222222; font-size: 14px;"
						href="http://www.baidu.com" target="_blank">客服中心</a></li>
					<li class="links_item"><a
						style="color:#222222; font-size: 14px;"
						href="http://wpa.qq.com/msgrd?V=1&Uin=2676151959&Site=121ask.com&Menu=yes"
						target="_blank">在线客服</a></li>
					<li class="links_item"><a
						style="color:#222222; font-size: 14px;"
						href="mailto:2676151959@qq.com" target="_blank">联系邮箱</a></li>
					<li class="links_item"><a
						style="color:#222222; font-size: 14px;"
						href="http://www.baidu.com" target="_blank">侵权投诉</a></li>
					<li class="links_item"><p class="copyright"
							style="font-size: 14px;">Copyright © 2012-2014 GuiZhouET. All
							Rights Reserved.</p></li>
				</ul>
			</div>
		</div>
	</div>
</body>
</html>

