package com.course.practical.apiserver;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.course.practical.entity.Car;
import com.course.practical.service.CarService;

@RestController
@RequestMapping(value="/api/car/v1")

public class CarApi {
	
	private static final Logger Log = LoggerFactory.getLogger(CarApi.class);
	@Autowired
	private CarService carService;
	
	@GetMapping(value="/random", produces = MediaType.APPLICATION_JSON_VALUE)
//	@RequestMapping(value="/random",method=RequestMethod.GET)
	public Car random() {
		return carService.generateCar();
	}
	
	@PostMapping(value="/echo",consumes=MediaType.APPLICATION_JSON_VALUE)
	public String echo(@RequestBody Car car) {
		Log.info("Car is {}",car);
		return car.toString();
	}
}
