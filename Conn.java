package travel.management.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class Conn {
    private Connection conn;
    private Statement statement;

    public Conn() {
        // Initialize the connection and statement when the Conn object is created
        initializeConnection();
    }

    public Connection getConn() {
        // Return the existing connection if available, otherwise initialize a new one
        if (conn == null) {
            initializeConnection();
        }
        return conn;
    }

    public Statement getStatement() {
        // Return the existing statement if available, otherwise initialize a new one
        if (statement == null) {
            try {
                statement = getConn().createStatement();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return statement;
    }

    private void initializeConnection() {
        try {
            // Provide your database URL, username, and password
            String url = "jdbc:mysql://localhost:3306/T_and_T";
            String username = "root";
            String password = "root123";

            // Load the JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish the connection
            conn = DriverManager.getConnection(url, username, password);

            // Initialize the statement
            statement = conn.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Close resources (connection, statement, etc.) when they are no longer needed
    public void closeResources() {
        try {
            if (statement != null) {
                statement.close();
            }
            if (conn != null && !conn.isClosed()) {
                conn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    PreparedStatement prepareStatement(String q1) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
