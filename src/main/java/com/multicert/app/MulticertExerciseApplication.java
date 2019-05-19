package com.multicert.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@ComponentScan(basePackages= "com.multicert.app")
public class MulticertExerciseApplication {

	public static void main(String[] args) {

		SpringApplication.run(MulticertExerciseApplication.class, args);
	}

}
