package com.twaddivisionservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties
@EntityScan(basePackages = {"com.twaddivisionservice.model","com.twaddivisionservice.twadChangesModel"})
public class TwadDivisionServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(TwadDivisionServiceApplication.class, args);
	}

}
