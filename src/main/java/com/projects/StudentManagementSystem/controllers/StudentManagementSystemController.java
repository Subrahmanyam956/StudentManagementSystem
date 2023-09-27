package com.projects.StudentManagementSystem.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class StudentManagementSystemController {
    private SmsService smsService;


    public String listAllStudents(Model Model) {
        model.attribute("students", smsService.getAllStudents());
        return "students";
    }
}
