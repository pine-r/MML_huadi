<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<link rel="stylesheet" type="text/css" href="css/address.css" />
<link rel="stylesheet" type="text/css" href="css/style.css">
<script type="text/javascript" src="js/jquery-1.11.min.js"></script>
<script type="text/javascript" src="js/etao.js"></script>
<script type="text/javascript" src="js/cart.js"></script>
<script type="text/javascript" src="js/address.js"></script>
<link href="css/cart.css" media="screen" rel="stylesheet"
	type="text/css" />
<link href="css/bootstrap.min.css" media="screen" rel="stylesheet"
	type="text/css" />
<html>
  <head>   
    <title>我的收货地址</title>
    <script type="text/javascript">
    	$(document).ready(function(){
			$.ajax({
				type:"POST",
				url:"shipping/list.shtml",
				data:{
				
				},
				success:function(data){
					//alert("44444");
					if(data.success){
						
						var address1=data.data.list[0].address+" "+data.data.list[0].phone+" "+data.data.list[0].zip;
						if(data.data.list[1]!=null)
						var address2=data.data.list[1].address+" "+data.data.list[1].phone+" "+data.data.list[1].zip;
						if(data.data.list[2]!=null)
						var address3=data.data.list[2].address+" "+data.data.list[2].phone+" "+data.data.list[2].zip;
						$("#address1").text(address1);
						$("#address2").text(address2);
						$("#address3").text(address3);
					}
				},
				error:function(jqXHR){
					alert("error!!!"+jqXHR.status);
				}
			});
		
	});
    </script>
  </head>
  
  <body>
  	<div id="container">
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
				<a href="shouye.jsp"><img src="images/米米乐logo.jpg"></a>
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
			<a href="shouye.jsp">首页></a><a href="userInfo.jsp">个人信息></a> <a href="address.jsp">我的地址</a>
		</div>  		 
  		<div id="detail">
  		<form >
  			<div id="detail-long">
  			<div class="default-address">默认地址</div>
  			<div class="address-right">
  			<!--   <input type="text" id="address1" value="地址一" class="detail-right-input"> --> 
  			<div id="address1" class="address-input"></div>
  				<div class="change-delete"><a href="#">修改</a>  <a href="#" onclick="shanchu(this.parentNode.parentNode)">删除</a></div>
  			</div>
  			</div>
  			
  			<div id="detail-long">
  			<div class="address-right">
  			<!-- <input type="text" id="address2" value="地址二" class="detail-right-input">   -->
  			<div id="address2" class="address-input"></div>
  				<div class="change-delete"><a href="#">修改</a>  <a href="#" onclick="shanchu(this.parentNode.parentNode)">删除</a></div>
  			</div>
  			</div>
  			
  			<div id="detail-long">
  			<div class="address-right">
  			<!-- <input type="text" id="address3" value="地址三" class="detail-right-input"> -->
  			<div id="address3" class="address-input"></div>
  			 	<div class="change-delete"><a href="#">修改</a>  <a href="#" onclick="shanchu(this.parentNode.parentNode)">删除</a></div>
  			</div>
  			</div>
  			
  			<div id="detail-long">
  			<div class="address-right">
  			<input type="text" name="address1"  class="detail-right-input">  <a href="addAddress.jsp">新建地址</a>
  			</div>
  			</div>		
	</form>
  		</div>
  		<div id="footer">
			<div class="links">
				<a href="#">关于我们</a> | <a href="#">友情链接</a> | <a href="#">商家入驻</a> |
				<a href="#">联系我们</a> | <a href="#">投诉建议</a>
			</div>
			<div class="copyright">
				Copyright&nbsp;&copy;&nbsp;2018-2018&nbsp;&nbsp;米米乐版权所有</div>
		</div>
  	</div>
  </body>
</html>
