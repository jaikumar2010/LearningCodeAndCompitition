package com.learning.mysql;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class RetrieveSomeData {

    public static void main(String[] args) {
        try {
            Connection connection = DataSource.getConnection();
            String query = "SELECT *FROM student_info";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()){
                System.out.println(resultSet.getString("student_name")
                +" "+resultSet.getString("student_address"));
                //System.out.println();
            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
