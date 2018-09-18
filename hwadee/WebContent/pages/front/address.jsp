<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>   
    <title>我的收货地址</title>
    <style>
    	body{
    		margin:0px;
    		border:0px;
    		padding:0px;
    		background-color:red;
    		overflow:hidden;
    		text-align:center;
    		overflow-x:hidden;
    		overflow-y:scroll;
    	}
    	
    	#container{
    		width:100%;
    		text-align:left;
    	}
    	
    	#head{
    		border-radius:25px;
    		background-image:url(images/logo.gif);
    		height:150px;
    		width:100%; 
    	}
    	
    	#detail{
    		margin-top:30px;
    		margin-left:150px;
    		width:100%;
    		font-size:25px;
    	}
    	
    	#detail p{
    		margin-bottom:10px;
    	}
    	
    	#detail p input{
    		height:30px;
    		width:250px;
    		border:0px; 
    		background-color:yellow;
    	}
    	.mar{
    		margin-left:25px;
    	}
    </style>
  </head>
  
  <body>
  	<div id="container">
  		<div id="head"></div>
  		 <h1>我的收获地址</h1>
  		<div id="detail">
  			<p class="mar">地址一：<input type="text" name="address1">  <a href="">修改</a>  <a href="">删除</a>  </p>
  			<p class="mar">地址二：<input type="text" name="address2">  <a href="">修改</a>  <a href="">删除</a>  </p>
  			<p class="mar">地址三：<input type="text" name="address3">  <a href="">修改</a>  <a href="">删除</a>  </p>
  			<p>增加地址：<input type="text" name="addAddress"></p>
  		</div>
  	</div>
  </body>
</html>
