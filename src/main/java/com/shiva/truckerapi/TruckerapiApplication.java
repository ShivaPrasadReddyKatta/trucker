package com.shiva.truckerapi;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
//@ComponentScan("com.shiva.truckerapi.repository")
public class TruckerapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(TruckerapiApplication.class, args);
	}

}
