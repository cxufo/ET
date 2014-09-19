
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
				<div class="new_box_title">新闻动态>>正文>></div>
				<div class="new_box_zhengwen" >
					<div class="new_box_zhengwen_title">
						<span style="font-size:30px;">安全行车提示—校车安全出行专题</span> <br /> <br />
						<span>2014-09-18 20:27:17 来源：贵州省公安厅交通管理局</span>
					</div>
					<div class="new_box_zhengwen_body"
						style = "color: #000 font-family: Verdana, Arial, Tahoma; font-size: 17px; line-height: 25px;">
						当前各地学校陆续开学，中小学通勤校车、大学长途返校客流骤增。尤其是经过暑期休整后，部分校车驾驶人
						及校车线路发生调整，一些校车技术状况出现变化。特别是中秋小长假与秋季开学第一个双休日重叠，学生回家团聚客
						流集中，与节日中短途旅游客流叠加，校车及接送学生车辆交通安全风险增大。为此，我局编写了开学季校车安全出行
						提示，请各地立即下载，通过短信平台、微博微信等方式，及时推送至所有校车驾驶人、学校负责人以及尽可能多的学
						生家长，提醒注意交通安全，引导学生增强交通安全防护意识，严防由于新驾驶人不熟悉路线、车辆安全状况不良引发 群死群伤事故。
						一、今年中秋节与秋季开学第一个双休日相接，周末学生回家团聚、节后乘车返校集中。交警提示，请学校和家长提前
						提醒学生不要乘坐超员车，不要搭乘低速载货汽车和三轮汽车、拖拉机等非载客车辆。祝广大师生中秋节快乐！
						二、7月10日，湖南长沙发生一起幼儿园校车坠入路侧水塘造成11人死亡的事故。近期各地降雨增多，路面湿滑，交警
						提示，请广大校车、接送学生车辆驾驶人注意谨慎驾驶，遇雨天泥泞道路或者行经窄桥窄路、坡道弯路、临崖临水等危
						险路段，请注意观察路况，确认安全的情况下低速通过，切忌超速、争道抢行。
						三、学生是祖国的未来、家庭的希望，校车安全无小事。交警提示，请严格遵守《校车安全管理条例》，确保校车保持
						良好安全技术状况，驾驶校车严格遵章守法，不使用无牌无证、无许可无资质、不符合安全技术标准的车辆接送学生。
						四、驾驶校车接送学生请保持安全车速，在高速公路上最高时速不得超过80公里，在其他道路上最高时速不得超过60公
						里，在急弯、陡坡、窄路、窄桥最高时速不得超过20公里。
						五、学生上学，安全第一。请广大学生家长自觉抵制黑校车、违法超员车辆，发现接送学生的不合法车辆、超员客车以
						及低速载货汽车、三轮汽车、拖拉机违法搭载学生的，请及时向公安交通管理部门举报。
						六、秋冬季节，公路客货运输繁忙，雨雪雾冰等恶劣天气较多，交通事故易发多发。交警提示，驾车接送学生上下学，
						请严格遵守交通安全法律法规，提前熟悉行驶路线，掌握天气变化情况，并保持身体状况良好，心态平和，不超员、不
						超速，不疲劳驾驶，不酒后开车，不开斗气车。
						七、客车超员影响车身稳定性，导致车辆制动性能下降，严重危害行车安全。交警提示，校车、接送学生车辆驾驶人请
						严格按照核定载客人数载运学生，切勿超员载客。请学校及学生家长积极配合交警，主动监督并教育学生自觉抵制超员 车辆。
						八、驾驶车辆接送学生，请选择安全地点停靠车辆，并在确保安全的情况下，组织学生依次、有序上下车辆。夜间停靠
						请及时开启示廓灯、危险报警闪光灯。请勿在行车道、人行横道、弯坡路段违法停车接送学生。
						九、交警提示，汽车周围存在多处视觉盲区，学生下车后，校车驾驶人在车辆起步或倒车时应注意观察，避免碰撞到刚
						下车的学生以及附近其他学生、儿童。
						十、车辆安全是交通安全的基础。驾驶校车上道路行驶，请提前对车辆的制动、转向、外部照明、轮胎、安全门、座椅
						、安全带等部件进行检查，确保车辆技术状况良好。请勿驾驶存在安全隐患的车辆接送学生、幼儿。
						十一、在校车接送学生、幼儿期间，请押车教师认真履行职责，提醒孩子不将身体探出车外，帮助孩子系好安全带，及
						时制止校车超速、超员、不按审核确定的路线行驶、不按规定在校车站点停靠上下学生等违法行为。</div>

				</div>


				<!-- <ul class = "new_box_group">
							<li class=  "new_list_item">
									<a href = ""></a>
									<span></span>
									<p></p>
							</li>	
					</ul> -->

			</div>
			<!-- <div class="new_main_box_right ">
			</div>
			 -->

		</div>


	</div>


	<!-- /*主题部分*/ -->
	<!-- <div id="" class="client_mainContent">
		<div class="main_box_topimg">
			<img alt="" src="image/zhaopintopimg.png"
				style="height:100%;width:100%;margin-left:0%">
		</div>
		<div class="main_box_center"
			style="-moz-box-shadow: -5px -5px 5px #888888; 
	box-shadow: -5px -5px 5px #888888; ">
			<div class="main_box_center_txt"
				style="/* pobackground-color:#59BAE4 ; */ ">
				<div style="height:80px;line-height:80px;font-size:25px;">
					&nbsp&nbsp招贤纳士:</div>
				<div class="main_box_center_txt_zhaopinimg">
					<img alt="" src="image/zhaopintupian01.png">
				</div>
				<div class="main_box_center_txt_zhaopintxt">
					<div class="zhappin_txt">
						<T1>职位:</T1>
						网络开发人员<br />
					</div>
					<div class="zhappin_txt">
						<T1>学历:</T1>
						大专及本科学历<br />
					</div>
					<div class="zhappin_txt">
						<T1>人数:</T1>
						2人<br />
					</div>
					<div class="zhappin_txt">
						<T1>有效期:</T1>
						2014.09.20-2014.12.30<br />
					</div>
					<div class="zhappin_txt">
						<T1>类型:</T1>
						公司直招<br />
					</div>
					<div class="zhappin_txt">
						<T1>工作地点:</T1>
						贵州省贵阳市南明区沙冲南路最空间B栋15楼1号<br />
					</div>
				</div>

				<div class="main_box_center_txt_zhaopinxiangqing">
					<T1>详情:</T1>
					<br /> &nbsp&nbsp&nbsp&nbsp&nbspCSS3 边框 通过
					CSS3，您能够创建圆角边框，向矩形添加阴影，使用图片来绘制边框 - 并且不需使用设计软件，比如 PhotoShop。
					在本章中，您将学到以下边框属性： border-radius box-shadow border-image <br />
				</div>
			</div>
		</div>
	</div> -->



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

