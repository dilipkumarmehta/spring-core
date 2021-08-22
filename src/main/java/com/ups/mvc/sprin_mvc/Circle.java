package com.ups.mvc.sprin_mvc;

import org.springframework.beans.factory.annotation.Value;

public class Circle implements Shape {

	@Value("${com.dilip:my default value}")
	private String name;

	public void draw() {
		System.out.println("######" + name);
		System.out.println("Circle::draw()");
	}
}