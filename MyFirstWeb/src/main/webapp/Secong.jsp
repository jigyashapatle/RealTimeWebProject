<%@page import="com.example.Calc" %>
<%@page import="java.util.Date" %>
<html>
<body bgcolor="yellow">
<p>Addition is <%=Calc.add(22,33) %></p>
<%-- <%Calc c=new Calc();
out.println("Square is "+(c.square(5)));
%> --%>
<%Calc c1=new Calc(); %>
<p>Square is <%=c1.square(10) %></p>

<%Date d=new Date(); 
out.println(d.getDate()+" / "+(d.getMonth()+1)+" / "+(d.getYear()+1900));%>
<br/>
<%out.println(d.getHours()+" : "+d.getMinutes()+" : "+d.getSeconds()); %>
</body>
</html>