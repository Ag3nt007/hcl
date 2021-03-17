<html>
<title>Register</title>
<body>			
				<h2>User Register Form</h2>

					<form action="<%=request.getContextPath()%>/register" method="post">

						<div class="form-group">
							<label for="uname">First Name:</label> <input type="text"
								class="form-control" id="uname" placeholder="First Name"
								name="firstName" required>
						</div>

						<div class="form-group">
							<label for="uname">Last Name:</label> <input type="text"
								class="form-control" id="uname" placeholder="Last Name"
								name="lastName" required>
						</div>

						<div class="form-group">
							<label for="uname">User Name:</label> <input type="text"
								class="form-control" id="username" placeholder="User Name"
								name="username" required>
						</div>

						<div class="form-group">
							<label for="uname">Password:</label> <input type="password"
								class="form-control" id="password" placeholder="Password"
								name="password" required>
						</div>

						<button type="submit" class="btn btn-primary">Submit</button>

					</form>

</body>
</html>