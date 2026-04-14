<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Dashboard</title>

<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css"
	rel="stylesheet">

</head>

<body>

	<nav class="navbar navbar-dark bg-dark px-3">
		<span class="navbar-brand">School Management</span>

		<div>
			<a href="student/all" class="btn btn-success btn-sm">Students</a> <a
				href="teacher/all" class="btn btn-info btn-sm">Teachers</a> <a
				href="logout" class="btn btn-danger btn-sm">Logout</a>
		</div>
	</nav>

	<div class="container mt-5 text-center">

		<h2>Welcome to Dashboard 🎓</h2>

		<div class="row mt-4">

			<div class="col-md-4">
				<div class="card p-3 shadow">
					<h4>Students</h4>
					<a href="student/all" class="btn btn-primary">Manage</a>
				</div>
			</div>

			<div class="col-md-4">
				<div class="card p-3 shadow">
					<h4>Teachers</h4>
					<a href="teacher/all" class="btn btn-info">Manage</a>
				</div>
			</div>

		</div>

	</div>

</body>
</html>