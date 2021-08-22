package com.ups.mvc.sprin_mvc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	
	
	public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
     	   ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml", "bean.xml");
     	   ShapeMaker shapeMaker =(ShapeMaker)context.getBean("shapeM");
           shapeMaker.drawCircle();
           shapeMaker.drawRectangle();
           shapeMaker.drawSquare();		

       
    }
}
