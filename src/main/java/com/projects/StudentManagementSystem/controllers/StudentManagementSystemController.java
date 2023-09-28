package com.projects.StudentManagementSystem.controllers;

import com.projects.StudentManagementSystem.model.Student;
import com.projects.StudentManagementSystem.service.SmsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class StudentManagementSystemController {
    private final SmsService smsService;

    public StudentManagementSystemController(SmsService smsService) {
        this.smsService = smsService;
    }

    @GetMapping("/students")
    public String listAllStudents(Model model) {
        model.addAttribute("students", smsService.getAllStudents());
        return "students";
    }

    @GetMapping("/students/new")
    public String createNewStudent(Model model) {
        Student student = new Student();
        model.addAttribute("student", student);
        return "create_student";
    }

    @PostMapping("/students")
    public String saveStudent(@ModelAttribute("student") Student student, Model model) {
        smsService.saveStudent(student);
        return "redirect:/students";
    }

    @PostMapping("/students/edit/{id}")
    public String editStudentForm(@PathVariable String id, Model model) {
        model.addAttribute("student", smsService.getStudentById(id));
        return "edit_student";
    }


    @PostMapping("/students/{id}")
    public String updateStudent(@PathVariable String id, @ModelAttribute("student") Student student,
                                Model model) {
        Student existingStudent = smsService.getStudentById(id);

        existingStudent.setFirstName(student.getFirstName());
        existingStudent.setLastName(student.getLastName());
        existingStudent.setEmail(student.getEmail());

        smsService.updateStudent(existingStudent);
        return "redirect:/students";
    }

    @GetMapping("/students/{id}")
    public String deleteStudent(@PathVariable String id) {
        smsService.deleteStudentById(id);
        return "redirect:/students";
    }

}
