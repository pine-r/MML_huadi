<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>找回密码</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
	<link rel="stylesheet" type="text/css" href="css/style.css">

  </head>
  
  <body>
  <div class="login_head">
		<a href="shouye.jsp"><img src="images/米米乐logo.jpg" ></a>
		<span class="login">找回密码</span>
	</div>
	<div id="wrap_findpw">
		<div class="user_findpw">
			<h3>找回密码</h3>
			<div class="content">
				<form action="#" method="post">
					<div class="user-mobile">
						<input type="text" name="userMobile" id="userMobile" placeholder="手机号/email">
					</div>
					<div class="validate">
						<input type="number" name="validate" id="validate" placeholder="输入验证码">
						<button class="get-validate">获取验证码</button>
					</div>
					<div class="user-psw">
						<input type="password" name="password" id="userPsw" placeholder="新密码">
					</div>
					<div class="user-psw">
						<input type="password" name="password" id="userPsw" placeholder="确认密码">
					</div>
					<div class="btns">
						<button type="submit" style="float: left;">取&nbsp;消</button>
						<button type="submit" style="float: right;">提&nbsp;交</button>
					</div>
				</form>

			</div>
		</div>
	</div>
	<div id="footer">
		<div class="links">
			<a href="#">关于我们</a>
			|
			<a href="#">友情链接</a>
			|
			<a href="#">商家入驻</a>
			|
			<a href="#">联系我们</a>
			|
			<a href="#">投诉建议</a>
		</div>
		<div class="copyright">
			Copyright&nbsp;&copy;&nbsp;2018-2018&nbsp;&nbsp;米米乐版权所有
		</div>
	</div>
  </body>
</html>
