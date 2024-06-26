package com.FinalPharma.finalPharma;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy
@SpringBootApplication
public class FinalPharmaApplication {

	public static void main(String[] args) {
		SpringApplication.run(FinalPharmaApplication.class, args);
	}

}
