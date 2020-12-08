
package com.servlets;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.*;

public class FirstServlet implements Servlet{
    
    //life cycle method
    ServletConfig conf;
    @Override
        public void init(ServletConfig conf)
    {
        this.conf=conf;
        System.out.println("Creating Object.......");
    }
   
    @Override
    public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException 
    {
        System.out.println("Servicing.....");
        resp.setContentType("text/html");
        PrintWriter out=resp.getWriter();
        out.println("<h1>this is my first output from servlet method.....</h1>");
        out.println("<h1>Today's date is :"+new Date().toString()+"</h1>");
    }
    
    @Override
    public void destroy()
    {
        System.out.println("destroying object...");
    }
    //non life cycle method
    
    
    @Override
    public ServletConfig getServletConfig()
    {
        return this.conf;
    }
  
    @Override
    public String getServletInfo() {
        
        return "this servlet is created by pradeep...";
    }
    
}
