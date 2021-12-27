import org.sqlite.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBConect {

    private final String PATH_TO_DB = "jdbc:sqlite:src/Weather.db";
    private Connection connection;

    public DBConect() throws SQLException {
        DriverManager.deregisterDriver(new JDBC());
        this.connection = DriverManager.getConnection(PATH_TO_DB);
    }


    public void addTemp() {
        try (PreparedStatement preparedStatement = this.connection.prepareStatement(
                    "INSERT INTO Weather('Sity', 'Date', 'Weather', 'Temperatyre') VALUES (?,?,?,?)"
            )){
                preparedStatement.setObject(1,);
                preparedStatement.setObject(2,);
                preparedStatement.setObject(3,);
                preparedStatement.setObject(4,);
            } catch (SQLException e) {
            e.printStackTrace();
        }
    }


}
