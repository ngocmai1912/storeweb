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
        <link href="//fonts.googleapis.com/css?family=Roboto:300,300i,400,400i,700,700i" rel="stylesheet">
        <title>Sign Up Form</title>
        <style><%@include file="css/signup.css"%></style>
    </head>
    <body>
        <!-- main -->
	<div class="main-w3layouts wrapper">
		<h1>Sign Up</h1>
                
		<div class="main-agileinfo">
			<div class="agileits-top">
				<form action="signup" method="post">
                                    <p class="text-danger">${mess}</p>
                                        <input name="username" class="text" type="text" placeholder="Username" required="">
					<input name="email" class="text email" type="email" placeholder="Email" required="">
					<input name="password" class="text" type="password" placeholder="Password" required="">
					<!--<input name="repass" class="text w3lpass" type="password" placeholder="Confirm Password" required="">-->
					
					<input type="submit" value="SIGNUP">
				</form>
				<p>Don't have an Account? <a href="Login.jsp"> Login Now!</a></p>
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