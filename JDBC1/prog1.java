//Question 1
import java.sql.Connection;
import java.sql.DriverManager;
import  java.sql.*;
class JDBC {
     public static void main(String[] args) {

         String url="jdbc:mysql://localhost:3306/jdbcdemo1";
         String pass="root";
         String userName="root";

         try{

             Class.forName("com.mysql.jdbc.Driver");

             Connection con= DriverManager.getConnection(url,userName,pass);

             System.out.println("Connection");

             Statement st= con.createStatement();

             System.out.println(st);

             String show="select * from Team";
             ResultSet rt=st.executeQuery(show);

             PreparedStatement ps;
             while (rt.next()) {

                 System.out.println(rt.getInt(1) + " " + rt.getString(2) + " " + rt.getString(3));
             }
          PreparedStatement pst;
             String sql="Update Team SET role=? where id=?";
             pst=con.prepareStatement(sql);
            pst.setString(1,"Co-Founder");
            pst.setInt(2,5);
          pst.execute();



         }catch (Exception e){

              e.printStackTrace();

         }
         System.out.println("Changes Succesfull");
     }

}
/**
 *  Connection
com.mysql.cj.jdbc.StatementImpl@4a7f959b
1 Pratik Founder
2 Gavrav Data Analyst
3 Shubham Admin
4 Sakshi Co-Founder
5 Prachi Co-Founder
Changes Succesfull
 * 
 * 
 * 
 */