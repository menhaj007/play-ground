

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
        <h1>Please register yourself.</h1>

        <p>
            <form:errors path="person.*"/>
        </p>
        <form:form action="/register" method="POST" modelAttribute="person">
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

            <input type="submit" value="Register Visitor"/>
        </form:form>
        <br>
        <!-- <a href="/visitorwelcomescreen">Welcome Page</a> -->

    </body>
    </html>