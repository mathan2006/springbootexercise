package com.course.javapracticalex;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.course.practical.apiserver.CarApi;

@SpringBootApplication(scanBasePackages={"com.course"})

public class JavaPracticalExApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaPracticalExApplication.class, args);
		
	}

}
