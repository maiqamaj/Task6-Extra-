package com.example.demo;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {
	@Autowired 
	private JobRepository jobRepository;
	private DepartmentRepository departmentRepository;
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		List<Job>employee =jobRepository.jobSalaryMorethan(5000);
		employee.forEach(System.out::println);
		
		// Double  totalSalary =departmentRepository.totalSalaryEmployess("IT");
		//System.out.print(totalSalary);
		
	}
	
	


}
