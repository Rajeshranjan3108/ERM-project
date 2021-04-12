<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!doctype html>
<html>
<head>
<title>Employee form page</title>
</head>
<body>
	<h2>Employee Form</h2>
	<br><br>
		<form:form action="saving"  modelAttribute="saveEmployee" method="POST">
		<form:hidden path="id"/>
			<table>
			<tr>
				<td><label>First Name</label></td>
				<td><form:input path="firstName"/></td>
			</tr>
			<tr>
				<td><label>Last Name</label></td>
				<td><form:input path="lastName"/></td>
				</tr>
				<tr>
				<td><label>Email</label></td>
				<td><form:input path="email"/></td>
			</tr>
			<tr>
			<td><input type="submit" value="Save"/></td>
			</tr>
		</table>
	</form:form>

</body>
</html>