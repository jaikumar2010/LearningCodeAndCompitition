package com.collectionframework.services;

import com.collectionframework.models.SpaceMission;

import java.util.List;

public interface SpaceMissionServices {
    List<SpaceMission> getAllMission();

    List<SpaceMission> getMissionByCountry(String country);

    List<SpaceMission> getAllSuccessMission();

    List<SpaceMission> getAllFailedMission();

    List<SpaceMission> getAllSuccessMissionByCountry(String country);

    List<SpaceMission> getAllFailedMissionByCountry(String country);
}
