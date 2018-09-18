<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>确认订单</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link rel="stylesheet" type="text/css" href="css/style.css">
	<link href="css/bootstrap.min.css" media="screen" rel="stylesheet" type="text/css" />
	<link href="css/cart.css" media="screen" rel="stylesheet"
	type="text/css" />
<link href="css/bootstrap.min.css" media="screen" rel="stylesheet"
	type="text/css" />
	<script type="text/javascript" src="js/jquery-1.11.min.js"></script>
<script type="text/javascript">
	function addAddress(address,id){
		var add=$('<input type="radio" name="address"  class="single_address" id="'+id+'">'+address+'<br>');
		var div=$("#address_form");
		div.append(add);
	}
	function addGoods(img,goodsName,price,num,subTotal,id){
		var add=$('<tr style="border-top: 1px solid #e9e9e9;" id="'+id+'"><td><img src="'+img+'"	class="cart_pic" alt="'+goodsName+'"></td><td style="width:50px;height:111px;"></td><td  class="goods_intro">'+goodsName+'</td><td style="width:50px;height:111px;"></td><td class="selling-price number small-bold-red text-right"	style="vertical-align: middle;text-align: center;"	data-bind="'+price+'">'+price+'</td><td style="width:50px;height:111px;"></td><td class="vertical_center" style="vertical-align: middle;text-align:center;">'+num+'</td><td style="width:50px;height:111px;"></td><td class="subtotal number small-bold-red text-right"	style="vertical-align: middle;text-align: center;">'+subTotal+'</td></tr>');
		var div=$("#tbody");
		div.append(add);
	}
	var addressId;
	$(document).on('click','.single_address',function(){
		
		addressId=$(this).attr("id");
	})
	function submitOrder(){
		alert(addressId);
		$.ajax({
			url:"order/create.shtml",
			data:{
				"shippingId":addressId,
			},
			async:false,
			type:"POST",
			dataType:"json",
			success:function(data){
				alert("提交成功");
				window.location.href="unfinishOrder.jsp";
			},
			error:function(err){
				alert("error"+err.status);
			}
		})
		
	}
	$(document).ready(function(){
		$.ajax({
			url:"shipping/list.shtml",
			data:{
			},
			async:false,
			type:"POST",
			dataType:"json",
			success:function(data){
				for(var i=0;i<data.data.list.length;i++){
					addAddress(data.data.list[i].address,data.data.list[i].shippingId);
				}
			},
			error:function(err){
				alert("error"+err.status);
			}
		})
		var total=$("#total");
		$.ajax({
			url:"basket/list.shtml",
			data:{
			},
			async:false,
			type:"POST",
			dataType:"json",
			success:function(data){
				for(var i=0;i<data.data.gasketgoodsVoList.length;i++){
					if(data.data.gasketgoodsVoList[i].goodsChecked){
						addGoods(data.data.gasketgoodsVoList[i].goodsImages,data.data.gasketgoodsVoList[i].goodsName,data.data.gasketgoodsVoList[i].goodsPrice,data.data.gasketgoodsVoList[i].quantity,data.data.gasketgoodsVoList[i].goodsTotalPrice,data.data.gasketgoodsVoList[i].goodsId);
					}
				}
				total.text("￥"+data.data.basketTotalPrice);
			},
			error:function(err){
				alert("error"+err.status);
			}
		})
	})
</script>
  </head>
  
  <body>
    <div class="container">
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
				<a href="shouye.jsp"><img src="images/米米乐logo.jpg" ></a>
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
		<div class="confirm_order_title">
			请填写并核对订单信息：
		</div>
		<div class="order_info">
			<div class="address">
				<div class="info_new">
					<div class="receive_info">
						收货人信息：
					</div>
					<div class="new_address">
						<a href="address.jsp">新增收货地址</a>
					</div>
				</div>
				<div class="select_address">
					<form id="address_form">
					
					</form>
				</div>
			</div>
			<div class="horizontal_small"></div>
			<div class="pay_method">
				<div class="pay_info">支付方式：</div>
				<div class="pay_method_item">
					<input type="radio" name="pay_method" class="single_pay">货到付款
					<input type="radio" name="pay_method" class="single_pay">余额支付
					<input type="radio" name="pay_method" class="single_pay">银行卡支付
					<input type="radio" name="pay_method" class="single_pay">第三方支付宝支付
					<input type="radio" name="pay_method" class="single_pay">第三方微信支付
				</div>
			</div>
			<div class="horizontal_small"></div>
			<div class="deliver_method">
				<div class="deliver_info">配送方式：</div>
				<div class="deliver_method_item">
					<input type="radio" name="deliver_method" class="single_deliver">米米乐配送
					<input type="radio" name="deliver_method" class="single_deliver">第三方物流
				</div>
			</div>
			<div class="horizontal_small"></div>
			<div class="goods_simple_info" >
				<div class="goods_information" >商品信息：</div>
				<div style="text-align:center">
				<table id="cartTable" class="cart  table-condensed" style="margin-left:80px;margin-top:30px;">
				
				<tbody id="tbody">
					
				</tbody>
			</table>
			</div>
			</div>
			<div class="pay_num">
				应付总额：<span id="total"></span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			</div>
			<div class="submit_order">
				<button onclick="submitOrder()">提交订单</button>
			</div>
		</div>
	</div>
  </body>
</html>
