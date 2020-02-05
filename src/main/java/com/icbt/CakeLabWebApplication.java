package com.icbt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class CakeLabWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(CakeLabWebApplication.class, args);
	}

}
