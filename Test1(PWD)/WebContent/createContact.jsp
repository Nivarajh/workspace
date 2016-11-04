<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Créer un contact</title>
</head>
<body>

<form method="post" action="CreateContactServlet" >

Nom :<input type="text" name="name"/>
Prénom : <input type="text" name="nickname"/>
Email <input type="text" name="mail"/>

<input type="submit" value="Valider" name="valider"/>



</form>


</body>
</html>