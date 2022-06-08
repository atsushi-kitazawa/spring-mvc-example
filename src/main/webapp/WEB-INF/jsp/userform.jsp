<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

        <form:form method="post" action="add">
            <table>
                <tr>
                    <td>User ID : </td>
                    <td>
                        <form:input path="userId" />
                    </td>
                </tr>
                <tr>
                    <td>User Name :</td>
                    <td>
                        <form:input path="userName" />
                    </td>
                </tr>
                <tr>
                    <td>Birthday :</td>
                    <td>
                        <form:input path="birthday" />
                    </td>
                </tr>
                <tr>
                    <td>Email :</td>
                    <td>
                        <form:input path="email" />
                    </td>
                </tr>
                <tr>
                    <td colspan="2"><input type="submit" value="Add" /></td>
                </tr>
            </table>
        </form:form>