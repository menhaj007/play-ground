<div>
    <!-- <c:out value="${people[0].firstName}" /> -->
    
    <c:forEach var="p" items="${people}">
      <c:out value="${p.firstName}"/>
      
     </div>
    </c:forEach>



    <h1>Test</h1>
</div>
<div>
    <form:form action="/add" method="POST" modelAttribute="license">
        <p>
            <form:label path="number">License Plate</form:label>
            <form:errors path="number"/>
            <form:input path="number" />
        </p>
        <p>
            <form:label path="expirationDate">Expireation Date </form:label>
            <form:errors path="expirationDate"/>
            <form:input path="expirationDate" />
        </p>
        <p>
            <form:label path="state">State </form:label>
            <form:errors path="state"/>
            <form:input path="state" />
        </p>

        <input type="submit" value="register"/>
    </form:form>
