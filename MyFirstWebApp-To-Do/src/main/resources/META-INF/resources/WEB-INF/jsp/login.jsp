<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css"
	rel="stylesheet">
<title>Login Page</title>
</head>
<body>
	<div class="container">
		Welcome to the login page!
		<pre>${errorMessage}</pre>
		<form method="post" class="form">
			Name: <input type="text" name="name"> Password: <input
				type="password" name="password"> <input type="submit">
		</form>
	</div>
	<script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
	<script src="webjars/jquery/3.7.1/jquery.min.js"></script>
</body>
</html>