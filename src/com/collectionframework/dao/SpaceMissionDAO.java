package com.collectionframework.dao;

import com.collectionframework.models.SpaceMission;
import com.collectionframework.services.SpaceMissionServiceImp;

import java.sql.SQLException;
import java.util.List;

public class SpaceMissionDAO {
    SpaceMissionServiceImp spaceMissionServiceImp = null;

    public SpaceMissionDAO() {
        spaceMissionServiceImp = new SpaceMissionServiceImp();
    }

    public List<SpaceMission> getAll() throws SQLException {
        return spaceMissionServiceImp.getAllMission();
    }

    public List<SpaceMission> getAllSuccess() {
        return spaceMissionServiceImp.getAllSuccessMission();
    }

    public List<SpaceMission> getAllFailure() {
        return spaceMissionServiceImp.getAllFailedMission();
    }

    public List<SpaceMission> successMissionByCountry(String country) {
        return spaceMissionServiceImp.getAllSuccessMissionByCountry(country);
    }

    public List<SpaceMission> failedMissionByCountry(String country) {
        return spaceMissionServiceImp.getAllFailedMissionByCountry(country);
    }


}
