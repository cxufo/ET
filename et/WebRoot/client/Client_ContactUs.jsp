
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

<title>联系我们</title>

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
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
</head>

<body style="height: 400px;">
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

	</div>
	<!-- /*主体部分*/ -->
	<div id="" class="client_mainContent">
		<div class="main_box_topimg">
			<img alt="" src="image/contact.jpg"
				style="height:100%;width:130%;margin-left:-12%">
		</div>
		<div class="main_box_center"
			style="-moz-box-shadow: 5px 5px 5px #888888; 
	box-shadow: 5px 5px 5px #888888; ">
			<div class="main_box_center_txt"
				style="/* background-color:#7F84D3; */ ">
				<div
					style="height:80px;line-height:80px;font-size:25px;margin-bottom: 0px;">
					&nbsp&nbsp联系我们:</div>
				<div class="main_box_center_txt_lianxi">
					<img alt="" src="image/chuanzhenlianxi.png">&nbsp传真:112345666<br />
				</div>
				<div class="main_box_center_txt_lianxi">
					<img alt="" src="image/qqlianxi.png">&nbspQ&nbsp&nbspQ:820857790
					820857790<br />
				</div>
				<div class="main_box_center_txt_lianxi">
					<img alt="" src="image/dianhualianxi01.png">&nbsp电话:13648516765
					1367516765<br />
				</div>
				<div class="main_box_center_txt_lianxi">
					<img alt="" src="image/youxianglianxi.png">&nbsp邮箱:820857910@qq.com
					820857790@qq./ocm &nbsp&nbsp<br />
				</div>
				<div class="main_box_center_txt_lianxi">
					<img alt="" src="image/dizhilianxi.png">&nbsp地址:贵州省贵阳市南明区沙冲南路最空间b栋15楼一号<br />
				</div>
			</div>
		</div>
	</div>
	<!-- <!-- 首页主体 
	<div id="i-div-mainContent"
		style="height:900px;background-color:#DEDEDE ">
		<div class="main_box_topimg">
			<img alt="" src="image/contact.jpg"
				style="height:100%;width:130%;margin-left:-12%">
		</div>
		<div class="main_box">
			<div class="main_box_center">
				<div class="main_box_center_txt" style="background-color:#7F84D3; ">
					<div style="height:80px;line-height:80px;font-size:25px;">
						&nbsp&nbsp联系我们:</div>
					<div class="main_box_center_txt_lianxi">
						<img alt="" src="image/chuanzhenlianxi.png">&nbsp传真:112345666<br />
					</div>
					<div class="main_box_center_txt_lianxi">
						<img alt="" src="image/qqlianxi.png">&nbspQ&nbsp&nbspQ:820857790
						820857790<br />
					</div>
					<div class="main_box_center_txt_lianxi">
						<img alt="" src="image/dianhualianxi01.png">&nbsp电话:13648516765
						1367516765<br />
					</div>
					<div class="main_box_center_txt_lianxi">
						<img alt="" src="image/youxianglianxi.png">&nbsp邮箱:820857910@qq.com
						820857790@qq./ocm &nbsp&nbsp<br />
					</div>
					<div class="main_box_center_txt_lianxi">
						<img alt="" src="image/dizhilianxi.png">&nbsp地址:贵州省贵阳市南明区沙冲南路最空间b栋15楼一号<br />
					</div>
				</div>
			</div>
		</div>
	</div> -->

	<div class="c-div-buttom"
		style="height:100px;width:100%;background:#DEDEDE;border-top: 1px solid #070707;">
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

