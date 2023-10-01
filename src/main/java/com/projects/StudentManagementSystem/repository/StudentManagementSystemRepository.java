package com.projects.StudentManagementSystem.repository;

import com.projects.StudentManagementSystem.model.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentManagementSystemRepository extends MongoRepository<Student, String> {
}
