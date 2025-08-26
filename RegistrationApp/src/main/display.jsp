<!DOCTYPE html>
<html>
<head><title>Display</title></head>
<body>
  <h2>Registered Info:</h2>
  Name: <%= request.getAttribute("name") %><br>
  Email: <%= request.getAttribute("email") %><br>
  Password: <%= request.getAttribute("password") %><br>
</body>
</html>
