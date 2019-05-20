package com.multicert.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.view.JstlView;
import org.springframework.web.servlet.view.UrlBasedViewResolver;

@Configuration
@EnableAutoConfiguration
@ComponentScan(basePackages= "com.multicert.app")
@EnableTransactionManagement
public class MulticertExerciseApplication {

	public static void main(String[] args) {

		SpringApplication.run(MulticertExerciseApplication.class, args);
	}

}
