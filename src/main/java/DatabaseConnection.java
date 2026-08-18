import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.jdbc.AbandonedConnectionCleanupThread;

public class DatabaseConnection {

    private static final String URL =
            "jdbc:mysql://localhost:3306/expense_tracker";

    private static final String USER = "root";

    public static Connection getConnection()
            throws SQLException {

        String password = System.getenv("MYSQL_PASSWORD");

        if (password == null || password.isEmpty()) {
            throw new SQLException(
                    "MYSQL_PASSWORD environment variable is not set."
            );
        }

        return DriverManager.getConnection(
                URL,
                USER,
                password
        );
    }

    public static void closeCleanupThread() {
        AbandonedConnectionCleanupThread.checkedShutdown();
    }
}