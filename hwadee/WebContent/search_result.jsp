<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<html>
  <head>    
  	<link rel="stylesheet" type="text/css" href="css/style.css">
	<script type="text/javascript" src="js/jquery-1.11.min.js"></script>
	<script type="text/javascript" src="js/etao.js"></script>
	<script type="text/javascript" src="js/cart.js"></script>
	<link href="css/cart.css" media="screen" rel="stylesheet"
	type="text/css" />
	<link href="css/bootstrap.min.css" media="screen" rel="stylesheet"
	type="text/css" />
    <title>首页</title>
    <style>
body, div, dl, dt, dd, ul, ol, li, h1, h2, h3, h4, h5, h6, pre, code,
	form, fieldset, legend, input, textarea, p, blockquote, th, td {
	margin: 0px;
	padding: 0px;
}

body {
	width: 1024px;
	height: 2000px;
	margin: 0px auto;
}

.header {
	width: 1024px;
	height: 40px;
	margin: 0px auto;
}

.links {
	margin-left: 155px;
}

.header .links li {
	margin-top: 7px;
	list-style: none;
	margin-right: 16px;
	float: left;
}

.header .links li a {
	text-decoration: none;
	color: black;
	font-size: 12px;
}

.li1 {
	padding-left: 300px;
}

.right {
	float: right;
	width: 40px;
	height: 2000px;
	background-color: #666;
	margin-top: 0px;
}

.header .logo {
	display: inline;
}

.header .logo img {
	width: 150px;
	height: 76px;
	margin-top: 46px;
	margin-left: 99px;
}

.header .logo .input1 {
	width: 431px;
	height: 37px;
	margin-top: 10px;
	margin-left: 135px;
	border: 1px solid #ff0000;
	margin-top: 0px;
	position: relative;
	bottom: 40px;
}

.header .logo .input2 {
	width: 102px;
	height: 37px;
	background-color: #ff0000;
	color: #ffffff;
	border: 1px solid #ff0000;
	position: relative;
	bottom: 40px;
}

.header .nav {
	width: 987px;
	height: 40px;
	background-color: red;
	font-size: 24px;
}

.header .nav li {
	float: left;
	dislpay: inline;
	list-style: none;
}

.header .nav a {
	color: white;
	margin-left: 40px;
	font-size: 13px;
	color: black;
}

a {
	text-decoration: none;
}

#sh input {
	width: 110px;
	height: 40px;
	text-align: center;
	border: 0px;
	background-color: #ffffff;
}

.content1 {
	float: left;
	width: 984px;
	height: 609px;
	margin: 0px auto;
}

.c-left {
	float: left;
	width: 171px;
	height: 609px;
}

.fenlei {
	width: 145px;
	height: 328px;
	margin-top: 33px;
	margin-left: 9px;
	border: 1px solid red;
}

.c-left li {
	width: 145px;
	line-height: 50px;
	list-style: none;
	font-size: 16px;
	border-bottom: 1px dashed gray;
	text-align: center;
}

.c-left a {
	font-size: 16px;
	color: black;
}

.line1 {
	float: left;
}

.center-div {
	float: left;
	width: 984px;
	height: 24px;
	background-color: red;
}

.shangpin {
	float: left;
	width: 505px;
	padding-left: 15px;
}

.content1 .shangpin .main1 {
	width: 850px;
	margin-top: 20px;
}

.main1 dl {

	float: left;
	width: 240px;
	height: 178px;
	margin:0 5px 60px 5px;
}

.dl1 {
	margin-right: 10px;
}

.price {
	display: block;
}

.tejia {
	float: right;
	width: 267px;
	height: 609px;
	padding: 5px;
}

.tj-header {
	width: 217px;
	height: 122px;
	background-color: red;
	margin-bottom: 10px;
	padding-left: 50px
}

.tj-header p {
	font-size: 40px;
}

.dl3 {
	width: 240px;
	height: 178px;
	background-color: red;
	margin-bottom: 10px;
}

.centent2 {
	float: left;
	width: 984px;
	height: 1028px;
}

.main2 {
	width: 832px;
	height: 244px;
	margin-left: 88px;
	margin-bottom: 5px
}

.m1 {
	margin-top: 27px;
}

.main2 dl {
	float: left;
	width: 400px;
	height: 169px;
	background-color: yellow;
}

.dl2 {
	margin-right: 32px;
}

.footer {
	float: left;
	width: 984px;
	height: 147px;
	background-color: #666;
}

.end-link {
	float: left;
	width: 538px;
	height: 14px;
	margin-left: 55px;
	margin-top: 57px;
	background-color: #666;
}

