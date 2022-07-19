package Test;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DBrequest {
    private static final String URL = "jdbc:mysql://localhost:3306/myjoinsdb";
    private static final String LOGIN = "root";
    private static final String PSSWORD = "root";

    public List<Workers> getAllWorcers() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver loaded success");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Connection connection = null;
        Statement statement = null;
        List<Workers> workers = new ArrayList<>();
        try {
            connection = DriverManager.getConnection(URL, LOGIN, PSSWORD);
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM workers");
            while (resultSet.next()) {
                int id = resultSet.getInt(1);
                int id_info = resultSet.getInt(2);
                String name = resultSet.getString("positions");
                int number = resultSet.getInt("salary");
                Workers wr = new Workers(id, id_info, name, number);
                workers.add(wr);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();
                ;
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return workers;
    }
}
