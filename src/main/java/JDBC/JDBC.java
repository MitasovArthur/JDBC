package JDBC;

import JDBC.clas.Info;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JDBC {
    private static final String URL = "jdbc:mysql://localhost:3306/myjoinsdb";
    private static final String LOGIN = "root";
    private static final String PSSWORD = "root";

    public List<Info> getAllInfo() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver loaaded success");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Connection connection;
        Statement statement;
        List<Info> info = new ArrayList<>();
        try {
            connection = DriverManager.getConnection(URL, LOGIN, PSSWORD);
            statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("select * from info");
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int number = rs.getInt("number");
                Info i = new Info(id, name, number);
                info.add(i);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return info;
    }
}
