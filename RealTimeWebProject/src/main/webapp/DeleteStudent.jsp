<%@page import="com.example.dao.StudentDao"%>
<html>
<body bgcolor="pink">
<%int rollno = Integer.parseInt(request.getParameter("rollno"));
out.println(StudentDao.deleteStudent(rollno)+" record deleted successfully..."); 
%>
</body>
</html>