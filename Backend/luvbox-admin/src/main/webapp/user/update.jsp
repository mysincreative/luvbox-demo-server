<%@ page import="dao.TbUser" %>
<html>
<body>
<h1>Update Customer</h1>

<%
    TbUser user = (TbUser)request.getAttribute("user");
%>

<form method="post" action="../update" >
    <input type="hidden" name="loginId" id="loginId"
           value="<%=user.getLoginId() %>" />
    <table>

        <tr>
            <td>
                Password :
            </td>
            <td>
                <input type="text" style="width: 185px;"
                       maxlength="30" name="password" id="password"
                       value="<%=user.getPassword() %>" />
            </td>
        </tr>
        <tr>
            <td>
                Role :
            </td>
            <td>
                <select id="role" name="role">
                    <option value="CUSTOMER">CUSTOMER</option>
                    <option value="ADMIN">ADMIN</option>
                    <option value="DESIGNER">DESIGNER</option>
                    <option value="MANAGER">MANAGER</option>
                    <option selected="selected" value = "<%= user.getRole()%>"><%= user.getRole()%></option>
                </select>
            </td>
        </tr>
    </table>
    <input type="submit" class="update" title="Update" value="Update" />
</form>

</body>
</html>