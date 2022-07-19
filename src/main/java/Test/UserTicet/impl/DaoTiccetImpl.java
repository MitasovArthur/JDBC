package Test.UserTicet.impl;

import Test.UserTicet.Configuration.DataBase;
import Test.UserTicet.dao.DaoTiccet;
import Test.UserTicet.entity.Ticcet;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class DaoTiccetImpl implements DaoTiccet {
    private final String STATMEN_FOR_SELECT_BY_ID = "select * from tickets where id = ?";

    @Override
    public Ticcet getById(int id) {
        Ticcet ticcet = new Ticcet();
        try (Connection connection = DataBase.getConnection();
             PreparedStatement statement = connection.prepareStatement(STATMEN_FOR_SELECT_BY_ID)) {
            statement.setInt(1,id);
            ResultSet resultSet = statement.executeQuery();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean add(Ticcet ticcet) {
        return false;
    }
}
