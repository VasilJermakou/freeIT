package hwlesson18.blinovbook.phonebook;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectorDB {

    public static Connection getConnection() throws SQLException{
        String url = "jdbc:mysql://localhost:3306/freeit_db";
        String user = "bestuser";
        String password = "bestuser";
        return DriverManager.getConnection(url, user, password);
    }
}
