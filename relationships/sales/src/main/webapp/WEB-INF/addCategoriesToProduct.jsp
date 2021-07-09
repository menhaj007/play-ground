<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>   
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
	<title><c:out value="${aProduct.name}" /></title>
</head>
<body>
	<h1>
        <c:out value="${aProduct.name}" />
    </h1>
	<br>

    <div>
        <form:form action="/addcategorytoproduct" modelAttribute="categoryproductObj" method="POST">
            <form:hidden path="product" value="${aProduct.id}" />
            <form:label path="category">Add Category</form:label>
            <form:select path="category">
                <c:forEach items="${allCategories}" var="cat">
                    <form:option value="${cat.id}">
                        <c:out value="${cat.name}"/>
                    </form:option>
                </c:forEach>
            </form:select>
            <button>Add Category</button>
        </form:form>
    </div>
    <br/>
    <div>
        <ul>
            <c:forEach items="${aProduct.categories}" var="category">
                <li><c:out value="${category.name}"/> </li>
            </c:forEach>
        </ul>
    </div>

  </body>
</body>
</html>