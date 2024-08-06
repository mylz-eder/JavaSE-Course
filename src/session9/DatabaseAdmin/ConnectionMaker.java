package session9.DatabaseAdmin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionMaker {
    private Connection connection;

    public void connect() throws SQLException {

        connection = DriverManager.getConnection(
                "jdbc:oracle:thin:@localhost:1521:xe",
                "internallogin",
                "internallogin1234"
        );
    }
}
