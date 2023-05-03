<%@ include file="header.jsp" %>

<c:url var="add_consumer_url" value="/addConsumer"/>
<form:form action="${add_consumer_url}" method="post" modelAttribute="consumer">
    <div class="form-group">
        <form:label path="name">Name: </form:label> 
        <form:input class="form-control" type="text" path="name"/>
    </div>
    <div class="form-group">
        <form:label path="address">Alamat: </form:label> 
        <form:input class="form-control" type="text" path="address"/>
    </div>
    <div class="form-group">
        <form:label path="city">Kota: </form:label> 
        <form:input class="form-control" type="text" path="city"/>
    </div>
    <div class="form-group">
        <form:label path="province">Provinsi: </form:label> 
        <form:input class="form-control" type="text" path="province"/>
    </div>
    <div class="form-group">
        <form:label path="status">Status: </form:label> 
        <form:input class="form-control" type="text" path="status"/>
    </div>
    <input type="submit" value="submit" class="btn btn-primary"/>
</form:form>

<%@ include file="footer.jsp" %>
