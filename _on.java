package bank.management.system;

import java.sql.*;

public class Con {
    public Connection connection;
    public Statement statement;

    public Con() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankSystem", "root", "1234");
            statement = connection.createStatement();
            System.out.println("Database connection successful.");
        } catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC Driver not found.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("SQL Exception: " + e.getMessage());
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("General Exception: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Con con = new Con();
        if (con.connection != null && con.statement != null) {
            System.out.println("You can now use the statement object.");
        } else {
            System.out.println("Connection or Statement is null. Fix the above errors.");
        }
    }
}
