package com.marcoduarte.dom6;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class Dom6Application {

	public static void main(String[] args) {
		SpringApplication.run(Dom6Application.class, args);

	}
}
