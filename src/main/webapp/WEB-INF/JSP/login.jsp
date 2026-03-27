<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>

<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css"
	rel="stylesheet">

<style>
body {
	background: #eef2f7;
}
</style>

</head>
<body>

	<div class="container mt-5">
		<div class="row justify-content-center">
			<div class="col-md-4">

				<div class="card p-4 shadow">

					<h3 class="text-center">Admin Login</h3>

					<c:if test="${not empty error}">
						<div class="alert alert-danger text-center">${error}</div>
					</c:if>

					<form action="login" method="post">

						<input type="text" name="username" placeholder="Username"
							class="form-control mb-3" required> <input
							type="password" name="password" placeholder="Password"
							class="form-control mb-3" required>

						<button class="btn btn-primary w-100">Login</button>

					</form>

				</div>

			</div>
		</div>
	</div>

</body>
</html>