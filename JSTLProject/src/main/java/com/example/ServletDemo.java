package com.example;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/abc")
public class ServletDemo extends HttpServlet{
@Override
public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
res.setContentType("text/html");
PrintWriter pw=res.getWriter();
pw.println("<html><body bgcolor='pink'>Welcome to Servlet Program</body></html>");

}
}