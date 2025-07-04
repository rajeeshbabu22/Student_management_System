package com.ty;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ty.entity.Student;
import com.ty.repository.StudentRepository;

@SpringBootApplication
public class SpringProjectStudentApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringProjectStudentApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;
	@Override
	public void run(String... args) throws Exception {
//		Student student1=new Student("Ramesh","kumar","ramesh@gmail.com");
//		studentRepository.save(student1);
//		
//		Student student2=new Student("Ravi","Shastri","ravi@gmail.com");
//		studentRepository.save(student2);
//		
//		Student student3=new Student("Virat","kohli","virat@gmail.com");
//		studentRepository.save(student3);
		
		
		
	}

}
