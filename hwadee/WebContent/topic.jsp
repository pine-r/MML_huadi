<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<link rel="stylesheet" style="text/css" href="css/topic.css">
<link rel="stylesheet" type="text/css" href="css/style.css">
<script type="text/javascript" src="js/jquery-1.11.min.js"></script>
<script type="text/javascript" src="js/etao.js"></script>
<script type="text/javascript" src="js/cart.js"></script>
<link href="css/cart.css" media="screen" rel="stylesheet"
	type="text/css" />
<link href="css/bootstrap.min.css" media="screen" rel="stylesheet"
	type="text/css" />

<html>
<head>
<title>评价</title>

</head>
<body>
	<div class="container">
	<div id="top">
			<ul class="menu1">
				<li><a href="#" class="top_link" style="padding-right: 10px;">欢迎来到米米乐,</a></li>
				<li><a href="#" class="top_link">xxxxxxx</a></li>
			</ul>
			<ul class="menu2">
				<li><a href="#" class="top_link">收藏的店铺</a></li>
				<li><a href="#" class="top_link">我的米米乐</a></li>
				<li><a href="#" class="top_link">订单查询</a></li>
				<li><a href="#" class="top_link">更多</a></li>
			</ul>

		</div>
		<div id="cart_head">
			<div class="logo">
				<img src="images/米米乐logo.jpg">
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
						<li class="keywords"><a href="#">百货|</a></li>
						<li class="keywords"><a href="#">女装|</a></li>
						<li class="keywords"><a href="#">洗护|</a></li>
						<li class="keywords"><a href="#">母婴|</a></li>
						<li class="keywords"><a href="#">食品|</a></li>
						<li class="keywords"><a href="#">电子|</a></li>
						<li class="keywords"><a href="#">运动|</a></li>
						<li class="keywords"><a href="#">男装|</a></li>
						<li class="keywords"><a href="#">其他</a></li>
					</ul>
				</div>
			</div>
		</div>
		<div class="cart_item">
			<a href="#">首页></a> <a href="#">购物车</a>
		</div>
		<!-- 所有的评价放在一个大的div中：detail -->
		<div id="detail">
		<textarea></textarea>
		</div>

		<!-- 综合评价：描述符合度、物流、推荐度，提交 -->
		<div class="alltopic">
			<div>
				描述符合度：
				<form action="main.jsp" method="post" target="_blank">
					<input name="miaoshu" type="radio" name="five-star" checked="checked">五星 
					<input name="miaoshu" type="radio" name="four-star">四星 
					<input name="miaoshu" type="radio" name="three-star">三星 
					<input name="miaoshu" type="radio" name="two-star">二星
					<input name="miaoshu" type="radio" name="one-star">一星
				</form>

			</div>
			<div>
				物流：
				<form action="main.jsp" method="post" target="_blank">
					<input name="wuliu" type="radio" name="five-star" checked="checked">五星 
					<input name="wuliu" type="radio" name="four-star">四星 
					<input name="wuliu" type="radio" name="three-star">三星 
					<input name="wuliu" type="radio" name="two-star">二星 
					<input name="wuliu" type="radio" name="one-star">一星
				</form>
			</div>
			<div>
				推荐度
				<form action="main.jsp" method="post" target="_blank">
					<input name="tuijiandu" type="radio" name="five-star" checked="checked">五星 
					<input name="tuijiandu" type="radio" name="four-star">四星 
					<input name="tuijiandu" type="radio" name="three-star">三星 
					<input name="tuijiandu" type="radio" name="two-star">二星 
					<input name="tuijiandu" type="radio" name="one-star">一星
				</form>
			</div>
			<div>
				<form action="main.jsp" method="post">
					<input type="submit" value="提交" style="width:100px;heigth:50px;" id="sub" />
				</form>
				
			</div>
		</div>
		
	</div>
	<div id="footer">
			<div class="links">
				<a href="#">关于我们</a> | <a href="#">友情链接</a> | <a href="#">商家入驻</a> |
				<a href="#">联系我们</a> | <a href="#">投诉建议</a>
			</div>
			<div class="copyright">
				Copyright&nbsp;&copy;&nbsp;2018-2018&nbsp;&nbsp;米米乐版权所有</div>
		</div>
</body>
</html>