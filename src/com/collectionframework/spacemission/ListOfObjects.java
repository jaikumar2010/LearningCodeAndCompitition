package com.collectionframework.spacemission;

import com.collectionframework.dao.SpaceMissionDAO;
import com.collectionframework.models.SpaceMission;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ListOfObjects {

    public static void main(String[] args) throws SQLException {

        SpaceMissionDAO dao = new SpaceMissionDAO();
        List<SpaceMission> spaceMissionsList = new ArrayList<>();
        spaceMissionsList = (List<SpaceMission>) dao.getAll();
        System.out.println(spaceMissionsList.size());
        //spaceMissionsList.forEach(System.out::println);

        // use Predicate on the list of mission
        //
        System.out.println("............USA............");
        Predicate<SpaceMission> locationUSA = (spaceMission -> spaceMission.getLocation().contains("USA"));
        spaceMissionsList.stream()
                .filter(locationUSA.and(m->m.getMissionStatus().equalsIgnoreCase("Failure")))
                .forEach(System.out::println);

        System.out.println(spaceMissionsList.stream()
                .filter(locationUSA.and(m->m.getMissionStatus().equalsIgnoreCase("Failure")).and(
                        o->o.getOrganisation().equalsIgnoreCase("NASA")
                ))
                .count());





        // get mission from USA

//        List<SpaceMission> missionFromUSA = spaceMissionsList.stream()
//                .filter(spaceMission -> spaceMission.getLocation().contains("USA"))
//                .collect(Collectors.toList());
//        System.out.println("Mission from USA:");
//        missionFromUSA.forEach(System.out::println);

        // only success mission
//        System.out.println("successMissionsList...........");
//        List<SpaceMission> successMissionsList = new ArrayList<>();
//        successMissionsList = dao.getAllSuccess();
//        System.out.println(successMissionsList.size());
//        successMissionsList.forEach(System.out::println);


        // only unsuccess mission
//        System.out.println("FailedMissionsList...........");
//        List<SpaceMission> failedMissionsList = new ArrayList<>();
//        System.out.println(failedMissionsList.size());
//        failedMissionsList.forEach(System.out::println);
    }
}
