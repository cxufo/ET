<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
	

	<script type = "text/javascript" src = "<%=basePath%>js/sportframework.js"></script>
	<script type = "text/javascript" src = "<%=basePath%>js/etindex.js"></script>

	<link rel="stylesheet" type="text/css" href="<%=basePath %>css/common.css">
	<link rel="stylesheet" type="text/css" href="<%=basePath %>css/etindex.css">

		
  </head>
  
  <body style = "height: 10000px;">
    
    <!-- 首页顶部导航栏 -->
	<div id = "i-div-top">
		
		<!-- 导航栏内容块 -->
		<div id = "i-div-topContent">
			
			<!-- 公司logo -->
			<img class = "c-img-etLogo" alt="" src="">
			
			
		</div>
		
		<!-- 导航项 -->
		<div id = "i-div-navigation">
			<ul id = "i-ul-navigation">
				<li style = "background-color: #ED1C24;">
					
					<a href = "javascript:;">&nbsp;&nbsp;<img alt="" src="<%=basePath %>image/icons/home.png"><br>&nbsp;&nbsp;首页</a>
				</li>
				
				<li style = "background-color: #FF7F27;">
					<a href = "javascript:;">&nbsp;&nbsp;<img alt="" src="<%=basePath %>image/icons/introduction.png"><br>&nbsp;&nbsp;简介</a>					
				</li>
				
				<li style = "background-color: #FFCC00;">
					<a href = "javascript:;">&nbsp;&nbsp;<img alt="" src="<%=basePath %>image/icons/service.png"><br>&nbsp;&nbsp;服务</a>
				</li>
				
				<li style = "background-color: #22B14C;">
					<a href = "javascript:;">&nbsp;&nbsp;<img alt="" src="<%=basePath %>image/icons/newspaper.png"><br>新闻动态</a>
				</li>
				
				<li style = "background-color: #00A2E8;">
					<a href = "javascript:;">&nbsp;&nbsp;<img alt="" src="<%=basePath %>image/icons/zhaoping.png"><br>招贤纳士</a>
				</li>
				
				<li style = "background-color: #3F48CC;">
					<a href = "javascript:;">&nbsp;&nbsp;<img alt="" src="<%=basePath %>image/icons/contact.png"><br>联系我们</a>
				</li>
			</ul>
		</div>
		
	</div>
	
	
	
	
	<!-- 首页主体 -->
	<div id = "i-div-mainContent">
	
		<!-- 首页banner -->
		<div id = "i-div-banner">
			
			<!-- banner背景 -->
			<div id = "i-div-bannerBg">  <!-- banner背景图 -->
				<ul>
					<li class = "active" style="background-image: url(<%=basePath %>image/44.jpg);"></li>
					<li style="background-image: url(<%=basePath %>image/22(1).jpg);"></li>
					<li style="background-image: url(<%=basePath %>image/3back.jpg);"></li>
				</ul>
			</div>
			
			<!-- banner底部  图片小按钮 -->
			<div id = "i-div-bannerBottom">
				<ul id = "i-ul-bannerBottom">
					<li class = "active"></li>
					<li></li>
					<li></li>
				</ul>
			</div>
			
		</div>
		
	</div>

</body>
</html>