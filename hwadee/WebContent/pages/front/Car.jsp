<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>   
    <title>购物车</title>
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
		#detail input{
			margin-bottom:10px;
			
			heigth:500px;
		}
		
		#star{
			margin-top:5px;
			margin-left:15px;
			margin-right:15px;
			height:60px;
			width:100%;
			font-size:20px;
			font-weight:bold;
			border:2px solid black;
			float:left;
		}
		
		#star div{
			margin-bottom:10px;
			font-size:20px;
			font-weight:bold;
		}
		#star div input{
			background-color:yellow;
		}

	</style>
  </head>
  
  <body>
  	<div id="container">
  		<div id="head"></div>
  		<h1>购物车</h1>
  		<div id="detail">
  			<input type="text" name="topic"/>
  		</div>
  		<div id="star">
  			<div><a href="">删除所选商品</a></div>
  			<div>总价:</div>
  			<div><input type="submit" name="去结算"/></div>
  		</div>
  		
  	</div>
  </body>
</html>
