package com.example.hospital_management_system.doctor;

public class Doctor {
    private String name;
    private int age;
    private String speciality;
    private int doctorId;

    public Doctor(String name, int age, String speciality, int doctorId) {
        this.name = name;
        this.age = age;
        this.speciality = speciality;
        this.doctorId = doctorId;
    }

    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }
}
