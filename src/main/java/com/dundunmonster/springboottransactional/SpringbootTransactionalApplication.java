package com.dundunmonster.springboottransactional;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.dundunmonster.springboottransactional.dao")
public class SpringbootTransactionalApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootTransactionalApplication.class, args);
	}

}

