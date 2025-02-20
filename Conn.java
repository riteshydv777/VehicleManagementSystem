 
package CarBookingSystem;

import java.sql.*;

public class Conn {
    
    Connection c ;
    Statement s ;
    
    Conn(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/CarBookingSystem","root","root");
            s=c.createStatement();
            System.out.print("conn establish");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[]args){
        new Conn();
    }
}
