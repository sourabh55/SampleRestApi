package com.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SampleRestApiDemomApplication {

	public static void main(String[] args) {
		SpringApplication.run(SampleRestApiDemomApplication.class, args);
		
		
		
	}
	
	
	@GetMapping("/hi")
	public String GetMessage() {
		return "your project working fine !!";
	}

}
