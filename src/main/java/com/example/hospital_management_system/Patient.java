package com.example.hospital_management_system;

public class Patient {
    private String name;
    private int age;
    private String disease;
    private int patientId;

    public Patient(String name, int age, String disease, int patientId) {
        this.name = name;
        this.age = age;
        this.disease = disease;
        this.patientId = patientId;
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

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }
}
