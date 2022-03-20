package com.gurung.awskinesisproducer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class AwsKinesisProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(AwsKinesisProducerApplication.class, args);
	}

}
