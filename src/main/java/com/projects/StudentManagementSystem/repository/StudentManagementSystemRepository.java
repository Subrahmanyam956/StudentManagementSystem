package com.projects.StudentManagementSystem.repository;

import com.projects.StudentManagementSystem.model.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentManagementSystemRepository extends MongoRepository<Student, String> {
}
