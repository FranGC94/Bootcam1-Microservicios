package com.nttdata.bootcamp.retoconfigservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="controller.*")
public class RetoConfigServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RetoConfigServiceApplication.class, args);
	}

}
