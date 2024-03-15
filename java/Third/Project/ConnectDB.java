package Project;
import java.sql.*;
public class ConnectDB {
    public static void main(String[] args)  {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521", "system", "system");
            Statement stmt=con.createStatement();

            stmt.executeUpdate("create table shantu (roll int , fname varchar(20),lname varchar(20));");
        } catch (Exception e) {
            System.out.println("ERROR HAS OCCURED "+e);
                e.printStackTrace();
        }
    }
}
