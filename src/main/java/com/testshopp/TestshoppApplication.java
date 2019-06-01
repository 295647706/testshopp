package com.testshopp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(value = {"com.testshopp.beau.storage.auto.mapper", "com.testshopp.beau.storage.ext.mapper"})
@SpringBootApplication
public class TestshoppApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestshoppApplication.class, args);
	}

}
