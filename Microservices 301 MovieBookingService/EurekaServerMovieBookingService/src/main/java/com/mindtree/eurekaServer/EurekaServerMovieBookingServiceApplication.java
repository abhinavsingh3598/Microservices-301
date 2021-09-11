package com.mindtree.eurekaServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerMovieBookingServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServerMovieBookingServiceApplication.class, args);
	}

}
