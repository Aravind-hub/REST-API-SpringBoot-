package io.javabrains.sprintbootstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CourseAPI {

	public static void main(String[] args) {
		System.out.println("Spring Boot");
		
		SpringApplication.run(CourseAPI.class, args);

	}

}
