package edu.nju;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@EnableEurekaClient
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class ServiceExamineeApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceExamineeApplication.class, args);
	}
}
