<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>图片上传</title>
</head>
<body>
	<form action="http://localhost:8080/hwadee/admin/goods/upload.shtml" method="post" enctype="multipart/form-data">
		<p>大头照：<input type="file" name="uploadFile"></p>
		<p>小头照：<input type="file" name="smallHeadImage"></p>
		<p>艺术照：<input type="file" name="artImage"></p>
		<p>用户名：<input type="text" name="username"></p>
		<p><input type="submit" value="上传"></p>
	</form>
</body>
</html>