 import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class test {
    private static  final String URL = "jdbc:mysql://localhost:3306/?user=root/mybd";
    private static  final String LOGIN = "root";
    private static  final String PSSWORD= "root";

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver loaded success");
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
        Connection connection;
        try {
            connection= DriverManager.getConnection(URL,LOGIN,PSSWORD);
            if(!connection.isClosed()){
                System.out.println("Corect conection to bd");
            }
            connection.close();
            if(!connection.isClosed()){
                System.out.println("Closed conection");
            }
        }
        catch (SQLException e){
            e.printStackTrace();
        }
    }
}
