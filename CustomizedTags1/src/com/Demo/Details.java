package com.Demo;

import javax.servlet.jsp.tagext.*;
import javax.servlet.jsp.*;
import java.io.*;
public class Details extends SimpleTagSupport {
   public void doTag() throws JspException, IOException {
   
      JspWriter out = getJspContext().getOut();
    
      out.println("<h1>Welcome Saurabh. I hope you like my work.</h1>");
      
   
   
   
   


       
      
   }
}
