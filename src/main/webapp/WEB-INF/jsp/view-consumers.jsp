<%@ include file="header.jsp" %>

<a href="/addConsumer" class="btn mb-2 btn-primary">Tambah Konsumen</a>

<table id="konsumenTable" class="table table-striped table-boarded">
    <thead>
        <tr>
            <th>Nama</th>
            <th>Alamat</th>
            <th>Kota</th>
            <th>Provinsi</th>
            <th>Tanggal Registrasi</th>
            <th>Status</th>
        </tr>
    </thead>
    <tbody>
        <c:forEach items="${listConsumers}" var="consumer">
            <tr>
                <td>${consumer.name}</td>
                <td>${consumer.address}</td>
                <td>${consumer.city}</td>
                <td>${consumer.province}</td>
                <td>${consumer.registrationDate}</td>
                <td>${consumer.status}</td>
            </tr>
        </c:forEach>
    </tbody>
</table>

<%@ include file="footer.jsp" %>
