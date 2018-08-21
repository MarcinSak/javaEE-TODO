<!DOCTYPE html>
<html>
<head>
<title>Todos-Welcome</title>
<link href="webjars/bootstrap/4.1.3/css/bootstrap.min.css"
	rel="stylesheet">
<link href="webjars/bootstrap/4.1.3/js/bootstrap.min.js"
	rel="stylesheet">
<link href="webjars/jquery/3.3.1/jquery.min.js"
	rel="stylesheet">
	<style>
	
body { 
	width: 100%;
	height:100%;
	font-family: 'Open Sans', sans-serif;
	background: gray;
	}
.login { 
	position: absolute;
	top: 50%;
	left: 50%;
	margin: -150px 0 0 -150px;
	width:300px;
	height:300px;
}
.login h1 { 
	color: #fff; 
	text-shadow: 0 0 10px rgba(0,0,0,0.3); 
	letter-spacing:1px; 
	text-align:center; 
}
.register {
	color: #343434;  
	letter-spacing:2px; 
	text-align:right;	 
	width: 300px;
}
.errorMessageClass {
	text-align: center;
}
input { 
	width: 100%; 
	margin-bottom: 10px; 
	background: rgba(0,0,0,0.3);
	border: none;
	outline: none;
	padding: 10px;
	font-size: 13px;
	color: #fff;
	text-shadow: 1px 1px 1px rgba(0,0,0,0.3);
	border: 1px solid rgba(0,0,0,0.3);
	border-radius: 4px;
	box-shadow: inset 0 -5px 45px rgba(100,100,100,0.2), 0 1px 1px rgba(255,255,255,0.2);
	-webkit-transition: box-shadow .5s ease;
	-moz-transition: box-shadow .5s ease;
	-o-transition: box-shadow .5s ease;
	-ms-transition: box-shadow .5s ease;
	transition: box-shadow .5s ease;
}
input:focus { 
	box-shadow: inset 0 -5px 45px rgba(100,100,100,0.4), 0 1px 1px rgba(255,255,255,0.2); 
}
	</style>
</head>

<body>
	<div class="login">
		<h1>Login</h1>
	    <form method="post" action="/login.do">
	    	<input type="text" name="name" placeholder="Username" required="required" title="" />
	        <input type="password" name="password" placeholder="Password" id="password" required="required" title="" />
	        <button type="submit" class="btn btn-primary btn-block btn-large">Let me in.</button>
	        <div class="register"><a href="/register.do">Register</a></div>
	        <div class="errorMessageClass">${errorMessage}</div>
	    </form>
	</div>
	

</body>
</html>