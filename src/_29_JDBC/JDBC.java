package _29_JDBC;

import java.sql.*;

public class JDBC {
    private static final String url = "jdbc:mysql://127.0.0.1:3306/college";
    private static final String username = "root";
    private static final String password = "Shikhil@4";

    public static void main(String[] args) {
        // 1
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        }catch (ClassNotFoundException e){
            System.out.println(e.getMessage());
        }

        try {
            // 2
            Connection connection = DriverManager.getConnection(url, username, password);

            // 3
            String query = "SELECT rollno, name FROM student";
            PreparedStatement preparedStatement = connection.prepareStatement(query);

            // 4
            ResultSet resultSet = preparedStatement.executeQuery();

            // 5
            while (resultSet.next()) {
                int rollno = resultSet.getInt("rollno");
                String name = resultSet.getString("name");
                System.out.println("Roll No: " + rollno + ", Name: " + name);
            }

            // 6
            connection.close();
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
}

// 1. driver
// 2. Connection
// 3. Create, Statement or PreparedStatement
// 4. Execute SQL statements
// 5. Process the result
// 6. Close the connection