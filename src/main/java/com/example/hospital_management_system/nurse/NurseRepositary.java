package com.example.hospital_management_system.nurse;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Repository
public class NurseRepositary {

    HashMap<Integer, Nurse> nurseDb = new HashMap<>();

    public String addNurse(Nurse nurse) {
        int key = nurse.getNurseId();
        nurseDb.put(key, nurse);
        return "Nurse added successfully";
    }

    public List<Nurse> getNurseList() {
        List<Nurse> nurseList = new ArrayList<>();
        for (Nurse n: nurseDb.values()){
            nurseList.add(n);
        }
        return nurseList;
    }
}
