<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>   
    <title>确认订单</title>
	<style type="text/css">
		body{
			margin:0px;
			padding:0px;
			background-color:red;
		}
		
		#container{
			width:100%;
			border:1px solid black;
		}
		#head{
			border-radius:25px;
    		background-image:url(images/logo.gif);
    		height:150px;
    		width:100%;  
		}
		#receiveInfo{
			margin-top:5px;
			margin-left:15px;
			margin-right:15px;
			margin-bottom:5px;
			height:300px;
			font-size:20px;
			font-weight:bold;
			border:2px solid black;
		}
		
		#payway{
			margin-top:5px;
			margin-left:15px;
			margin-right:15px;
			margin-bottom:5px;
			height:60px;
			width:100%;
			font-size:20px;
			font-weight:bold;
			border:2px solid black;
			float:left;
		}
		
		#distway{
			margin-top:5px;
			margin-left:15px;
			margin-right:15px;
			margin-bottom:5px;
			height:60px;
			width:100%;
			font-size:20px;
			font-weight:bold;
			border:2px solid black;
			float:left;
		}
		#goodsInfo{
			margin-top:5px;
			margin-left:15px;
			margin-right:15px;
			margin-bottom:5px;
			height:60px;
			width:100%;
			font-size:20px;
			font-weight:bold;
			border:2px solid black;
			float:left;
		}
		#totalmoney{
			margin-top:5px;
			margin-left:15px;
			margin-right:15px;
			margin-bottom:5px;
			height:75px;
			width:100%;
			font-size:20px;
			font-weight:bold;
			border:2px solid black;
			float:left;
		}
		#totalmoney p{
			font-size:25px;
		}
		#totalmoney p input{
			margin-right:10px;
			margin-bottom:10px;
			background-color:yellow;
			float:right;
		}
	</style>
  </head>
  
  <body>
  	<div id="container">
  		<div id="head"></div>
  		<h1>请填写并核对订单信息：</h1>
  		<h2>收货人信息：</h2>
  		<div id="receiveInfo">
  			
  		</div>
  		<h2>支付方式</h2>
  		<div id="payway">
  		
  		</div>
  		<h2>配送方式</h2>
  		<div id="distway">
  		
  		</div>
  		<h2>商品信息</h2>
  		<div id="goodsInfo">
  		
  		</div>
  		<div id="totalmoney">
  			应付总额:
  			<p><input type="submit" name="提交订单"/></p>
  		</div>
  		
  	</div>
  </body>
</html>
