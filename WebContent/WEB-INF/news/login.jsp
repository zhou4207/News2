<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登陆</title>
	<meta charset="utf-8">
	<link rel="stylesheet" type="text/css" href="css/main.css">
</head>
<body>
<div class="login_head">
		<div class="container">
			<img src="images/logo.png">
		</div>
	</div>

	<div class="login_banner">
		<div class="container">
			<div class="login">
                <div class="login_in">
                    <div class="login_h">后台登陆</div>
                    <form action="LoginServlet" method="get">
                    <div class="user_login">
                        <input type="text" placeholder="账号" name="username">
                        <input type="text" placeholder="密码" name="password">
                    </div>
                    <div class="img_code">
                        <input type="text" placeholder="验证码" name="code">  
                        <img alt="" src="RandomCodeServlet" onclick="change(this)">
                    </div>
                    <input type="submit" class="login_btn" value="登录"  onclick="getValue(this)">
                    </form>
                </div>
                
            </div>
		</div>
	</div>

	<div class="login_end text_center">版权所有&copy;：新开普电子股份有限公司  豫ICP备08102576号  未经授权本站内容禁止私自转载使用！</div>
	<script type="text/javascript" src="js/md5.js"></script>
	<script type="text/javascript">
		function change(srcObj) {
	        srcObj.src ="RandomCodeServlet?name="+Math.random();
	    };
	</script>
</body>
</html>