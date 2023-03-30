package com.example.hospital_management_system.nurse;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class NurseService {

    NurseRepositary nurseRepositary = new NurseRepositary();

    public String addNurse(Nurse nurse){
        return nurseRepositary.addNurse(nurse);
    }

    public List<Nurse> nurseGreaterThanAge(int age) {
        List<Nurse> nurseList = nurseRepositary.getNurseList();
        List<Nurse> ans = new ArrayList<>();
        for (Nurse n: nurseList) {
            if (n.getAge() > age) {
                ans.add(n);
            }
        }
        return ans;
    }
}
