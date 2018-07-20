package com.careerfest.configuration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = "com.careerfest")
@EntityScan("com.careerfest.model")
@EnableJpaRepositories("com.careerfest.repository")
public class CareerFestAppStarter extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(CareerFestAppStarter.class);
	}
	public static void main(String[] args) {
    SpringApplication.run(CareerFestAppStarter.class, args);
	}

}
