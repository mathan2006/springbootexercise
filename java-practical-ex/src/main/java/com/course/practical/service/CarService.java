package com.course.practical.service;

import java.util.List;

import com.course.practical.entity.Car;

public interface CarService {
	List<String> BRANDS = List.of("Toyota","Honda","Ford");
	
	List<String> COLORS = List.of("Red","Blue","White");
	
	List<String> TYPES = List.of("Sedan","SUV","MPV");
	
	Car generateCar();
}
