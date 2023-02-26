package com.disabe.authAndAut;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class AuthAndAutApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuthAndAutApplication.class, args);
	}

}
