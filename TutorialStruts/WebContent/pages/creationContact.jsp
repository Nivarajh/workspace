<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="bean" uri="http://struts.apache.org/tags-bean" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title><bean:message key="main.page.title"/></title>
</head>
<body>

<h1><bean:message key="label.hello"/></h1>

<html:errors/>

<form method="post" action="AddContactValidationForm" >

<bean:message key="creationContact.id"/><input type="text" name="id"/>
<bean:message key="creationContact.nom"/><input type="text" name="nom" />
<bean:message key="creationContact.prenom"/><input type="text" name="prenom"/>
<bean:message key="creationContact.email"/><input type="text" name="email"/>

<input type="submit" value="Valider" name="valider"/>


</form>


</body>
</html>