package edu.nju;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("edu.nju.mapper")
public class ServiceQuestionApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceQuestionApplication.class, args);
	}
}
