package com.collectionframework.services;


import com.collectionframework.models.SpaceMission;
import com.collectionframework.services.SpaceMissionServices;
import com.mysql.connect.MySqlConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class SpaceMissionServiceImp implements SpaceMissionServices {

    public static Connection mysql() {
        Connection connection;
        try {

            connection = MySqlConnection.getConnection();
            //Statement statement = connection.createStatement();
            //String query = "SELECT *FROM space_mission";
            // statement.executeQuery(query);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return connection;
    }

    @Override
    public List<SpaceMission> getAllMission() {

        List<SpaceMission> spaceMissionList;
        try {

            Statement statement = mysql().createStatement();
            String query = "SELECT *FROM space_mission";
            ResultSet resultSet = statement.executeQuery(query);
            spaceMissionList = new ArrayList<>();

            while (resultSet.next()) {
                SpaceMission spaceMission = new SpaceMission();
                spaceMission.setId(resultSet.getInt(1));
                spaceMission.setMissionId(resultSet.getInt(2));
                spaceMission.setOrganisation(resultSet.getString(3));
                spaceMission.setLocation(resultSet.getString(4));
                spaceMission.setMissionStatus(resultSet.getString(5));
                spaceMissionList.add(spaceMission);
            }
            return spaceMissionList;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }


    @Override
    public List<SpaceMission> getMissionByCountry(String country) {
        return null;
    }

    @Override
    public List<SpaceMission> getAllSuccessMission() {
        List<SpaceMission> successMissionList;
        try {
            PreparedStatement preparedStatement = mysql().prepareStatement("SELECT *FROM space_mission WHERE mission_status = ?");
            preparedStatement.setString(1,"Success");
            ResultSet resultSet = preparedStatement.executeQuery();
            successMissionList = new ArrayList<>();

            while (resultSet.next()) {
                SpaceMission spaceMission = new SpaceMission();
                spaceMission.setId(resultSet.getInt(1));
                spaceMission.setMissionId(resultSet.getInt(2));
                spaceMission.setOrganisation(resultSet.getString(3));
                spaceMission.setLocation(resultSet.getString(4));
                spaceMission.setMissionStatus(resultSet.getString(5));
                successMissionList.add(spaceMission);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return successMissionList;
    }

    @Override
    public List<SpaceMission> getAllFailedMission() {
        List<SpaceMission> failedMission;
        try {

            PreparedStatement preparedStatement = mysql().prepareStatement("SELECT *FROM space_mission WHERE mission_status = ?");
            preparedStatement.setString(1,"Failure");
            ResultSet resultSet = preparedStatement.executeQuery();
            failedMission = new ArrayList<>();

            while (resultSet.next()) {
                SpaceMission spaceMission = new SpaceMission();
                spaceMission.setId(resultSet.getInt(1));
                spaceMission.setMissionId(resultSet.getInt(2));
                spaceMission.setOrganisation(resultSet.getString(3));
                spaceMission.setLocation(resultSet.getString(4));
                spaceMission.setMissionStatus(resultSet.getString(5));
                failedMission.add(spaceMission);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return failedMission;
    }

    @Override
    public List<SpaceMission> getAllSuccessMissionByCountry(String country) {
        List<SpaceMission> failedMission;
        try {

            PreparedStatement preparedStatement = mysql().prepareStatement("SELECT *FROM space_mission WHERE mission_status = ? AND ");
            preparedStatement.setString(1,"Failure");
            ResultSet resultSet = preparedStatement.executeQuery();
            failedMission = new ArrayList<>();

            while (resultSet.next()) {
                SpaceMission spaceMission = new SpaceMission();
                spaceMission.setId(resultSet.getInt(1));
                spaceMission.setMissionId(resultSet.getInt(2));
                spaceMission.setOrganisation(resultSet.getString(3));
                spaceMission.setLocation(resultSet.getString(4));
                spaceMission.setMissionStatus(resultSet.getString(5));
                failedMission.add(spaceMission);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return failedMission;
    }

    @Override
    public List<SpaceMission> getAllFailedMissionByCountry(String country) {
        List<SpaceMission> spaceMissionList = new ArrayList<>();
        return spaceMissionList;
    }
}
