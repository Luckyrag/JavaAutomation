package miniProject_3;

import java.sql.*;

public class DBconnection {
    public static Connection getConnection() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/studentdb",
            "root",
            "Lokesh@143"
        );
    }
}
