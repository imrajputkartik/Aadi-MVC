<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>All Students</title>

<!-- Bootstrap CSS -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css"
	rel="stylesheet">

<style>
body {
	background: #f5f7fa;
}

.table-container {
	margin-top: 50px;
}

.card {
	border-radius: 15px;
}

.btn-custom {
	padding: 5px 12px;
	font-size: 14px;
}
</style>

</head>

<body>

	<div class="container table-container">

		<div class="card shadow-lg p-4">

			<h2 class="text-center mb-3">🎓 All Students List</h2>

			<!-- ✅ Add New Student Button -->
			<div class="d-flex justify-content-end">
				<a href="${pageContext.request.contextPath}/student/form"
					class="btn btn-success mb-3"> + Add New Student </a>
			</div>

			<div class="table-responsive">

				<table
					class="table table-hover table-bordered align-middle text-center">

					<thead class="table-dark">
						<tr>
							<th>ID</th>
							<th>Name</th>
							<th>Department</th>
							<th>Age</th>
							<th>Action</th>
						</tr>
					</thead>

					<tbody>

						<c:forEach var="s" items="${students}">
							<tr>
								<td>${s.id}</td>
								<td>${s.name}</td>
								<td>${s.department}</td>
								<td>${s.age}</td>

								<td><a
									href="${pageContext.request.contextPath}/student/update/${s.id}"
									class="btn btn-warning btn-sm"> Edit </a> <a
									href="delete/${s.id}" class="btn btn-danger btn-sm btn-custom"
									onclick="return confirm('Are you sure you want to delete?')">
										Delete </a></td>
							</tr>
						</c:forEach>

					</tbody>

				</table>

			</div>

		</div>

	</div>

</body>
</html>