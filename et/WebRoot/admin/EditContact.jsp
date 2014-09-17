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
<title>编辑联系表</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<!-- 引用Admin框架式样 -->
<link rel="stylesheet" type="text/css" href="css/Admin_Style.css">
<!--引用又不msg信息输入区域式样  -->
<link rel="stylesheet" type="text/css" href="css/Admin_AddIntroduction.css">

<!-- UEDITOR配置文件 -->
<script type="text/javascript" charset="utf-8"
	src="plugins/ueditor/ueditor.config.js"></script>
<!-- 编辑器源码文件 -->
<script type="text/javascript" charset="utf-8"
	src="plugins/ueditor/ueditor.all.js">
</script>
<script src="plugins/ueditor/ueditor.lang.zh-cn/zh-cn.js" type="text/javascript"></script>
<!-- 加载编辑器的容器 -->

    
</head>


<body>
<!--在这里引入头部  -->
 	<%@ include file="Admin_Header.jsp" %>
	<div id="body" class="body">
		<div id="js_container" class="container_box cell_layout side_l">
		 <!--在这里引入LeftMenuBar左部菜单栏  -->
		 <%@ include file="Admin_LeftMenuBar.jsp" %>
		 <div class="col_main">
				<div class="main_hd">
					<h1>联系表编辑</h1>
					<p>主要的功能是队简介表进行编辑操作.</p>
				</div>

				<div class="main_bd">
					<div id="js_msgSender" class="msg_sender">
						<div class="msg_tab">
							<div class="tab_panel">
								<form action="Http://www.baidu.com">
										<div class="text_input" >
										<span class = "msg_name"><b >电话  :</b> </span><input id="msg_input_01_01" class="msg_input"
											type="tel" name="txt_01_01" value="" placeholder="例:13648516766!" />
										</div>
										<div class="text_input" >
											<span class = "msg_name"><b >QQ   :</b> </span><input id="msg_input_01_01" class="msg_input"
											type="text" name="txt_01_01"  value="" placeholder="例:820857790"  name="points" />
										</div>
										<div class="text_input" >
											<span class = "msg_name"><b >公司地址   :</b> </span><input id="msg_input_01_01" class="msg_input"
											type="text" name="txt_01_01" value="" placeholder="例:贵州省贵阳市南明区" />
										</div>
										<div class="text_input" >
											<span class = "msg_name"><b >传真   :</b> </span><input id="msg_input_01_01" class="msg_input"
											type="text" name="txt_01_01" value="" placeholder="例:123456789" />
										</div>
										<div class="text_input" >
											<span class = "msg_name"><b >邮箱   :</b> </span><input id="msg_input_01_01" class="msg_input"
											type="email" name="txt_01_01" value="" placeholder="例:820857790@qq.com" />
										</div>
									<div class="text_sub">
										<input  type="submit" value="提    交" style="float:right;position:relative;right:80px;">
										<!-- 	<input type="file" value="浏  览..." />  -->
									</div>
								</form>
								
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	
	<!-- 这里引用Admin_Footer.jsp页脚文件 -->
<%@ include file="Admin_Footer.jsp" %>
</body>

</html>