.end-ma {
	float: left;
	width: 120px;
	height: 120px;
	background-color: white;
	margin-top: 10px;
	margin-left: 50px;
}

.end-link li {
	display: inline;
	margin-right: 30px;
}

.end-link li a {
	color: white;
	font-size: 14px;
}
</style>
<% String keyWord= request.getParameter("key"); %>
<script type="text/javascript" src="js/jquery-1.11.min.js"></script>
<script type="text/javascript">
	function add(img,good,price,id){
		var block=$("<dl class='dl1'><dt><a href='goods_info.jsp'><img style='width:240px;height:128px;' src='"+img+"'></img></a></dt><dd><a href='goods_info.jsp' id='"+id+"'>"+good+"</a><span class='price'>价格："+price+"</span></dd></dl>");
		var div=$(".main1");
		div.append(block);
	}

</script>
<script type="text/javascript">

	$(document).ready(function(){
		var key="<%=keyWord %>";
		var div=$(".main1");
		$.ajax({
			type:"post",
			url:"goods/list.shtml",
			data:{
				"keyword":key,
			},
			success:function(data){
				if(data.success){
					div.empty();
					for(var i=0;i<data.data.list.length;i++){
						add(data.data.list[i].goodsImages,data.data.list[i].goodsName,data.data.list[i].goodsPrice,data.data.list[i].goodsId);
					}
				}
			}
		})
	})
</script>
  </head>
  
  <body>
  	<div id="top">
			<ul class="menu1">
				<li><a href="shouye.jsp" class="top_link" style="padding-right: 10px;">欢迎来到米米乐,</a></li>
				<li><a href="userInfo.jsp" class="top_link">xxxxxxx</a></li>
			</ul>
			<ul class="menu2">
				<li><a href="shouye.jsp" class="top_link">收藏的店铺</a></li>
				<li><a href="userInfo.jsp" class="top_link">我的米米乐</a></li>
				<li><a href="finishOrder.jsp" class="top_link">订单查询</a></li>
				<li><a href="shouye.jsp" class="top_link">更多</a></li>
			</ul>
		</div>
		<div id="cart_head">
			<div class="logo">
				<a href="shoye.jsp"><img src="images/米米乐logo.jpg"></a>
			</div>
			<div class="search_key">
				<div class="search_bar">
					<form>
						<input type="text" placeholder="请输入关键词">
						<button type="submit">搜索</button>
					</form>
				</div>
				<div class="key_item">
					<ul>
						<li class="keywords"><a href="shouye.jsp">百货|</a></li>
						<li class="keywords"><a href="shouye.jsp">女装|</a></li>
						<li class="keywords"><a href="shouye.jsp">洗护|</a></li>
						<li class="keywords"><a href="shouye.jsp">母婴|</a></li>
						<li class="keywords"><a href="shouye.jsp">食品|</a></li>
						<li class="keywords"><a href="shouye.jsp">电子|</a></li>
						<li class="keywords"><a href="shouye.jsp">运动|</a></li>
						<li class="keywords"><a href="shouye.jsp">男装|</a></li>
						<li class="keywords"><a href="shouye.jsp">其他</a></li>
					</ul>
				</div>
			</div>
		</div>
  <div class="header">
		<div class="nav">
				<ul>
				  <li id="sh"><a href="shouye.jsp"><input type="text" value="首页" /></a></li>
                <li><a href="remai.jsp">热卖会场</a></li>              
                <li><a href="temai.jsp">特卖会场</a></li>
                <li><a href="huiyuan.jsp">会员专区</a></li>
                <li><a href="jifen.jsp">积分专区</a></li>
            </ul>
		</div>
	</div>
	<div class="content1">
		<div class="c-left">
			<div class="fenlei">
				<ul>
                	<li>商品分类</li>
                    <li><a href="remaifushi.jsp">服饰</a></li>
                    <li><a href="remaixiebao.jsp">鞋包</a></li>
                    <li><a href="remaimeishi.jsp">美食</a></li>
                    <li><a href="remaijiadian.jsp">家电</a></li>
            	</ul>
            </div>
		</div>
		
		<div class="line1"><img src="images/垂直分隔线.jpg"></img></div>
		<div class="shangpin">
			<div class="main1">
				
			</div>
			
		</div>
		
	</div>
<div id="footer" style="float:left;">
		<div class="links">
			<a href="#">关于我们</a> | <a href="#">友情链接</a> | <a href="#">商家入驻</a> |
			<a href="#">联系我们</a> | <a href="#">投诉建议</a>
		</div>
		<div class="copyright">
		Copyright&nbsp;&copy;&nbsp;2018-2018&nbsp;&nbsp;米米乐版权所有</div>
	</div>
  </body>
</html>
