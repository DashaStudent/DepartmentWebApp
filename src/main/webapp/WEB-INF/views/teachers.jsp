<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<body>

This is a page for teachers table view
<p>
Now is ${date}
<p>

Список преподавателей <br>
<table>
<tr>
<th>Ид</th>
<th>Имя</th>
<th>Фамилия</th>
<th>Предмет/Часы</th>
<th>Ступень</th>
<th>Должность</th>
<th>Дополнительные часы</th>

</tr>
    <c:forEach var="tch" items="${teachersTableDto.teachers}" >
        <tr>
            <td>${tch.teacher.id}</td>
            <td>${tch.teacher.firstName}</td>
            <td>${tch.teacher.lastName}</td>
            <td>
            <table>
                <c:forEach var="cls" items="${tch.classes}">
                    <tr>
                    <td>${cls.className}</td>
                    <td>${cls.hours}</td>
                    </tr>
                </c:forEach>
            </table>
            </td>


            <td>${tch.teacher.level}</td>
            <td>${tch.teacher.title}</td>
            <td>${tch.teacher.extraHours}</td>
        </tr>
    </c:forEach>
</table>


</body>
</html>
