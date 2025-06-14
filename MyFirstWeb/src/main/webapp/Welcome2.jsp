<html>
<body bgcolor="aqua">
<% String usr=request.getParameter("num1"); 
int num1 = Integer.parseInt(usr);
String pss=request.getParameter("num2");
int num2 = Integer.parseInt(pss);
out.println("Addition of "+num1+" and "+num2+ " is "+(num1+num2)); 
%>
</body>
</html>