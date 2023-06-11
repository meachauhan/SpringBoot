package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Demo1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=  SpringApplication.run(Demo1Application.class, args);
		
		Aliean a=context.getBean(Aliean.class);
		a.show();
	}

}
