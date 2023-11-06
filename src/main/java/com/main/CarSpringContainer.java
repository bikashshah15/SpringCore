package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.service.Car;

public class CarSpringContainer {

	public static void main(String[] args){
		
		//Creating container
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("car.xml");
		
		Car c1 = (Car) applicationContext.getBean("car1");
		System.out.println(c1);
		System.out.println(c1.hashCode());
		
		Car c3 = (Car) applicationContext.getBean("car1");
		System.out.println(c3);
		System.out.println(c3.hashCode());
		
//		Car c2 = (Car) applicationContext.getBean("car2");
//		System.out.println(c2);
		

	}

}
