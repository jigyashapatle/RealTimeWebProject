<html>
<body bgcolor="green">
<%String user=request.getParameter("user");
out.println("Hai "+user);
session.setAttribute("aaa", user);
%>
<a href="Third.jsp">Click me</a>
</body>
</html>