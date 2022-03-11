<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Color</title>
</head>
<body>

 
     <form >
 
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