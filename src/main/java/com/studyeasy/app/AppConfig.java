package com.studyeasy.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.studyeasy.cars.Corolla;
import com.studyeasy.cars.Mustang;
import com.studyeasy.specs.EngineType;

@Configuration
@ComponentScan("com.studyeasy")
public class AppConfig {
	
	@Bean("corolla")
	public Corolla corolla() {
		return new Corolla();
	}
	@Bean ("mustang")
	public Mustang mustang() {
		return new Mustang();
	}
	@Bean("engineType")
	public EngineType engineType() {
		return new EngineType("V8 engine");
	}
	
	
}
