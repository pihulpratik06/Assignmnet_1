//QUestion 3



import  java.sql.*;
import java.util.Formatter;

class JDBC{

    public static void main(String[] args) {

          String url="jdbc:mysql://localhost:3306/employee3";
          String uName="root";
          String pass="root";

          try{
               Class.forName("com.mysql.jdbc.Driver");

               Connection con= DriverManager.getConnection(url,uName,pass);

                con.setAutoCommit(false);
              System.out.println("connected");

              Statement st=con.createStatement();

              String query="select * from EmployeeData";

              ResultSet rt=st.executeQuery(query);

              while (rt.next()){
                  System.out.println(rt.getInt(1)+" "+rt.getString(2)+" "+rt.getString(3)+" "+rt.getString(4)+" "+rt.getInt(5)+" "+rt.getString(6)+" "+rt.getString(7));
              }

              Formatter fmt=new Formatter();

              System.out.println("****************************");

              System.out.printf("%15s %15s %15s %15s %15s %15s %15s","id","empName","designation","doj","expr","salary","status");

              System.out.printf("********************************");

              while (rt.next()){
                  System.out.println(rt.getInt(1)+" "+rt.getString(2)+" "+rt.getString(3)+" "+rt.getString(4)+" "+rt.getInt(5)+" "+rt.getString(6)+" "+rt.getString(7));
              }

              System.out.println("**********************");

              PreparedStatement ps1;

/*
              String alter="alter table EmployeeData add city varchar(255)";

              ps1=con.prepareStatement(alter);
              ps1.execute();
*/

              String s1=" UPDATE EmployeeData SET city = 'Pune' where id=1";
              String s2=" UPDATE EmployeeData SET city = 'Nagpur' where id=2";
              String s3=" UPDATE EmployeeData SET city = 'Amravati' where id=3";
              String s4=" UPDATE EmployeeData SET city = 'Wardha' where id=4";
              String s5=" UPDATE EmployeeData SET city = 'Pune' where id=5";
              String s6=" UPDATE EmployeeData SET city = 'Pune' where id=6";
              String s7=" UPDATE EmployeeData SET city = 'Jalgaon' where id=7";
              String s8=" UPDATE EmployeeData SET city = 'Mulshi' where id=8";
              String s9=" UPDATE EmployeeData SET city = 'Badnera' where id=9";
              String s10=" UPDATE EmployeeData SET city = 'Chandrapur' where id=10";

              st.addBatch(s1);
              st.addBatch(s2);
              st.addBatch(s3);
              st.addBatch(s4);
              st.addBatch(s5);
              st.addBatch(s6);
              st.addBatch(s7);
              st.addBatch(s8);
              st.addBatch(s9);
              st.addBatch(s10);



               con.commit();



                  st.close();

              rt.close();


          }catch (Exception e){
                e.printStackTrace();
          }






    }
}
