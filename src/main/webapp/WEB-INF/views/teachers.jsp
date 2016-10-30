<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<body>

This is a page for teachers table view
<p>
Now is ${date}
<p>

Teacher List <br>
<table>
    <c:forEach var="tch" items="${teachers}" >
        <tr> <td>${tch.id}</td> <td>${tch.firstName}</td> <td>${tch.lastName}</td> </tr>
    </c:forEach>
</table>


</body>
</html>
