package com.rohit.microservice.netflixeurakanamingserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class NetflixEurakaNamingServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(NetflixEurakaNamingServerApplication.class, args);
	}

}
