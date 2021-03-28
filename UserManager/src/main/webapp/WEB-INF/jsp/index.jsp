<html>
<body>
<h2>Spring Application</h2>

<h2 class="hello-title">Hello ${name}!</h2>
<form action="editUser" method="post" name="form_name" id="form_id" class="form_class" >
  <label for="user">Enter User ID:</label><br>
  <input type="text" id="id" name="id"><br><br>
  <input type="submit" value="Submit" onclick="edit_onclick()">
</form>
<a href="users">List Users</a>

</body>
</html>

