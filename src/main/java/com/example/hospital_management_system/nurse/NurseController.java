package com.example.hospital_management_system.nurse;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/nurse")
public class NurseController {

    NurseService nurseService = new NurseService();
    @PostMapping("/add")
    public String addNurse(@RequestBody Nurse nurse) {
        return nurseService.addNurse(nurse);
    }

    @GetMapping("/getNurseGreaterThanAge")
    public List<Nurse> getNurseGreaterThanAge(@RequestParam("age")Integer age) {
        return nurseService.nurseGreaterThanAge(age);
    }
}
