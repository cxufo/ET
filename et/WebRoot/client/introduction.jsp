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

<title>公司简介</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0"> 
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<script type="text/javascript" src="<%=basePath%>js/sportframework.js"></script>
<script type="text/javascript" src="<%=basePath%>js/etindex.js"></script>

<link rel="stylesheet" type="text/css"
	href="<%=basePath%>css/common.css">
<link rel="stylesheet" type="text/css"
	href="<%=basePath%>css/etindex.css">
<link rel="stylesheet" type="text/css" href="<%=basePath%>css/intro.css">

<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
-->
</head>

<body>
	<!-- 首页顶部导航栏 -->
	<div id="i-div-top">

		<!-- 导航栏内容块 -->
		<div id="i-div-topContent">

			<!-- 公司logo -->
			<img alt="" src="">

			<!-- 导航项 -->
			<ul id="i-ul-navigation">
				<li><a href="javascript:;">首页</a></li>

				<li class="c-li-leadMore"><a href="javascript:;">简介</a></li>

				<li><a href="javascript:;">服务</a></li>

				<li><a href="javascript:;">新闻动态</a></li>

				<li><a href="javascript:;">招贤纳士</a></li>

				<li><a href="javascript:;">联系我们</a></li>
			</ul>

		</div>

	</div>

	<!-- 首页主体 -->
	<div id="i-div-mainContent">
		<!--  <div class="c-div-introtop" style="background-image:url(<%=basePath%>image/introtop1.jpg)"></div>-->
		<!-- 公司简介 -->
		<div class="c-div-etIntroduction">
			<div class="c-div-etintro"
				style="background-image:url(<%=basePath%>image/et.jpg)">
				<div class="c-div-etbtn">
					<span><a href="<%=basePath%>client/etintroduction.jsp">公司简介</a></span>
				</div>
			</div>
			<div class="c-div-line"></div>
		</div>

		<div class="c-div-teamIntroduction">
			<div class="c-div-teamintro"
				style="background-image:url(<%=basePath%>image/team.png);text-align:center;color:#c2c2c2;font-size:18px;">
				<div style="float:right;margin-top:80px;">
				<p style="margin-left:20px;">积土成山，风雨兴焉；积水成渊，蛟龙生焉；积善成德，而神明自得，故圣心备焉。不积跬步，无以至千里；不积小流，无以成江海。</p>
				<p>骐骥一跃，不能十步；驽马十驾，功在不舍。锲而舍之，朽木不折；锲而不舍，金石可镂；蚓无爪牙之利，筋骨之强，上食埃土，下饮黄</p>
				<p>泉，用心一也。蟹六跪而二螯，非蛇鳝之穴无可寄托者，用心躁也。</p>
				<div class="c-div-teambtn">
					<span><a href="<%=basePath%>client/team.jsp">我们的团队</a></span>
				</div>
				</div>	
				
			</div>

		</div>

		<div class="c-div-cultureIntroduction">
			<div class="c-div-cultureintro"
				style="background-image:url(<%=basePath%>image/culture.png)">
				<div class="c-div-culture"
					style="font-size:16px;float:left;color:#c2c2c2">
					
					<div class="c-div-culturebtn">
					<span><a href="<%=basePath%>client/culture.jsp">我们的文化</a></span>
				    </div>
				</div>
				
			</div>
		</div>

		<div class="c-div-dreamIntroduction">
			<div class="c-div-dreamintro"
				style="background-image:url(<%=basePath%>image/dream.png)">
				<div class="c-div-dreambtn">
					<span><a href="<%=basePath%>client/dream.jsp">我们的愿景</a></span>
				</div>
			</div>
		</div>
	</div>
</body>
</html>
