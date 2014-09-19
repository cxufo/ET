<%-- <%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%> --%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
<title>index</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<!-- 引用Admin框架式样 -->
<link rel="stylesheet" type="text/css" href="css/Admin_Style.css">
<!--引用又不msg信息输入区域式样  -->
<link rel="stylesheet" type="text/css"
	href="css/Admin_AddIntroduction.css">
<!--引用index的样式  -->
<link rel="stylesheet" type="text/css" href="css/Admin_index.css">
<!-- UEDITOR配置文件 -->
<script type="text/javascript" charset="utf-8"
	src="plugins/ueditor/ueditor.config.js"></script>
<!-- 编辑器源码文件 -->
<script type="text/javascript" charset="utf-8"
	src="plugins/ueditor/ueditor.all.js"></script>
<script src="plugins/ueditor/ueditor.lang.zh-cn/zh-cn.js"
	type="text/javascript"></script>
<style>
</style>
</head>


<body>
	<!-- <input id="from" value="login">
	<input name="returnurl" value=""> -->
	<div id="box">
		<!--<a class="leftflag png b_flag" id="reg" for="reg"
			href="http://www.58pic.com/zhuce/" onfocus="this.blur();"><span>注册</span></a><a
			class="leftflag png c_flag" id="login" for="login"
			href="http://www.58pic.com/denglu/" onfocus="this.blur();"><span>登录</span></a> <a
			id="returnIndex" href="http://www.58pic.com/">&lt;&lt;返回首页</a> -->
		<form name="loginform" id="loginform" method="post"
			action="/et/admin/QueryNew.jsp" target="main"
			onsubmit="return smtLogin();">
			<div id="wrap" class="png">
				<div id="logo" class="png">
					<a href="/et/admin/QueryNew.jsp" title="贵州ET官网后台管理中心"><img
						class="png" src="./image/ET504020140910141913.png" width="100%"
						height="100%" alt="贵州ET" title="贵州ET"></a>
				</div>
				<div id="login_box">
					<ul class="input_ul">
						<li class="clearfix"><div id="div1" class="fl png">
								<input t="1" class="inputbox org_style" name="username"
									id="loginusername" v="用户名" value="用户名" type="text">
							</div>
							<div id="login_t1" class="tip png"></div></li>
						<li class="clearfix"><div id="div2" class="fl png">
								<input t="2" class="inputbox org_style" value="密码"
									id="loginpassword_t" type="password"><input t="2"
									class="inputbox none" name="password" id="loginpassword"
									type="password">
							</div>
					</ul>
					<input id="login_button" onfocus="this.blur();"
						class="png login_disable" value="" type="submit">
				</div>
			</div>
		</form>
	</div>



	<!-- <script type="text/javascript">
		DD_belatedPNG.fix('.header-logo, .png-fix');
		DD_belatedPNG.fix('.circle_act');
	</script>
	<![endif]
	[if lte IE 6]>
	<script src="http://icon.58pic.com/js/ie6png.js"></script>
	<script>
		DD_belatedPNG.fix('.png');
	</script>
	<![endif]>
	<script type="text/javascript"
		src="http://icon.58pic.com/js/login_reg.js?v1"></script>
	<script>
		$(document).ready(function() {
			$(".js-num-click,js-xiangxi-click").mouseover(function() {
				$(".num-xiangxi").show()
			}).mouseout(function() {
				$(".num-xiangxi").hide()
			});

			$(".js-qq").click(function() {
				$("#TB_overlayBG").css({
					display : "block",
					height : $(document).height()
				});
				$(".box").css({
					display : "block"
				});
			})
			$(".close").click(function closer() {
				$("#TB_overlayBG").css("display", "none");
				$(".box ").css("display", "none");
				return false;
			});
			$("#TB_overlayBG").click(function() {
				$("#TB_overlayBG").css("display", "none");
				$(".box ").css("display", "none");
			});
		});
	</script>
	<script type="text/javascript">
		var bd = new Date();
		var bd_begin = bd.getTime();
	</script>

	<script type="text/javascript">
		var bda = new Date();
		var bd_end = bda.getTime();
		var bdTime = bd_end - bd_begin;
	</script> -->

</body>

</html>
