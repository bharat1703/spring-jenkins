package com.prasad;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJenkinsApplication {

	public static Logger logger=LoggerFactory.getLogger(SpringJenkinsApplication.class);
	
	@PostConstruct
	public void init() {
		logger.info("Allipcation started.......");
	}
	
	public static void main(String[] args) {
		logger.info("Allipcation excuted.......");
		
		System.out.println("hi bro");
		System.out.println("i am prasad");
		System.out.println("how are you");
		
		SpringApplication.run(SpringJenkinsApplication.class, args);

	
	
	
	}

	
	
	
	
	
}
