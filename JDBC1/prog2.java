//Question 2
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

             CallableStatement cst=con.prepareCall("{call Team(?)}");

            cst.setInt(1,2);

            cst.execute();

        }catch (Exception e){

            e.printStackTrace();

        }
        System.out.println("Changes Succesfull");
    }

}

