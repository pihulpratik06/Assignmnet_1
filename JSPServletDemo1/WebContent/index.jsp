<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSPTUT</title>
</head>
<%!
     public int disp(int a, int b){
	 
	 return a+b;
	
}


%>

<%!
     public int dispSub(int a, int b){
	 
	 return a-b;
}


%>
<body>

    <br><h1><%= disp(1,3) %></h1>
   
    
     <br><h1><%= disp(1,6) %></h1>
   
     <br><h1><%= disp(6 ,3) %></h1>
   
   
       <br><h1><%= dispSub(4,3) %></h1>
  
   <br><h1><%= dispSub(14,3) %></h1>
  
  <br><h1><%= dispSub(24,3) %></h1>
 
  
</body>
</html>