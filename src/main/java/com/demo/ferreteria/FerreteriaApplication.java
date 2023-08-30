package com.demo.ferreteria;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class FerreteriaApplication {

	@RequestMapping("/")
	String home(){
		return "Hola mundo";
	}
	public static void main(String[] args) {
		SpringApplication.run(FerreteriaApplication.class, args);
	}

}
