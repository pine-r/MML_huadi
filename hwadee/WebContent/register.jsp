<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>注册页面</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
	<link rel="stylesheet" type="text/css" href="css/style.css">
	
	<script type="text/javascript" src="js/jquery-1.11.min.js"></script>
	<script>
		function yanzheng(){
			
		}
		$(document).ready(function(){
		
			$("button").click(function(){
				if($("#userName").val()==""||$("#userMobile").val()==""||
				$("#validate").val()==""||$("#userPsw").val()==""||
				$("#userPsw2").val()==""){
					alert("请检查是否有地方没填!");
					return;
				}
				if($("#userPsw").val()!=$("#userPsw2").val()){
					alert("两次密码不一样，请检查后提交!");
					return;
				}
				if($("input[type='checkbox']").is(':checked')==false){//检查是否勾选复选框
					alert("请先阅读并同意协议!");
					return;
				}
				var username=$("#userName").val();
				var password=$("#userPsw").val();
				var phone=$("#userMobile").val();
				$.ajax({
					url:"registerIn.shtml",
					type:"POST",
					data:{
						"userName":username,
						"phone":phone,
						"password":password,
					},
					dataType:"json",
					success:function(data){
						if(data.success){
							alert("注册成功，请确认跳转到登录界面");
							window.location.href="login.jsp";
						}else{
							alert(JSON.stringify(data));
							alert("注册失败!可能用户名已经存在，请换一个用户名试试");
						}
					},
					error:function(err){
						alert("error!"+err.status);
					}
				})
				
			})
		})
	</script>
  </head>
  
  <body>
  	<div class="login_head">
		<a href="shouye.jsp"><img src="images/米米乐logo.jpg" ></a>
		<span class="login">欢迎注册</span>
	</div>
<div id="wrap_login">
	<div class="user_reg">
		<h3>用户注册</h3>
		<div class="content">
			<!-- <form action="#" method="post"> -->
				<div class="user-name">
					<input type="text" name="userName" id="userName" placeholder="用户名" >
				</div>
				<div class="user-mobile">
					<input type="text" name="userMobile" id="userMobile" placeholder="手机号">
				</div>
				<div class="validate">
					<input type="number" name="validate" id="validate" placeholder="短信验证码">
					<button class="get-validate">获取验证码</button>
				</div>
				<div class="user-psw">
					<input type="password" name="password" id="userPsw" placeholder="密码">
				</div>
				<div class="user-psw">
					<input type="password" name="password" id="userPsw2" placeholder="确认密码">
				</div>
				<div class="check">
					<input type="checkbox" name="agreement" id="agreement">阅读并同意<a href="#">《米米乐用户协议》</a>
				</div>
				<div class="btns">
					<button >同&nbsp;意&nbsp;并&nbsp;注&nbsp;册</button>
				</div>
			<!-- </form> -->
			
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
