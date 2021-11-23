<%-- 
    Document   : SignUp
    Created on : Nov 16, 2021, 11:50:24 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
        <!-- Custom Theme files -->
        <link href="css/signup.css" rel="stylesheet" type="text/css" media="all" />
        <!-- //Custom Theme files -->
        <!-- web font -->
        
        <link href="//fonts.googleapis.com/css?family=Roboto:300,300i,400,400i,700,700i" rel="stylesheet">
        <style><%@include file="css/signup.css"%></style>
        <title>Sign Up Form</title>
    </head>
    <body>
        <!-- main -->
	<div class="main-w3layouts wrapper">
		<h1>Sign Up</h1>
                
		<div class="main-agileinfo">
			<div class="agileits-top">
				<form action="signup" method="post">
                                    <p class="text-danger">${mess}</p>
                                        <input name="user" class="text" type="text" placeholder="Username" required="">
					<input name="email" class="text email" type="email" placeholder="Email" required="">
					<input name="pass" class="text" type="password" placeholder="Mật khẩu" required="">
					<input name="repass" class="text w3lpass" type="password" placeholder="Xác nhận mật khẩu" required="">
					<div class="wthree-text">
						<label class="anim">
							<input type="checkbox" class="checkbox" required="">
							<span>Tôi đồng ý với điều kiện và điều khoản sử dụng</span>
						</label>
						<div class="clear"> </div>
					</div>
					<input type="submit" value="SIGNUP">
				</form>
				<p>Đã có tài khoản <a href="Login.jsp"> Đăng nhập ngay!</a></p>
			</div>
		</div>
		<ul class="colorlib-bubbles">
			<li></li>
			<li></li>
			<li></li>
			<li></li>
			<li></li>
			<li></li>
			<li></li>
			<li></li>
			<li></li>
			<li></li>
		</ul>
	</div>
	<!-- //main -->
    </body>
</html>