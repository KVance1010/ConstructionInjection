package com.studyeasy.cars;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.studyeasy.interfaces.Car;
import com.studyeasy.interfaces.Engine;

//@Component("corolla") you do not need component when using spring beans. Spring beans is the new way of doing it.
// @Scope(value= "prototype") by declaring this a prototype you can create more than one object
public class Corolla implements Car{
	
	@Autowired  // searches for the object in the spring container. only searches by type
	@Qualifier ("engineType") // this allows you to clarify objects name 
	Engine engine;

	@Override
	public String specs() {
		String specs = "Maker is Toyota with " + engine.type();
		return specs;
	}

}
