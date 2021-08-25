package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionDB {

    public static Connection conectar() {

        try {
            String connectionUrl = "jdbc:mysql://localhost:3306/apuntenianos";
            return DriverManager.getConnection(connectionUrl, "root", "");
        } catch (SQLException error) {
            error.printStackTrace();
            return null;
        }
    }
}
