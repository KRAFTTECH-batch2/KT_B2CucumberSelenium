package com.krafttech.jdbc_test;

import java.sql.*;

public class Test_JDBC_Closing {
    public static void main(String[] args) {
        String url = "jdbc:sqlserver://94.73.150.3:1433;" +
                "DatabaseName=u0583688_vlk;" +
                "encrypt=true;" +
                "trustServerCertificate=true;";
        String userName = "u0583688_vlk";
        String password ="VolkanAntalya159*";
        String query = "SELECT  * from u0583688_vlk.dbo.regions";



        try (Connection connection= DriverManager.getConnection(url,userName,password);
             Statement  statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
             ResultSet  resultSet = statement.executeQuery(query);
        )
        {
            resultSet.next();
            //System.out.println(resultSet.getString(2));
            System.out.println("Connection OK");

        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }

        System.out.println("connection kapandı");



/*       try {
            connection= DriverManager.getConnection(url,userName,password);
            statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
            resultSet = statement.executeQuery(query);
            resultSet.next();
            System.out.println(resultSet.getString(2));
        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if (resultSet != null) {
                resultSet.close();
            }
            if (statement != null) {
                statement.close();
            }
            if (connection != null) {
                connection.close();
            }

        }*/

    }
}
