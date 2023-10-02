package com.classroom.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;



@SpringBootApplication
@Configuration
@ComponentScan({"com.classroom.demo.requests"})
@EntityScan("com.classroom.demo.entities")
@EnableJpaRepositories ("com.classroom.demo.repositories") 
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
