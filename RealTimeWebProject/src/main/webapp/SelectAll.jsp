<%@page import="com.example.dao.StudentDao"%>
<%@page import="com.example.bean.StudentBean" %>
<%@page import="java.util.ArrayList" %>
<html>
<body bgcolor="green">
<%ArrayList<StudentBean> allStudent=StudentDao.selectAll();%>
<table border="4">
<tr><th>Rollno</th><th>Name</th><th>Branch</th></tr>
<%for(StudentBean sb:allStudent){ %>
<tr><td><%=sb.getRollno() %></td><td><%=sb.getName() %></td><td><%=sb.getBranch() %></td></tr>
<%} %>
</table>
</body>
</html>