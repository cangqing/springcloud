package com.cangqing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class DockereurakaregisterApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockereurakaregisterApplication.class, args);
	}
}
