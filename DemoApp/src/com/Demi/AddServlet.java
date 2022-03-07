package com.Demi;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.*;

import java.io.*;

public class AddServlet extends HttpServlet { 
   
	  public void doGet(HttpServletRequest req,HttpServletResponse res)  throws IOException ,ServletException {
		    
		  int i=Integer.parseInt(req.getParameter("num1"));
		  int j=Integer.parseInt(req.getParameter("num2"));  
		    
		  int k=i+j;
		   
		
		   
       		  PrintWriter out= res.getWriter();
		  
		   out.println("Result is:"+k);
	   
		    
		   //Adding servlet to other servlet
		   
		   RequestDispatcher rd=req.getRequestDispatcher("");
		   
		   rd.forward(req, res);
	  }
	 
	
	
	
}
