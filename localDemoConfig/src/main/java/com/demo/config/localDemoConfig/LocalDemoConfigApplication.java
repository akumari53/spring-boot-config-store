package com.demo.config.localDemoConfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class LocalDemoConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(LocalDemoConfigApplication.class, args);
	}

}
