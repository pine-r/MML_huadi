<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<link rel="stylesheet" type="text/css" href="css/userInfo.css">
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
    <title>我的信息</title>
    <script type="text/javascript">
        //var files = document.getElementById('pic').files;
        var form = new FormData();//通过HTML表单创建FormData对象
        var url = '127.0.0.1:8080/'
        function selectFile(){
            var files = document.getElementById('pic').files;
            console.log(files[0]);
            if(files.length == 0){
                return;
            }
            var file = files[0];
            //把上传的图片显示出来
            var reader = new FileReader();
            // 将文件以Data URL形式进行读入页面
            console.log(reader);
            reader.readAsBinaryString(file);
            reader.onload = function(f){
                var result = document.getElementById("image");
                var src = "data:" + file.type + ";base64," + window.btoa(this.result);
                result.innerHTML = '<img src ="'+src+'"/>';
            }
            console.log('file',file);
            form.append('file',file);
            console.log(form.get('file'));
        }
    </script>
    <script type="text/javascript">
    	$(document).ready(function(){

    		$("#btn-submit").click(function(){
	    		var name=$("#name").val();
	    		var sex=$("#sex").find("option:selected").text();
	    		var phone=$("#phone").val();
	    		var email=$("#email").val();    
	    		alert(sex);
    			$.ajax({
    			type:"POST",
					url:"updateInformation.shtml",
					data:{
						"userName":name,
						"userSex":sex,
						"userPhone":phone,
						"userEmail":email
					},
					success:function(data){
						if(data.success){
							alert("修改成功！");
							window.location.href="userInfo.jsp";
						}
					},
					error:function(jqXHR){
						alert("error!!!"+jqXHR.status);
					}
    			});
    		});
    		
    	});
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
			<a href="shouye.jsp">首页></a> <a href="#">个人信息</a>
		</div>
  		
 		<div id="detail">
 			<div id="detail-pic">
 				<div id="image">
 				</div>
 				<div id="image-port">
	 				<form method="post" enctype="multipart/form-data" id="formBox" name="pic-form">
		 				<input type="file" id="pic" name="pic" accept="image/*" onchange="selectFile()">
		 			</form>  
 				</div>			   
 			</div>

 			<div id="info">	
				<div class="info-item">
					<div class="info-prefix">姓名：</div>
					<div class="info-prefix-select">
						<input type="text" name="username" id="name"/>
					</div>
				</div>
				<div class="info-item">
 					<div class="info-prefix">性别：</div>
					<div class="info-prefix-select" id="sex">
	 					<select id="sex">
	 						<option class="selectSex">null</option>
	 						<option class="selectSex">男</option>
	 						<option class="selectSex">女</option>
	 					</select>	
					</div>		
 				</div>
 			
 				<div class="info-item">
 					<div class="info-prefix">手机：</div>
 					<div class="info-prefix-select">
 						<input type="text" name="phone" id="phone"/>
 					</div>
 				</div>
 				<div class="info-item">
 					<div class="info-prefix">邮箱：</div>
 					<div class="info-prefix-select">
 						<input type="text" name="email" id="email"/>
 					</div>
 				</div>	
 				
 				<div class="info-item">
 					<div id="btn-submit" class="btn btn-primary info-prefix">提交</div>
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
