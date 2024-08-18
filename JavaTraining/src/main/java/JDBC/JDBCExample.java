package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCExample {
    public static void main(String[] args) throws SQLException {
        // establish the database connection
        // 1. url
        // 2. username and password
        // 3. database name
        String username = "root";
        String password = "";
        String url = "jdbc:mysql://localhost:3306/javatraining";
        // to make the connection
        try {
            Connection conn = DriverManager.getConnection(url, username, password);
            System.out.println("Database connection established");
            int sno = 1;
            String name = "Priyal";
            String email = "xyz@gamil.com";
            String mobile = "684568486";
            String technology = "Java";
            String address = "Lucknow";
            String query = " insert into trainer (S.No, TName, TEmail, TMobile, TTechnology, TAddress)"
                    + " values (?, ?, ?, ?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setInt(1, sno);
            stmt.setString(2, name);
            stmt.setString(3, email);
            stmt.setString(4, mobile);
            stmt.setString(5, technology);
            stmt.setString(6, address);
            stmt.executeUpdate(query);

        }catch (SQLException e){
            throw new RuntimeException("DB not connected " + e);
        }
    }
}
