<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<%@page isELIgnored="false"%>

<!DOCTYPE html>
<html>
<head>
<link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css"
	rel="stylesheet">
<meta charset="UTF-8">
<title>List todos page</title>
</head>
<body>
	<div class="container">
		<h1>Welcome to ${name}</h1>
	</div>
	<hr />
	<div class="container">
		<h3>Your Todos are:</h3>
		<hr />
		<table class="table">
			<thead>
				<tr>
					<th>Id</th>
					<th>Username</th>
					<th>Description</th>
					<th>Target Date</th>
					<th>Is Done?</th>
					<th></th>
					<th></th>
				</tr>
			</thead>

			<tbody>
				<c:forEach items="${todos}" var="todo">
					<tr>
						<td>${todo.id}</td>
						<td>${todo.username }</td>
						<td>${todo.description}</td>
						<td>${todo.localDate}</td>
						<td>${todo.done}</td>
						<td><a href="delete-todo?id=${todo.id }" class="btn btn-warning">Delete</a></td>
						<td><a href="update-todo?id=${todo.id }" class="btn btn-warning">Update</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<a href="add-todo" class="btn btn-success">Add Todo</a>
	</div>

	<script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
	<script src="webjars/jquery/3.7.1/jquery.min.js"></script>
</body>
</html>
