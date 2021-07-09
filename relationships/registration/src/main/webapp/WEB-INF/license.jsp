<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<!DOCTYPE html>
<html>
    <head>
        <style>
            table, th, td {
            border: 1px solid black;
            }

            th, td {
            padding: 10px;
            }
        </style>
    </head>
    <body> 
        <h1>Add a license</h1>
        <form:form action="/add" method="POST" modelAttribute="license">
	
		<p>
			<form:label path="person">Person</form:label>
			<form:select path="person">
				<c:forEach items="${people}" var="person" >
					<form:option value="${person}"> ${person.firstName} ${person.lastName} </form:option>
				</c:forEach>
			</form:select>
		</p>

        <p><form:errors path="number" /></p>
		<p>
			<form:label path="number">Number</form:label>
			<form:input path="number"/>
		</p>
		
		<p><form:errors path="state" /></p>
		<p>
			<form:label path="state">State</form:label>
			<form:input path="state"/>
		</p>
		
		<p><form:errors path="expirationDate"  /></p>
		<p>
			<form:label path="expirationDate">Experiation Date</form:label>
			<form:input type="date" path="expirationDate"/>
		</p>
			<input type=hidden value=0 name=number>
		
		<button type="submit">New License</button>
	</form:form>

        
    </body>
</html>