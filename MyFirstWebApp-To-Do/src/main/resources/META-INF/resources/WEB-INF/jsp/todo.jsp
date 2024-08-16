
<%@ include file="common/header.jspf"%>
<%@ include file="common/navigation.jspf"%>
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
			<form:input type="datetime" id="localDate" path="localDate"
				required="required" />
			<form:errors path="localDate" cssClass="text-warning"></form:errors>
		</fieldset>
		<input type="submit" class="btn btn-success" />
	</form:form>
</div>

<%@ include file="common/footer.jspf"%>