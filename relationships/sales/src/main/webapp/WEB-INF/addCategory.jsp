<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>   
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
	<title>New Category</title>
</head>
<body class="pl-4">
	<h3 class="display-3"><small><u>New Category</u></small></h3>
	<br>
	
	<form:form action="/category/new" method="POST" modelAttribute="categoryObj">
	
		<p><form:errors path="name"/></p>
		<p><form:label path="name">Name</form:label></p>
		<p> <form:input path="name" /> </p>
	
		<button type="submit">Add Product</button>
		
	</form:form>

  </body>
</body>
</html>