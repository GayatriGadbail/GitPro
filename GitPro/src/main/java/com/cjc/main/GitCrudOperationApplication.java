package com.cjc.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
@EnableDiscoveryClient
@SpringBootApplication
public class GitCrudOperationApplication {

	public static void main(String[] args) {
		System.out.println("Crud Operation");
		SpringApplication.run(GitCrudOperationApplication.class, args);
	}

}
