<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<link rel="stylesheet" type="text/css" href="css/finishOrder.css"/>
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
    <title>未完成订单</title>
    <script>
    function addUnfinishOrderItem(img,desc,num,totalMoney){
		var orderRow=$('<tr style="border-top: 1px solid #e9e9e9;"><td><img src='+img+'class="cart_pic" alt="订单"></td><td class="goods_intro">'+desc+'</td><td class="vertical_center" style="vertical-align: middle;"><div class="input-group input-group-sm">'+num+'</div></td><td class="subtotal number small-bold-red text-right"style="vertical-align: middle;text-align: center;">'+totalMoney+'</td><td><div class="btn btn-primary">去付款</div></td></tr>');
		var mainBody=$("tbody");
		mainBody.append(orderRow);
	}
    	$(document).ready(function(){
    		$.ajax({
    			type:"post",
    			url:"order/list.shtml",
    			asycn:false,
    			data:{
    				
    			},
    			success:function(data){
   
    				if(data.success){
    					for(var i=0;i<data.data.list.length;i++){
    						if(data.data.list[i].status==10)
    							addUnfinishOrderItem(data.data.list[i].goodsImage,data.data.list[i].orderNum,data.data.list[i].orderItemVoList.length,data.data.list[i].payment);
    					}
    				}
    			},
    			error:function(jqXHR){
						alert("error!!!"+jqXHR.status+"\n"+"jqXHR.readyStatus="+jqXHR.readyState);
					}
    		})
    	})
    	
    	
    	
    	$(document).on('click','.btn',function(){
    		//alert(this.parentNode.parentNode.firstChild.nextSibling.nodeName);
    		var orderNum=$(this.parentNode.parentNode.firstChild.nextSibling).text();
    		alert(orderNum);
    		 $.ajax({
    			url:"order/pay.shtml",
    			type:"POST",
    			asycn:false,
    			data:{
    				"orderNo":orderNum,
    			},
	    		success:function(data){
	    			var payurl=data.data.qrUrl;
	    			window.location.href(payurl);
//	    			alert(payurl);
	    		},
	    		error:function(err){
	    			alert(err.status);
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
		<div class="cart_item">
			<a href="shouye.jsp">首页></a> <a href="#">未完成订单</a>
		</div>
  	
  		<div id="detail">
  			<div id="detail-left">
					<div id="finish-link">未完成<br/></div>
					<div><a href="waitReceive.jsp">待完成</a><br/></div>
					<div><a href="finishOrder.jsp"><b>已完成</b></a></div>
			</div>
			<div id="detail-right">
				<div class="order-wrap">
					<table id="cartTable" class="cart  table-condensed">
				<thead>
					<tr>
						<th class="t-goods"><label>图片</label></th>
						<th class="t-goods">订单号</th>
						<th class="t-qty text-center"><label>商品数量</label></th>
						<th class="t-subtotal text-center"><label>小计</label></th>
						<th class="t-action"><label>操作</label></th>
					</tr>
				</thead>
				<tbody>	
				</tbody>
			</table>
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
  	</div>
  </body>
</html>
