package com.example.hospital_management_system;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@RestController
public class PatientController {
    
    HashMap<Integer, Patient> patientDb = new HashMap<>();

    // add patient via patientid, name, age, disease
    @PostMapping("/addPatient")
    public String addPatient(@RequestParam("patientId")Integer patientId, @RequestParam("name")String name,
                             @RequestParam("age")Integer age, @RequestParam("disease")String disease) {
        Patient p = new Patient(name, age, disease, patientId);
        patientDb.put(patientId, p);
        return "Patient added successfully";
    }
    
    // add patient via patient object / json data
    @PostMapping("/addPatientViaBody")
    public String addPatient(@RequestBody Patient patient) {
        int key = patient.getPatientId();
        patientDb.put(key, patient);
        return "Patient added successfully";
    }
    
    // get patient via patientid
    @GetMapping("/getPatientViaId")
    public Patient getPatient(@RequestParam("patientId")Integer patientId){
        Patient p = patientDb.get(patientId);
        return p;
    }
    
    // get list of patient
    @GetMapping("/getListOfPatient")
    public List<Patient> getPatient() {
        List<Patient> patientList = new ArrayList<>();
        for (Patient p : patientDb.values()) {
            patientList.add(p);
        }
        return patientList;
    }
    
    // get list of patient whose age is greater than given parameter
    @GetMapping("/getPatientGreaterThanAge")
    public List<Patient> getPatientGreaterThanAge(@RequestParam("age")Integer age) {
        List<Patient> patientList = new ArrayList<>();
        for (Patient p : patientDb.values()) {
            if (p.getAge() > age) patientList.add(p);
        }
        return patientList;
    }

    @GetMapping("/getPatientViaPathVariable/{patientId}")
    public Patient getPatientViaPathVariable(@PathVariable("patientId") Integer patientId) {
         return patientDb.get(patientId);
    }

    @GetMapping("/getPatientGreaterThanAgeAndDisease/{age}/{disease}")
    public List<Patient> getPatientGreaterThanAgeAndDisease(@PathVariable("age")Integer age, @PathVariable("disease")String disease) {
        List<Patient> patientList = new ArrayList<>();

        for (Patient p: patientDb.values()) {
            if(p.getAge() > age && p.getDisease().equals(disease)) {
                patientList.add(p);
            }
        }

        return patientList;
    }

    @PutMapping("/updatePatient")
    public String updatePatient(@RequestBody Patient patient) {
        int key = patient.getPatientId();
        patientDb.put(key, patient);
        return "Update complete";
    }

    @PutMapping("updatePatientDisease")
    public String updatePatientDisease(@RequestParam("patientId")Integer patientId, @RequestParam("disease")String disease) {
        Patient p = patientDb.get(patientId);
        p.setDisease(disease);
        return "update complete";
    }

    @DeleteMapping("deletePatient")
    public String deletePatient(@RequestParam("patientId")Integer patientId) {
        patientDb.remove(patientId);
        return "deleted patient";
    }

}
