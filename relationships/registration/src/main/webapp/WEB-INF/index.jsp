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
        <h1> Welcome to DMV! </h1>

        <div class="all">
            <table>
                <thead>
                    <tr>
                        <th> ID </th>
                        <th> First Name </th>
                        <th> Last Name </th>
                        
                    </tr>
                </thead>
                <tbody>
                    <c:forEach items = "${allPerson}" var = "person">
                        <tr>
                            <td> <c:out value="${person.id}" /> </td>
                            <td> <c:out value="${person.firstName}" /> </td>
                            <td> <c:out value="${person.lastName}" /> </td>
                            <!-- <td> <c:out value="${visitor.invitationNumber}" /> </td> -->
                            <!-- <td> <a href="/editview/${visitor.id}">Edit</a></td> -->
                            
    
                        </tr>
                    </c:forEach>
                </tbody>
            </table>

        </div>
        <br/>
        <div class="new-person">
            <h1>New Person.</h1>
            <p>
                <form:errors path="person.*"/>
            </p>
            <form:form action="/create" method="POST" modelAttribute="person">
                <p>
                    <form:label path="firstName">First Name </form:label>
                    <!-- <form:errors path="firstName"/> -->
                    <form:input path="firstName" />
                </p>
                <p>
                    <form:label path="lastName">Last Name </form:label>
                    <!-- <form:errors path="lastName"/> -->
                    <form:input path="lastName" />
                </p>

                <input type="submit" value="create"/>
            </form:form>
        <br/>
        </div>
        <br/>
        
    </body>
</html>