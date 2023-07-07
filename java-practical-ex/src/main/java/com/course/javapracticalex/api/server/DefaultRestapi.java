package com.course.javapracticalex.api.server;

import java.time.LocalTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/api")
public class DefaultRestapi {
	
	//@RequestMapping(value="/api/welcome")
	@GetMapping(value="/welcome")
	public String welcome() {
		return "Welcome to Spring Boot";
	}
	
	//@GetMapping(value="/time")
	@RequestMapping(value="/api/time")
	public String getTime() {
		return LocalTime.now().toString();
	}
}
