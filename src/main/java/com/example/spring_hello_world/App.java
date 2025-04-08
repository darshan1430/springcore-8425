package com.example.spring_hello_world;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
    	
    	
    	ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        System.out.println("Hello World!");
    	
    	HelloWorld helloWorld = (HelloWorld)context.getBean("helloWorld");
    	helloWorld.sayHello();
    		
    }
}
