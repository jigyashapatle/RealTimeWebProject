<html>
<body bgcolor="blue">
Hai <%=session.getAttribute("aaa") %>
<%session.invalidate(); %>
<br/>
<a href="Fourth.jsp">Click me</a>
</body>
</html>