package com.projects.StudentManagementSystem;

import com.projects.StudentManagementSystem.model.Student;
import com.projects.StudentManagementSystem.repository.StudentManagementSystemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentManagementSystemApplication {

	@Autowired
	private StudentManagementSystemRepository studentManagementSystemRepository;

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	//	System.out.println("Hello World");
	}

/*
	@Override
	public void run(String... args) throws Exception {
		Student student1 = new Student("Ramya Bhargavi", "Martha", "RamyaBhargaviMartha@gmail.com");
		StudentManagementSystemRepository.save(student1);

		Student student2 = new Student("Subrahmanyam", "Martha", "subrahmanyam956@gmail.com");
		studentManagementSystemRepository.save(student2);
	}

	*/

}
