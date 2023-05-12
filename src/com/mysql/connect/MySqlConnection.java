package com.mysql.connect;

import java.sql.Connection;
import java.sql.DriverManager;

public class MySqlConnection {

    static Connection connection = null;
    static String DRIVER = "com.mysql.cj.jdbc.Driver";
    static String URL = "jdbc:mysql://localhost:3306/learning_sql";
    static String USER = "root";
    static String PASSWORD = "1234";

    public static Connection getConnection(){
        try {
            Class.forName(DRIVER);
            connection = DriverManager.getConnection(URL, USER, PASSWORD);

        }catch (Exception e){
            e.printStackTrace();
        }
        return connection;
    }


}
