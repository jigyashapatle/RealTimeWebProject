<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<html>
<body>
<%-- <mphasis:out value="${'Welcome to JSP' }"/> --%>
<c:set var = "salary" scope="session" value="${2000*2 }"/>
<c:out value="${salary}" />
<br/>
<c:set var="x" scope="request" value="${'Welcome to Mphasis' }" />
<c:out value="${x }" />
</body>
</html>