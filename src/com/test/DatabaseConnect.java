package com.test;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DatabaseConnect {

    public static  Connection databaseConnect() throws SQLException{

        Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost/department", "root", "");
        System.out.println("Database connected");
        return connection;


    }
}
