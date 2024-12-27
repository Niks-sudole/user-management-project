package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("com.demo.controller")
@EnableJpaRepositories("com.demo.repository")
public class UserManagementProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserManagementProjectApplication.class, args);
	}

}
