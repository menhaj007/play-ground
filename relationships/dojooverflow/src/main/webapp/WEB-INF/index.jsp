<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>   
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <style>
table {
  border-collapse: collapse;
  width: 100%;
}

th, td {
  text-align: left;
  padding: 8px;
}

tr:nth-child(even){background-color: #f2f2f2}

th {
  background-color: #04AA6D;
  color: white;
}
</style>
	<title>Questions</title>
</head>
<body>
	<h1>Questions Dashboard</h1>
	<br>
    <table>
        <thead>
            <th>Question</th>
            <th>Tags</th>
        </thead>
        <tbody>
        <%-- <c:forEach items="${}" var=""> --%>
            <tr> 
                <td>Dum question</td>
                <td>Dumy tag</td>
            </tr>
            
        <%-- </c:forEach> --%>
        </tbody>
    </table>


  </body>
</body>
</html>