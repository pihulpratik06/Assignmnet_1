package com.Demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/LoginFormDemo")
public class LoginFormDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public LoginFormDemo() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
   
		response.getWriter().append("Served at: ").append(request.getContextPath());
   
         response.setContentType("text/html");
        
        PrintWriter out=response.getWriter();
	   
        String uname=request.getParameter("uname");
      
        String pass=request.getParameter("pwd");
      
         if(uname.equals(pass)) {
        	  
        	 out.println("<h1>Right Credential</h1>");
        	 RequestDispatcher rd=request.getRequestDispatcher("WelcomeServlet");
        	  rd.forward(request, response);
        	 
         }
         else {
        	  
        	
        	 
        	 RequestDispatcher rd=request.getRequestDispatcher("index.html");
        	 rd.include(request, response);
        	  
         }
        
     
     
     
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
