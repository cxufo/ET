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
<title>新闻表</title>

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

<!-- UEDITOR配置文件 -->
<script type="text/javascript" charset="utf-8"
	src="plugins/ueditor/ueditor.config.js"></script>
<!-- 编辑器源码文件 -->
<script type="text/javascript" charset="utf-8"
	src="plugins/ueditor/ueditor.all.js"></script>
<script src="plugins/ueditor/ueditor.lang.zh-cn/zh-cn.js"
	type="text/javascript"></script>
</head>


<body>
	<%@ include file="Admin_Header.jsp"%>
	<div id="body" class="body">
		<div id="js_container" class="container_box cell_layout side_l">
			<!--在这里引入LeftMenuBar左部菜单栏  -->
			<%@ include file="Admin_LeftMenuBar.jsp"%>
			<div class="col_main">
				<div class="main_hd">
					<h1>新闻表编辑</h1>
					<p>主要的功能是队联系表进行编辑操作.</p>
				</div>

				<div class="main_bd">
					<div id="js_msgSender" class="msg_sender"
						style="background-color: #FFFFFF;height:100%">
						<div class="msg_tab">
							<div class="tab_panel">
								<div style="border: 1px solid #E7E7EB;">
									<table id="js_msg_table" class="msg_table">
										<tr style="background-color:#E7E7EB ;">
											<th style="width:5%;">编号</th>
											<th>新闻标题</th>
											<th style="width:20%">时间</th>
											<th style="width:10%">操作</th>
										</tr>
										<tr class="spec">
											<td>01</td>
											<td >习近平彭丽媛抵达马尔代夫习丽媛抵达马尔代夫习抵达马尔代夫习近平彭丽媛抵达马尔代夫习近平彭丽媛抵达马尔近平彭丽媛抵达马尔代夫习近平彭丽媛抵达马尔代夫</td>
											<td>2014.09.15</td>
											<td><a href="<%=basePath%>./admin/EditNew.jsp" name="editor">编辑</a>/<a
												href="javascript:;" name="deleter">删除</a>
											</td>
										</tr>
										<%
											for (int i = 0; i < 8; i++) {
										%>
										<tr>
											<td>01</td>
											<td>习近平彭丽媛抵达马尔代夫 乘船前往下榻宾馆</td>
											<td>2014.09.15</td>
											<td><a href="<%=basePath%>./admin/EditNew.jsp" name="editor">编辑</a>/<a
												href="javascript:;" name="deleter">删除</a>
											</td>
										</tr>
										<%
											}
										%>
									</table>
									<script>
										var oTab = document
												.getElementById('js_msg_table');
										var oDe = document
												.getElementsByName('input');
										var oTr = document
												.getElementsByTagName('tr');
										var oAE = document
												.getElementsByName('editor');
										var oAD = document
												.getElementsByName('deleter');
										for (var i = 1; i < oTr.length; i++) {
											/*鼠标点击表格时背景变色*/
											oTr[i].onclick = function() {
												for (var i = 1; i < oTr.length; i++) {
													oTr[i].style = "background-color:#ffffff";
												}
												this.style = "background-color:#F4F5F9";
											}
										}
										for (var i = 0; i < oAD.length; i++) {

											oAD[i].onclick = function() {
												if (confirm("确认要删除吗！")) {
													/* this.parentNode.parentNode.style = "background-color:red;"; */
													oTab.tBodies[0]
															.removeChild(this.parentNode.parentNode);
												}
											}
										}
									</script>
								</div>


							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>

	<!-- 这里引用Admin_Footer.jsp页脚文件 -->
	<%@ include file="Admin_Footer.jsp"%>
</body>

</html>
