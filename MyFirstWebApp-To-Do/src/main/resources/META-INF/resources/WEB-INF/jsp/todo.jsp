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
<link
	href="webjars/bootstrap-datepicker/1.10.0/css/bootstrap-datepicker.css"
	rel="stylesheet">
<title>Add todo</title>
</head>
<body>
	<div class="container">
		<h1>Enter new todo details...</h1>
		<form:form method="post" modelAttribute="todo">
			<fieldset class="mb-3">
				<form:label path="id">Id : </form:label>
				<form:input type="number" path="id" required="required" />
				<form:errors path="id" cssClass="text-warning"></form:errors>
			</fieldset>
			<fieldset class="mb-3">
				<form:label path="done">Done : </form:label>
				<form:input type="boolean" path="done" required="required" />
				<form:errors path="done" cssClass="text-warning"></form:errors>
			</fieldset>
			<fieldset class="mb-3">
				<form:label path="description">Description : </form:label>
				<form:input type="text" path="description" required="required" />
				<form:errors path="description" cssClass="text-warning"></form:errors>
			</fieldset>
			<fieldset class="mb-3">
				<form:label path="localDate">Local Date : </form:label>
				<form:input type="datetime" id="localDate" path="localDate" required="required" />
				<form:errors path="localDate" cssClass="text-warning"></form:errors>
			</fieldset>
			<input type="submit" class="btn btn-success" />
		</form:form>
	</div>
	<script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
	<script src="webjars/jquery/3.7.1/jquery.min.js"></script>
	<script src="webjars/bootstrap-datepicker/1.10.0/js/bootstrap-datepicker.js"></script>
	<script type="text/javascript">
		$('#localDate').datepicker({
			format : 'dd-mm-yyyy',
			startDate : '-3d'
		});
	</script>
</body>
</html>