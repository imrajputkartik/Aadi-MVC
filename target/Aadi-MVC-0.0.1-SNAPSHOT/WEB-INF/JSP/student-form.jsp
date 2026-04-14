<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Form</title>

<!-- Bootstrap CSS -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css"
	rel="stylesheet">

<style>
body {
	background: #eef2f7;
}

.form-container {
	margin-top: 60px;
}

.card {
	border-radius: 15px;
}

.btn-custom {
	width: 100%;
}
</style>

</head>

<body>

	<div class="container form-container">

		<div class="row justify-content-center">

			<div class="col-md-6">

				<div class="card shadow-lg p-4">

					<h2 class="text-center mb-4">🎓 Student Form</h2>

					<form action="save" method="post">

						<div class="mb-3">
							<label class="form-label">ID</label> <input type="number"
								name="id" class="form-control" placeholder="Enter ID">
						</div>

						<div class="mb-3">
							<label class="form-label">Name</label> <input type="text"
								name="name" class="form-control" placeholder="Enter Name">
						</div>

						<div class="mb-3">
							<label class="form-label">Department</label> <input type="text"
								name="department" class="form-control"
								placeholder="Enter Department">
						</div>

						<div class="mb-3">
							<label class="form-label">Age</label> <input type="number"
								name="age" class="form-control" placeholder="Enter Age">
						</div>

						<button type="submit" class="btn btn-primary btn-custom">Submit</button>

					</form>

					<hr>

					<!-- Go to student list -->
					<a href="${pageContext.request.contextPath}/student/all"
						class="btn btn-success"> View All Students </a>

				</div>

			</div>

		</div>

	</div>

</body>
</html>