<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<html>
  <head>   
  	 
  	<link rel="stylesheet" type="text/css" href="css/style.css">
	<script type="text/javascript" src="js/jquery-1.11.min.js"></script>
	<script type="text/javascript" src="js/etao.js"></script>
	<script type="text/javascript" src="js/cart.js"></script>
	<link href="css/cart.css" media="screen" rel="stylesheet"
	type="text/css" />
	<link href="css/bootstrap.min.css" media="screen" rel="stylesheet"
	type="text/css" />
	<script type="text/javascript">
	/* function load(){
		alert("!!");
		$("#user").css({"background-color":"blue"});
	}	
	window.onload=load(); */
	$(document).ready(function(){
		/* alert("hhhhh");
		$("#user").css({"color":"blue"}); */
		
		$.ajax({
			type:"post",
			url:"http://localhost:8080/hwadee/getUser.shtml",
			data:{
			
			},
			success:function(data){
				if(data.success){
					alert(data.data.userName);
					$("#user").text(data.data.userName);
			

				}
			},
			error:function(jqXHR){
				alert("error!!!"+jqXHR.status+"\nreadyState="+jqXHR.readyState);
			}
		});
	})
			
	</script>
    <title>首页</title>
    <style>
  		body,div,dl,dt,dd,ul,ol,li,h1,h2,h3,h4,h5,h6,pre,code,form,fieldset,legend,input,textarea,p,blockquote,th,td{
			margin:0px;
			padding:0px;
		}
		body{
			width:1024px;
			height:2000px;
			margin:0px auto;
		}
		.header{
			width:1024px;
			height:40px;
			margin:0px auto;
		
		}
		.links{
			
			margin-left:155px;
		}
		.header .links li{
			margin-top:7px;
			list-style:none;
			margin-right:16px;	
			float:left;
		
		}
		.header .links li a{
			text-decoration:none;
			color:black;
			font-size:12px;
		}
		.li1{
		padding-left:300px;
	}
	.right{
		float:right;
		width:40px;
		height:2000px;
		background-color:#666;
		margin-top:0px;
	}
	.header .logo{
		display:inline;
		
		
	}
	.header .logo img{
		width:150px;
		height:76px;
		margin-top:46px;
		margin-left:99px;
	}
	.header .logo .input1{
		width:431px;
		height:37px;
		margin-top:10px;
		margin-left:135px;
		border:1px solid #ff0000;
		margin-top:0px;
		position:relative;
		bottom:40px;
	}
	.header .logo .input2{
		width:102px;
		height:37px;
		background-color:#ff0000;
		color:#ffffff;
		border:1px solid #ff0000;	
		position:relative;
		bottom:40px;
	}
	.header .nav{
		width:987px;
		height:40px;
		background-color:red;
		font-size:24px ;
	}
	.header .nav li{
		float:left;
		dislpay:inline;
		list-style:none;
	}
	.header .nav a{
		color:white;
		margin-left:40px;
		font-size:13px;
		color:black;
	}
	a{
		text-decoration:none;
		
	}
	#sh input{
		width:110px;
		height:40px;
		text-align:center;
		border:0px;
		background-color:#ffffff;
	}
	.content1{
		float:left;
		width:984px;
		height:609px;
		margin:0px auto;
	}
	.c-left{
		float:left;
		width:171px;
		height:609px;
	
	}
	.fenlei{
		width:145px;
		height:328px;
		margin-top:33px;
		margin-left:9px;
		border:1px solid red;
	}
	.c-left li{
		width:145px;
		line-height:50px;
		list-style:none;
		font-size:16px;
		border-bottom:1px dashed gray;
		text-align:center;
	}
	.c-left a{
		font-size:16px;
		color:black;
	}
	.line1{
		float:left;
	}
	.center-div{
		float:left;
		width:984px;
		height:24px;
		background-color:red;
	}
	.shangpin{
		float:left;
		width:505px;
		height:609px;
		padding-left:15px;
	}
	.content1 .shangpin .main1{
		width:850px;
		height:278px;
		margin-top:20px;
		
	}
	.main1 dl{
		float:left;
		width:240px;
		height:178px;
		background-color:red;
	}
	.dl1{
		margin-right:10px;
	}
	.price{
		display:block;
	}
	.tejia{
		float:right;
		width:267px;
		height:609px;
		padding:5px;
		
	}
	.tj-header{
		width:217px;
		height:122px;
		background-color:red;
		margin-bottom:10px;
		padding-left:50px

	}
	.tj-header p{	
		font-size:40px;

		
	}
	.dl3{
		width:240px;
		height:178px;
		background-color:red;
		margin-bottom:10px;
	}
	.centent2{
		float:left;
		width:984px;
		height:1028px;
	
	}
	
	.main2{
		width:832px;
		height:244px;
		margin-left:88px;
		margin-bottom:5px	
	}
	
	.m1{
		margin-top:27px;
	}
	.main2 dl{
		float:left;
		width:400px;
		height:169px;
		background-color:yellow;
	}
	.dl2{
		margin-right:32px;
	}
	.footer{
		float:left;
		width:984px;
		height:147px;
		background-color:#666;
	}
	.end-link{
		float:left;
		width:538px;
		height:14px;
		margin-left:55px;
		margin-top:57px;
		background-color:#666;
	}
	.end-ma{
		float:left;
		width:120px;
		height:120px;
		background-color:white;
		margin-top:10px;
		margin-left:50px;
	}
	.end-link li{
		display:inline;
		margin-right:30px;
	}
	.end-link li a{
		color:white;
		font-size:14px;
	}
