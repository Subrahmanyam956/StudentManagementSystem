package com.projects.StudentManagementSystem.service;

public class SmsService {


    public List<Student> getAllStudents() {
        return studentManagementSystemRepository.findAll();
    }
}
