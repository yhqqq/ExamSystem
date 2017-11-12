package edu.nju;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("edu.nju.mapper")
public class ServiceExamApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceExamApplication.class, args);
	}
}
