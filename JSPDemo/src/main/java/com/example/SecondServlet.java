package com.example;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.*;

public class SecondServlet extends HttpServlet{
@Override
public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
res.setContentType("text/html");
HttpSession session=req.getSession();
PrintWriter pw=res.getWriter();
pw.println("<html><body bgcolor='green'>");
pw.println("Hai "+session.getAttribute("aaa"));
pw.println("</body></html>");
}
}





//package com.example;
//
//import java.io.IOException;
//import java.io.PrintWriter;
//import javax.servlet.ServletConfig;
//import javax.servlet.ServletException;
//import javax.servlet.http.*;
//
//
//
//public class SecondServlet extends HttpServlet{
//@Override
//public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
//res.setContentType("text/html");
//ServletConfig sconfig=getServletConfig();
//String uname=sconfig.getInitParameter("username");
//String pass=sconfig.getInitParameter("password");
//PrintWriter pw=res.getWriter();
//pw.println("<html><body bgcolor='green'>");
//pw.println("<p>Username is "+uname+" and password is "+pass+"</p>");
//pw.println("</body></html>");
//}
//}