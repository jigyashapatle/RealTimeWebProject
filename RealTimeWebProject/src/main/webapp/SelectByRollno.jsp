<%@page import="com.example.dao.StudentDao"%>
<%@page import="com.example.bean.StudentBean"%>
<html>
<body bgcolor="yellow">
<%
int rno = Integer.parseInt(request.getParameter("rollno"));
StudentBean sb=StudentDao.selectByRollno(rno); 
%>

<table border="4">
<tr><th>Rollno</th><th>Name</th><th>Branch</th></tr>
<tr><td><%=sb.getRollno() %></td><td><%=sb.getName() %></td><td><%=sb.getBranch() %></td></tr> 
</table>

</body>
</html>