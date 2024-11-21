package com.ULip.ULip;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages={"com.ULip.ULip"})
public class ULipApplication {

	public static void main(String[] args) {

		SpringApplication.run(ULipApplication.class, args);
	}

}
