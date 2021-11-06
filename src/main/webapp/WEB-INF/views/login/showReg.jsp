<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title> New Registration</title>
</head>
<body>

<h2>Create New Account</h2>
<form action="saveReg" method = "post">
<pre>
FirstName <input type = "text" name = "firstName"/>
LastName <input type = "text" name = "lastName"/>
Age <input type = "text" name = "age"/>
Gender <input type = "password" name = "gender"/>
Phone <input type = "password" name = "phone"/>
 <input type = "submit" value = "save"/>
</pre>
</form>
</body>
</html>