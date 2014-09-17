<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>公司简介</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<script type = "text/javascript" src = "<%=basePath%>js/sportframework.js"></script>
	<script type = "text/javascript" src = "<%=basePath%>js/etindex.js"></script>
	
	<link rel="stylesheet" type="text/css" href="<%=basePath%>css/common.css">
	<link rel="stylesheet" type="text/css" href="<%=basePath%>css/etindex.css">	
	<link rel="stylesheet" type="text/css" href="<%=basePath%>css/intro.css">
	
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  <body>
        <!-- 首页顶部导航栏 -->
	<div id = "i-div-top">
		
		<!-- 导航栏内容块 -->
		<div id = "i-div-topContent">
			
			<!-- 公司logo -->
			<img alt="" src="">
			
			<!-- 导航项 -->
			<ul id = "i-ul-navigation">
				<li>
					<a href = "javascript:;">首页</a>
				</li>
				
				<li class = "c-li-leadMore">
					<a href = "javascript:;">简介</a>					
				</li>
				
				<li>
					<a href = "javascript:;">服务</a>
				</li>
				
				<li>
					<a href = "javascript:;">新闻动态</a>
				</li>
				
				<li>
					<a href = "javascript:;">招贤纳士</a>
				</li>
				
				<li>
					<a href = "javascript:;">联系我们</a>
				</li>
			</ul>
		
		</div>
		
	</div>

	<!-- 首页主体 -->
	<div id = "i-div-mainContent" style="background-color:#f8f8f7">
	
	    <div style="height:900px;width:900px;margin-left:25%;background-image:url(<%=basePath%>/image/textback.png);">	    
	           <div style="margin-top:50px; float:left;text-align:center;">
	           </div>	   
	    </div>
	</div>
	
	<div class="c-div-buttom" style="height:100px;width:100%;background:#EBEBEB">
	     <div  style="width:100%;height:50px;text-align:center;font-size:14px;margin-top:30px; float:left;"><span>贵州一特电子商务有限公司,无微不至的服务给最美的你！</span></div>
	</div>
	
  </body>
</html>
