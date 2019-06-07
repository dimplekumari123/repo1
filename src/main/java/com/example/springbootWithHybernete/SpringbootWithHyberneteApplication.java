package com.example.springbootWithHybernete;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class SpringbootWithHyberneteApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootWithHyberneteApplication.class, args);
		System.out.println();
	}

}
