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
                Email :
            </td>
            <td>
                <input type="text" style="width: 185px;"
                       maxlength="30" name="password" id="password"
                       value="<%=user.getPassword() %>" />
            </td>
        </tr>
    </table>
    <input type="submit" class="update" title="Update" value="Update" />
</form>

</body>
</html>