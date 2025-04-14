package Projet;
import java.sql.*;
public class Connexion {
    public static Connection getCon(){
        try {
            Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/hopital","root","qwerty123456789");
            return con;
        } catch (Exception e) {
            return null;
        }
        
    }
}
