<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html>
<head>
	<title>
		Employee list page
	</title>
</head>
<body>
	<h3>Employee Details:</h3>
	<table>
		<tr>
		<th>First Name</th>
		<th>Last Name</th>
		<th>Email</th>
		<th>Action</th>
		</tr>
		<c:forEach var="temp"  items="${employeeName}">
		<c:url var="updateLink" value="/employee/showForUpdate">
		<c:param name="employeeId" value="${temp.id}"></c:param>
		</c:url>
		<c:url var="deleteLink" value="/employee/delete">
		<c:param name="employeeId" value="${temp.id}"></c:param>
		</c:url>
		<tr>
				<td>${temp.firstName}</td>
				<td>${temp.lastName}</td>
				<td>${temp.email}</td>
				<td>
				<a href="${updateLink}" >Update</a>
				||
				<a href="${deleteLink}" onclick="if(!(confirm('Are you sure you want to delete'))) return false">Delete</a>
				</td>
		</tr>
		</c:forEach>
	</table>
	<input type="button" value="Add new Employee" onclick="window.location.href='save';return false;">
</body>
</html>