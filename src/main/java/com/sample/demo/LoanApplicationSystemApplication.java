package com.sample.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.sample.demo.Repository")
@EntityScan(basePackages = "com.sample.demo.entity") 
public class LoanApplicationSystemApplication {

	public static void main(String[] args) {
		System.out.println("===============");
		SpringApplication.run(LoanApplicationSystemApplication.class, args);
		System.out.println("========Started=======");
	}

}
