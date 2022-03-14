<%@ taglib prefix="myprefix" uri="WEB-INF/message.tld"%>
<html>
 <head>
    <title>Custom Tags in JSP Example</title>
 </head>
 <body>
    <h1> This is Customized Tag</h1>
    <myprefix:MyMsg/>
     <form  >
 
          Red: <input type="radio" name="color" value="red">
          <br>
          Black: <input type="radio" name="color" value="black">
          <br>
         Yellow: <input type="radio" name="color" value="yellow">
          <br>
         Blue: <input type="radio" name="color" value="blue">
            <br>
       <input type="submit" name="go" value="go">
</form>

 <% 
  
    String col=request.getParameter("color");
 
      try{
    	    
     	   if(col.equals("red")){ %>
    		       
    		       <img src="C:\Users\Coditas\Downloads\red.jpg" alt="">
    		   
    		   
    	   <%}     	   
     	   
      	   if(col.equals("blue")){ %>
	       
	       <img src="C:\Users\Coditas\Downloads\blue.jpg" alt="">
	   
	   
   <%}	     
   if(col.equals("black")){ %>
	       
	       <img src="C:\Users\Coditas\Downloads\black.jpg" alt="">
	   
	   
   <%}
   if(col.equals("yellow")){ %>
   
   <img src="C:\Users\Coditas\Downloads\yellow.jpg" alt="">


<%}
      }catch(Exception e){
    	 
      }
 
 
 
 
 
 %>
    
 </body>
</html>