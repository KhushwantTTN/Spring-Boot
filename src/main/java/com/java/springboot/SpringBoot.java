package com.java.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBoot implements CommandLineRunner {
	@Autowired
	EmployeeRepository repository;
	public static void main(String[] args) {

		SpringApplication.run(SpringBoot.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
    repository.save(new Employee("Trainee","Khushwant",1));
    repository.save(new Employee("Trainee","Hema",2));
	}
}
