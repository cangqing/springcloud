package com.cangqing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

@SpringBootApplication
//@EnableTurbine注解包含了@EnableDiscoveryClient注解
@EnableTurbine
public class ServiceTurbinApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceTurbinApplication.class, args);
	}
}
