package Test.UserTicet.Configuration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBase {
    private static  final String URL = "jdbc:mysql://localhost:3306/myjoinsdb";
    private static  final String LOGIN = "root";
    private static  final String PSSWORD= "root";
    public static Connection getConnection(){
        try {
            return DriverManager.getConnection(URL,LOGIN,PSSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    private static void registerDriver() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
