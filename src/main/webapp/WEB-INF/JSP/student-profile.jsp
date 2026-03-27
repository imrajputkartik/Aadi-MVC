<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Profile</title>

<!-- Bootstrap CSS -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">

<style>
	body {
		background: #f1f5f9;
	}

	.profile-container {
		margin-top: 60px;
	}

	.card {
		border-radius: 15px;
	}

	.profile-item {
		font-size: 18px;
		margin-bottom: 10px;
	}
</style>

</head>

<body>

<div class="container profile-container">

	<div class="row justify-content-center">

		<div class="col-md-6">

			<div class="card shadow-lg p-4 text-center">

				<h2 class="mb-4">🎓 Student Profile</h2>

				<div class="profile-item">
					<strong>ID:</strong> ${stud.id}
				</div>

				<div class="profile-item">
					<strong>Name:</strong> ${stud.name}
				</div>

				<div class="profile-item">
					<strong>Department:</strong> ${stud.department}
				</div>

				<div class="profile-item">
					<strong>Age:</strong> ${stud.age}
				</div>

				<hr>

				<!-- Buttons -->
				<div class="d-grid gap-2">

					<a href="${pageContext.request.contextPath}/allStudents" 
					   class="btn btn-success">View All Students</a>

					<a href="${pageContext.request.contextPath}/" 
					   class="btn btn-primary">Add New Student</a>

				</div>

			</div>

		</div>

	</div>

</div>

</body>
</html>