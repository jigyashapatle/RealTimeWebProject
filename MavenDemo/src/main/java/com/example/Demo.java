package com.example;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

public class Demo implements CommandLineRunner{
	@Bean
	@Override
	public void run(String... args) throws Exception {
		System.out.println("Demo Command Line Runner");
	}
}
