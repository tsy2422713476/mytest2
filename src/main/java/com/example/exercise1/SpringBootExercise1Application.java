package com.example.exercise1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ImportResource;

@ImportResource(value= {"classpath:spring-web.xml"})
@SpringBootApplication
public class SpringBootExercise1Application extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(SpringBootExercise1Application.class, args);
	}
	
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		// TODO Auto-generated method stub
		return builder.sources(SpringBootExercise1Application.class);
	}

}

