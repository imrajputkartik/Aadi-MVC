<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>All Teachers</title>

<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css"
	rel="stylesheet">

</head>

<body>

	<div class="container mt-5">

		<h2>Teachers List</h2>

		<a href="form" class="btn btn-success mb-3">+ Add Teacher</a>

		<table class="table table-bordered text-center">

			<tr>
				<th>ID</th>
				<th>Name</th>
				<th>Subject</th>
				<th>Experience</th>
				<th>Action</th>
			</tr>

			<c:forEach var="t" items="${teachers}">
				<tr>
					<td>${t.id}</td>
					<td>${t.name}</td>
					<td>${t.subject}</td>
					<td>${t.experience}</td>

					<td><a href="delete/${t.id}" class="btn btn-danger btn-sm">Delete</a>
					</td>

				</tr>
			</c:forEach>

		</table>

	</div>

</body>
</html>