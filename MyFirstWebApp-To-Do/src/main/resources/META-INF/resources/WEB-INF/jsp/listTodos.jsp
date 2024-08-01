<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<%@page isELIgnored="false"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>List todos page</title>
</head>
<body>
	<div>
		<h1>Welcome to ${name}</h1>
	</div>
	<hr />
	<div>
		<h3>Your Todos are:</h3>
		<hr />
		<table>
			<thead>
				<tr>
					<th>Id</th>
					<th>Username</th>
					<th>Description</th>
					<th>Target Date</th>
					<th>Is Done?</th>
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
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>
