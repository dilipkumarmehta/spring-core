package com.ups.mvc.sprin_mvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.MessageSource;

public class Square implements Shape {

	@Autowired
	MessageSource messageSource;
	
	
	public void draw() {
		System.out.println("Square::draw()");
		System.out.println(messageSource.getMessage("com.dilip", null, "com.dilip", null));
	}
}