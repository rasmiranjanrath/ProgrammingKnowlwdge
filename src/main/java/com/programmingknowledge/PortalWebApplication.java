package com.programmingknowledge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class PortalWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(PortalWebApplication.class, args);
	}

}

