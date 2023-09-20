package com.project.tourist;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServertApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServertApplication.class, args);
	}

}
