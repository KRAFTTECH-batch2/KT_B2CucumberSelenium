package com.krafttech.jdbc_test;

import java.sql.*;
import java.util.List;

public class Test_JBDC_2 {
    public static void main(String[] args) {
        String url = "jdbc:sqlserver://94.73.170.25:1433;" +
                "DatabaseName=u0583688_Kraft2;" +
                "encrypt=true;" +
                "trustServerCertificate=true;";
        String userName = "u0583688_Kraft2";
        String password ="ANKARA123456789*0987654fg";
        String query = "SELECT TOP(10) * FROM u0583688_Kraft2.product.product";

        try {
            Connection connection = DriverManager.getConnection(url,userName, password);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            resultSet.next();
           // System.out.println( " resultSet.absolute(5) " +  resultSet.absolute(5));

//            System.out.print(resultSet.getRow()+" | "+ resultSet.getString(2));
//            System.out.println(" | "+resultSet.getString("model_year"));
//            resultSet.next();
//            System.out.print(resultSet.getRow()+" | "+ resultSet.getString(2));
//            System.out.println(" | "+resultSet.getString("model_year"));
//            String modelYear = resultSet.getString("model_year");
//            System.out.println("modelYear = " + modelYear);
            double price=  resultSet.getDouble("list_price");

            System.out.println("price = " + price);
//            System.out.println("modelYear2 = " + modelYear2);

          //Array brandList = resultSet.getArray(2);


        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
