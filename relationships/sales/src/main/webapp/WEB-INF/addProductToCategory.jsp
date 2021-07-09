<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>   
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
	<title><c:out value="${aCategory.name}"/></title>
</head>
<body>
	<h1>
        <c:out value="${aCategory.name}" />
    </h1>
	<br>

    <div>
        <form:form action="/addproducttocategory" modelAttribute="categoryproductObj" method="POST">
            <form:hidden path="category" value="${aCategory.id}" />
            <form:label path="product">Add Product</form:label>
            <form:select path="product">
                <c:forEach items="${allProducts}" var="product">
                    <form:option value="${product.id}">
                        <c:out value="${product.name}"/>
                    </form:option>
                </c:forEach>
            </form:select>
            <button>Add Product</button>
        </form:form>
    </div>
    <br/>
    <div>
        <ul>
            <c:forEach items="${aCategory.products}" var="product">
                <li><c:out value="${product.name}"/> </li>
            </c:forEach>
        </ul>
    </div>

  </body>
</body>
</html>