
package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class SecondServlet extends GenericServlet{
    @Override
    public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException
    {
        System.out.println("this is servlet using generic servlet");
        resp.setContentType("text/html");
        PrintWriter out=resp.getWriter();
        out.println("<h1>this is my second servlet...GenericServlet</h1>");
    }
    
    
}
