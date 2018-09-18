<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>   
    <title>评价</title>
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
			width:200px;
			heigth:500px;
		}
		
		#star{
			
		}
		
		#star div{
			margin-bottom:10px;
			font-size:20px;
			font-weight:bold;
		}
		#submit{
		
		}
		#submit input{
			float:right;
			margin-right:20px;
			margin-bottom:20px;
			background-color:yellow;
		}

	</style>
  </head>
  
  <body>
  	<div id="container">
  		<div id="head"></div>
  		<h1>评价</h1>
  		<div id="detail">
  			<input type="text" name="topic"/>
  		</div>
  		<div id="star">
  			<div>描述符合度：</div>
  			<div>物流：</div>
  			<div>推荐度：</div>
  		</div>
  		<div id="submit"><input type="submit" name="提交"/></div>
  	</div>
  </body>
</html>
