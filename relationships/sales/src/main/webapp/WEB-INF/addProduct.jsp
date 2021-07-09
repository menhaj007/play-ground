<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>   
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
	<title>New Product</title>
</head>
<body class="pl-4">
	<h3 class="display-3"><small><u>New Product</u></small></h3>
	<br>
	
	<form:form action="/product/new" method="POST" modelAttribute="productObj">
	
		<p><form:errors path="name"/></p>
		<p><form:label path="name">Name</form:label></p>
		<p> <form:input path="name" /> </p>
		
		<p><form:errors path="description"/></p>
		<p><form:label path="description">Description</form:label></p>
		<p> <form:textarea path="description" /> </p>
		
		<p><form:errors path="price"/></p>
		<p><form:label path="price">price</form:label></p>
		<p> <form:input path="price" /> </p>
		<br>
		<button type="submit">Add Product</button>
		
	</form:form>

  </body>
</body>
</html>