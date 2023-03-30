package com.example.hospital_management_system.doctor;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
@RequestMapping("/doctor")
public class DoctorController {

    HashMap<Integer, Doctor> doctorDb = new HashMap<>();

    @PostMapping("/add")
    public String add(@RequestBody Doctor doctor) {
        int key = doctor.getDoctorId();
        doctorDb.put(key, doctor);
        return "doctor add successfully";
    }

    @GetMapping("/get")
    public Doctor get(@RequestParam("doctorId")Integer doctorId) {
        return doctorDb.get(doctorId);
    }

    @PutMapping("/update")
    public String update(@RequestBody Doctor doctor) {
        int key = doctor.getDoctorId();
        doctorDb.put(key, doctor);
        return "update successfull";
    }

    @DeleteMapping("/delete")
    public String delete(@RequestParam("doctorId")Integer doctorId) {
        doctorDb.remove(doctorId);
        return "delete Successfull";
    }
}