</style>

  </head>
  
  <body>
  	<div id="top">
			<ul class="menu1">
				<li><a href="shouye.jsp" class="top_link" style="padding-right: 10px;">欢迎来到米米乐,</a></li>
				<li><a href="userInfo.jsp" class="top_link" id="user">xxxxxxx</a></li>
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
				<a href="shoye.jsp"><img src="images/米米乐logo.jpg"></a>
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
  <div class="header">
		<div class="nav">
				<ul>
				  <li id="sh"><a href="shouye.jsp"><input type="text" value="首页" /></a></li>
                <li><a href="remai.jsp">热卖会场</a></li>              
                <li><a href="temai.jsp">特卖会场</a></li>
                <li><a href="huiyuan.jsp">会员专区</a></li>
                <li><a href="jifen.jsp">积分专区</a></li>
            </ul>
		</div>
	</div>
	<div class="content1">
		<div class="c-left">
			<div class="fenlei">
				<ul>
                	<li>商品分类</li>
                    <li><a href="remaifushi.jsp">服饰</a></li>
                    <li><a href="remaixiebao.jsp">鞋包</a></li>
                    <li><a href="remaimeishi.jsp">美食</a></li>
                    <li><a href="remaijiadian.jsp">家电</a></li>
            	</ul>
            </div>
		</div>
		<div class="line1"><img src="images/垂直分隔线.jpg"></img></div>	
		
		<div class="shangpin">
			<div class="main1">
				<dl class="dl1">
					<dt><a href="goods_info.jsp"><img src="images/1c786f7b1127305f6332b955c110c5c6.jpg"></img></a></dt>
					<dd>
						<a href="goods_info.jsp">智能手机&nbsp;&nbsp;6+128G超大屏</a>
						<span class="price">价格：</span>
					</dd>
				</dl>
				<dl class="dl1">
					<dt><a href="goods_info.jsp"><img src="images/67bcfac2f27f2a32b47912c7a32e5410.jpg"></img></a></dt>
					<dd><a href="goods_info.jsp">精品美酒&nbsp;&nbsp;值得拥有</a></dd>
				</dl>	
			</div>
			<div class="main1">
				<dl class="dl1">
					<dt><a href="goods_info.jsp"> <img src="images/7314de282fe1522e92b7a538b65366a6.gif"></img></a></dt>
					<dd></dd>
				</dl>
				<dl class="dl1">
					<dt><a href="goods_info.jsp"><img src="images/sahngpin3.jpg"></img></a></dt>
					<dd></dd>
				</dl>
			</div>
			
		</div>
		<div class="line1"><img src="images/垂直分隔线.jpg"></img></div>
		<div class="tejia">
			<div class="tj-header">
				<P>特价商品</P>
			</div>
			<div>
				<dl class="dl3">
					<dt><a href="goods_info.jsp"><img src="images/a23dd5b2b7fc72067303f94df54d69e8.jpg"></img></a></dt>
					<dd></dd>
				</dl>
			</div>
			<div>
				<dl class="dl3">
					<dt><a href="goods_info.jsp"><img src="images/sahngpin3.jpg"></img></a></dt>
					<dd></dd>
				</dl>
			</div>
		</div>
	</div>
  	<div class="center-div"></div>
  	<div class="centent2">
  		<div class="main2 m1">
				<dl class="dl2">
					<dt><a href="goods_info.jsp"><img src="images/0c487e3224e5830731aad196f38c7a34.jpg"></img></a></dt>
					<dd></dd>
				</dl>
				<dl >
					<dt><a href="goods_info.jsp"><img src="images/117798adaa9cb712c8791a179c0a3802.jpg"></img></a></dt>
					<dd></dd>
				</dl>
		</div>
		<div class="main2">
				<dl class="dl2">
					<dt><a href="goods_info.jsp"><img src="images/e265ac07dbae78a111be522acff6f321.jpg"></img></a></dt>
					<dd></dd>
				</dl>
				<dl >
					<dt><a href="goods_info.jsp"><img src="images/c1034f289eb7ba032568faeb8bf39efb.jpg"></img></a></dt>
					<dd></dd>
				</dl>
		</div>	
		<div class="main2">
				<dl class="dl2">
					<dt><a href="goods_info.jsp"><img src="images/b159a1f280806c5677895b4bddcb294a.jpg"></img></a></dt>
					<dd></dd>
				</dl>
				<dl>
					<dt><a href="goods_info.jsp"><img src="images/e265ac07dbae78a111be522acff6f321.jpg"></img></a></dt>
					<dd></dd>
				</dl>
		</div>	
		<div class="main2">
				<dl class="dl2">
					<dt><a href="goods_info.jsp"><img src="images/c1034f289eb7ba032568faeb8bf39efb.jpg"></img></a></dt>
					<dd></dd>
				</dl>
				<dl >
					<dt><a href="goods_info.jsp"><img src="images/7134198d774ca23d1c43cfd99c1ea646.jpg"></img></a></dt>
					<dd></dd>
				</dl>
			</div>			
  	</div>
<div id="footer" style="float:left;">
		<div class="links">
			<a href="#">关于我们</a> | <a href="#">友情链接</a> | <a href="#">商家入驻</a> |
			<a href="#">联系我们</a> | <a href="#">投诉建议</a>
		</div>
		<div class="copyright">
		Copyright&nbsp;&copy;&nbsp;2018-2018&nbsp;&nbsp;米米乐版权所有</div>
	</div>
  </body>
</html>
