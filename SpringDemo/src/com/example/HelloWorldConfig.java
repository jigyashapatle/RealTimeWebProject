package com.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

public class HelloWorldConfig {
	@Bean(name="hw")
	@Scope(value="prototype")
	public HelloWorld meth1()
	{
		return new HelloWorld();
	}
}
