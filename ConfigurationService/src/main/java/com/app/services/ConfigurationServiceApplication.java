package com.app.services;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class ConfigurationServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigurationServiceApplication.class, args);
		System.out.println("testing github....");
		System.out.println("testing github....");
		System.out.println("testing github....");
		System.out.println("testing github....");
		System.out.println("testing github....");
		System.out.println("testing github....");
	}
}
