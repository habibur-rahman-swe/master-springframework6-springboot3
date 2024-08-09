<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@page isELIgnored="false"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css"
	rel="stylesheet">
<title>Add todo</title>
</head>
<body>
	<div class="container">
		<h1>Enter new todo details...</h1>
		<form:form method="post" modelAttribute="todo">
			Description: <form:input type="text" path="description"
				required="required" />
			<br />
			<form:errors path="description"></form:errors>
			<br />
			<form:input path="id" type="hidden" />
			<br />
			<form:input path="done" type="hidden" />
			<br />
			<input type="submit" class="btn btn-success" />
		</form:form>
	</div>
	<script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
	<script src="webjars/jquery/3.7.1/jquery.min.js"></script>
</body>
</html>