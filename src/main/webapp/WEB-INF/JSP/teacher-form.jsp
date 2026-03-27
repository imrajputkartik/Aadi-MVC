<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Teacher Form</title>

<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css"
	rel="stylesheet">

</head>

<body>

	<div class="container mt-5">
		<div class="col-md-6 mx-auto">

			<div class="card p-4 shadow">

				<h3>Add Teacher</h3>

				<form action="save" method="post">

					<input type="text" name="name" placeholder="Name"
						class="form-control mb-3" required> <input type="text"
						name="subject" placeholder="Subject" class="form-control mb-3"
						required> <input type="number" name="experience"
						placeholder="Experience" class="form-control mb-3" required>

					<button class="btn btn-success w-100">Save</button>

				</form>

				<a href="all" class="btn btn-secondary mt-2">Back</a>

			</div>

		</div>
	</div>

</body>
</html>