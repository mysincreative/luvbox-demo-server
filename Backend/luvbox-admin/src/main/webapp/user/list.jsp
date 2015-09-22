<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 11/3/13
  Time: 3:07 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.List" %>
<%@ page import="dao.TbUser" %>
<html>
<body>
<h1>RDCS Admin Page</h1>

Function : <a href="addCustomerPage">Add Customer</a>
<hr />

<h2>All Customers</h2>
<table border="1">
    <thead>
    <tr>
        <td>Name</td>
        <td>Password</td>
        <td>Role</td>
        <td>Action</td>
    </tr>
    </thead>
    <%

        List<TbUser> users = (List<TbUser>)request.getAttribute("userList");
        for(TbUser user : users){

    %>
    <tr>
        <td><%=user.getLoginId() %></td>
        <td><%=user.getPassword() %></td>
        <td><%=user.getRole() %></td>
        <td><a href="update/<%=user.getLoginId()%>">Update</a>
        <a href="delete/<%=user.getLoginId()%>">Delete</a></td>
    </tr>
    <%
        }
    %>
</table>

</body>
</html>