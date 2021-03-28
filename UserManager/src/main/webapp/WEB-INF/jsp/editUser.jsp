<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit User</title>
<script src="editUser.js"></script>
</head>
<body>


<form action="user" method="post" name="form_name" id="form_id" class="form_class" >
  <label for="name">Name:</label><br>
  <input type="text" id="name" name="name"><br>
  <label for="email">Email:</label><br>
  <input type="text" id="email" name="email"><br>
  <label for="password">Password:</label><br>
  <input type="text" id="password" name="password"><br><br>
  <input type="submit" value="Submit" onclick="edit_onclick()">
</form>



</body>
</html>