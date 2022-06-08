<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


        <table border="2" width="70%" cellpadding="2">
            <tr>
                <th>User ID</th>
                <th>User Name</th>
                <th>Birthday</th>
                <th>Email</th>
            </tr>
            <c:forEach var="user" items="${list}">
                <tr>
                    <td>${user.userId}</td>
                    <td>${user.userName}</td>
                    <td>${user.birthday}</td>
                    <td>${user.email}</td>
                </tr>
            </c:forEach>
        </table>