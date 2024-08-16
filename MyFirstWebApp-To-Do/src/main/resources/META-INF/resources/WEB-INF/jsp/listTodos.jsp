
<%@ include file="common/header.jspf"%>
<%@ include file="common/navigation.jspf"%>

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
					<td><a href="delete-todo?id=${todo.id }"
						class="btn btn-warning">Delete</a></td>
					<td><a href="update-todo?id=${todo.id }"
						class="btn btn-warning">Update</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<a href="add-todo" class="btn btn-success">Add Todo</a>
</div>


<%@ include file="common/footer.jspf"%>
