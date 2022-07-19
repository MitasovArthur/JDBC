package Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconect {
//    private static  final String URL = "jdbc:mysql://localhost:3306/?user=root/myjoinsdb";
//    private static  final String LOGIN = "root";
//    private static  final String PSSWORD= "root";
//    public DBconect(){
//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//            System.out.println("Driver loaded success");
//        }catch (ClassNotFoundException e){
//            e.printStackTrace();
//        }
//    }
    private static Connection getConection(){
        Connection connection = null;
        try {
            connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/?user=root/myjoinsdb","root","root");
        }catch (SQLException e){
            e.printStackTrace();
        }
        return  null;
    }
}
