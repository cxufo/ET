<%-- <%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%> --%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>LeftMenuBar</title>
</head>

<body>
				<div class="col_side">
				<div class="menu_box" id="menuBar">
					<dl class="menu no_extra ">
						<dt class="menu_title">
							<span class="menu_title_icon"><img
								src="image/gongnengIcon.png" /></span> 发布信息
						</dt>
						<dd class="menu_item selected">
							<a href="admin/AddIntroduction.jsp">增加简介</a>
						</dd>
						<dd class="menu_item ">
							<a href="admin/AddNew.jsp">新闻动态</a>
						</dd>
						<dd class="menu_item ">
							<a href="admin/AddContact.jsp">增加联系</a>
						</dd>
						<dd class="menu_item selected">
							<a href="admin/AddService.jsp">添加服务</a>
						</dd>
						<dd class="menu_item ">
							<a href="admin/AddRecruitment.jsp">招聘发布</a>
						</dd>
						<dd class="menu_item ">
							<a href="admin/AddTeamIntroduction.jsp">团队介绍</a>
						</dd>
					</dl>
					<dl class="menu ">
						<dt class="menu_title">
							<span class="menu_title_icon"><img
								src="image/gongnengIcon.png" /></span> 编辑信息
						</dt>
						<dd class="menu_item selected">
							<a href="admin/QueryIntroduction.jsp">简介编辑</a>
						</dd>
						<dd class="menu_item ">
							<a href="admin/QueryNew.jsp">新闻动态编辑</a>
						</dd>
						<dd class="menu_item ">
							<a href="admin/EditContact.jsp">联系编辑</a>
						</dd>
						<dd class="menu_item selected">
							<a href="admin/QueryService.jsp">服务编辑</a>
						</dd>
						<dd class="menu_item ">
							<a href="admin/QueryRecruitment.jsp">招聘编辑</a>
						</dd>
						<dd class="menu_item ">
							<a href="admin/QueryTeamIntroduction.jsp">团队编辑</a>
					</dl>
					<dl class="menu ">
						<dt class="menu_title">
							<span class="menu_title_icon"><img
								src="image/gongnengIcon.png" /></span> 图片管理
						</dt>
						<dd class="menu_item selected">
							<a href="/">消息管理</a>
						</dd>
						<dd class="menu_item ">
							<a href="/">用户管理</a>
						</dd>
						<dd class="menu_item ">
							<a href="/">素材管理</a>
						</dd>
				</div>
			</div>
		
</body>

</html>
