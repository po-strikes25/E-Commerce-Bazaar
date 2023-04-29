package com.example.ecommercebazaar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class ECommerceBazaarApplication {

	public static void main(String[] args) {
		SpringApplication.run(ECommerceBazaarApplication.class, args);
	}

}
