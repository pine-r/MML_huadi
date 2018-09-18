<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>   
    <title>我的信息</title>
    <style>
    	body{
    		margin:0px;
    		padding:0px;
    		background-color:red;
    		font-size:12px;
    		overflow:hidden;
    		text-align:center;
    		overflow-x:hidden;
    		overflow-y:scroll;
    	}
    	
    	#container{
    		width:100%;
    	}
    	
    	#head{
    		border-radius:25px;
    		background-image:url(images/logo.gif);
    		height:150px;
    		width:100%;    
    	}
    	
    	#detail{
    		width:100%;
    	}
    	
    	#pic{
    		float:left;
    		margin-left:180px;
    		margin-top:80px;
    		transform:scale(3);
    	}
    	
    	#info{
    		font-size:20px;
    		font-weight:bold;
    		margin-left:258px;
    		text-align:center;
    		width:50%;
    		float:left;
    	}
    	
    	#info div{
    		margin-bottom:10px;
    	}
    	
    	#info div input{
    		height:30px;
    		width:250px;
    		border:0px; 
    		background-color:yellow;
    	}
    	
    	a:link{background-color:red;}
    	a:visited{background-color:#FFFF85;}
    	a:hover{background-color:#FF704D;}
    	a:active{background-color:#FF704D;}
    	  	
    </style>
  </head>
  
  <body>
 	<div id="container">
 		<div id="head"></div>
 		<div id="detail">
 		<h1>我的信息：<h1/><br/>
 			<div id="pic">
 				<img alt="用户头像" src="images/head.gif" width=80px heigth=80px/>
 			</div>
 			<div id="info">	
				<div>姓名：<input type="text" name="username"/></div>
 				<div>签名：<input type="text" name="sign" /></div>
 				<div>性别：<input type="text" name="sex" /></div>
 				<div>手机：<input type="text" name="phone" /></div>
 				<div>邮箱：<input type="text" name="email" /></div>
 				<p><a href="address.jsp">我的收货地址</a></p>
 				<p><a href="finance.jsp">我的账户</a></p>
 				<p><a href="">我的浏览历史</a></p>
 				<p><a href="">我的购物车</a></p>
 				<p><a href="">我的订单</a></p>
 				<p><a href="">咨询客服</a></p>
 				
 			</div>
 		</div>
 	</div>
  </body>
</html>
