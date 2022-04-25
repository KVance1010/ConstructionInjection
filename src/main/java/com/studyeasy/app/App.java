package com.studyeasy.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.studyeasy.interfaces.Car;

public class App {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(AppConfig.class);

		Car myCar = context.getBean("corolla", Car.class);
		System.out.println(myCar.specs());

		context.close();

	}

}
