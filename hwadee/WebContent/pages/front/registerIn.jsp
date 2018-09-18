<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>   
    <title>购物车</title>	
  </head>
  
  <body>
  	<center>
  		<form action="http://localhost:8080/hwadee/registerIn.shtml" method="post">
  			<table>
  				<tr>
  					<td>手机号:</td>
  					<td><input type="text" name="phone" required="required" placeholder="输入手机号">
  				</tr>
  				<tr>
  					<td>密码:</td>
  					<td><input type="password" name="password" required="required" placeholder="输入密码">
  				</tr>
  				<tr>
  					<td>用户名:</td>
  					<td><input type="text" name="userName" required="required" placeholder="输入用户名">
  				</tr>
  				<tr>
  					<td colspan="1"> <input type="submit" value="注册"></td>
  				</tr>
  			
  			</table>
  			
  		</form>
  		<form action="http://localhost:8080/hwadee/checkUserIsExist.shtml" method="post">
  			<table>
  				<tr>
  					<td>手机号:</td>
  					<td><input type="text" name="phone" required="required" placeholder="输入手机号">
  				</tr>
<!--   				<tr> -->
<!--   					<td colspan="1"> <input type="submit" value="注册"></td> -->
<!--   				</tr> -->
  			
  				<tr>
  					<td colspan="1"> <input type="submit" value="检查"></td>
  				</tr>
  			</table>
  			
  		</form>
  		<script>
        
        
/*         function addText(){
            //创建XMLHttpRequest 请求的对象 */
            var request = new XMLHttpRequest();
            // 请求的方式
            var method = "GET";
            // 请求的连接地址
            var url = "http://localhost:8080/hwadee/registerIn.shtml";
            // 初始化请求参数
            request.open("post", url,true);
            // 发送请求
            request.send(null);
            request.onreadystatechange = function(){
                // 如果响应请求
                if(request.readyState==4){
                    // 如果请求成功
                    if(request.status==200 || request.status==304){
                        
                        var text = request.responseText;
                        alert(text);
                        var data = eval("("+text+")");
                        /* var data = JSON.parse(text); */
                        alert(data);
/*                         var span = document.getElementsByTagName("span")[0];
                        span.innerHTML = span.innerHTML+data.user.address.province; */
                    }
                }
            };
            
  //      }

    </script>
  	</center>
  </body>
</html>
