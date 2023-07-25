package com.microservice.microservicewitheurekaapigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MicroserviceWithEurekaApiGateWayApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceWithEurekaApiGateWayApplication.class, args);
	}

}
