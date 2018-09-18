<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>   
    <title>我的账户</title>
	<style type="text/css">
		body{
			margin:0px;
			padding:0px;
			background-color:red;
		}
		
		#container{
			width:100%;
			border:5px;
			text-align:center;
		}
		
		#head{
			border-radius:25px;
    		background-image:url(images/logo.gif);
    		height:150px;
    		width:100%;  
    		
		}
		
		#detail{
			margin-top:5px;
			margin-left:15px;
			margin-right:15px;
			height:500px;
			font-size:20px;
			font-weight:bold;
			border:2px solid black;
		}
		#detail p{
			margin-bottom:10px;
		}
		

	</style>
  </head>
  
  <body>
  	<div id="container">
  		<div id="head"></div>
  		<h1>会员财务</h1>
  		<div id="detail">
  			<p>我的会员等级：</p>
  			<p>我的账户余额:</p>
  			<p>我的积分：</p>
  			<p>积分记录：</p>
  		</div>
  	</div>
  </body>
</html>
