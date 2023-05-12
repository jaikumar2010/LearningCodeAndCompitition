package com.collectionframework.models;

public class SpaceMission {
    private int id;
    private int missionId;
    private String organisation;
    private String location;
    private String missionStatus;


    public SpaceMission() {
    }

    public SpaceMission(int missionId, String organisation, String location, String missionStatus) {
        this.missionId = missionId;
        this.organisation = organisation;
        this.location = location;
        this.missionStatus = missionStatus;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMissionId() {
        return missionId;
    }

    public void setMissionId(int missionId) {
        this.missionId = missionId;
    }

    public String getOrganisation() {
        return organisation;
    }

    public void setOrganisation(String organisation) {
        this.organisation = organisation;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getMissionStatus() {
        return missionStatus;
    }

    public void setMissionStatus(String missionStatus) {
        this.missionStatus = missionStatus;
    }

    @Override
    public String toString() {
        return "SpaceMission{" +
                "id=" + id +
                ", missionId=" + missionId +
                ", organisation='" + organisation + '\'' +
                ", location='" + location + '\'' +
                ", missionStatus='" + missionStatus + '\'' +
                '}';
    }
}
