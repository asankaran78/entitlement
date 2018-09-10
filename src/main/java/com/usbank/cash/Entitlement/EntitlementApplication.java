package com.usbank.cash.Entitlement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class EntitlementApplication {

	public static void main(String[] args) {
		SpringApplication.run(EntitlementApplication.class, args);
	}
}
