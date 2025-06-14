
<html>
<body bgcolor="blue">
<% String usr=request.getParameter("user"); 
String pss=request.getParameter("pass"); 
/* out.println("Username is "+usr+" and password is "+pss); */
if((usr.equals("Admin"))&&(pss.equals("123")))
{
%>
<%@include file="Valid.html" %>
<%}
else
{
%>
<%@include file="Invalid.html" %>
<%} %>
</body>
</html>