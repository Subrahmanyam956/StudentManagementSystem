package com.projects.StudentManagementSystem.service;

import com.projects.StudentManagementSystem.model.Student;
import com.projects.StudentManagementSystem.repository.StudentManagementSystemRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SmsService {
    private final StudentManagementSystemRepository studentManagementSystemRepository;

    public SmsService(StudentManagementSystemRepository studentManagementSystemRepository) {
        this.studentManagementSystemRepository = studentManagementSystemRepository;
    }

    public List<Student> getAllStudents() {
        return studentManagementSystemRepository.findAll();
    }

    public Student saveStudent(Student student) {
        return studentManagementSystemRepository.save(student);
    }

    public Student getStudentById(String id) {
        return studentManagementSystemRepository.findById(id).get();
    }

    public Student updateStudent(Student student) {
        return studentManagementSystemRepository.save(student);
    }

    public void deleteStudentById(String id) {
        studentManagementSystemRepository.deleteById(id);
    }

}
