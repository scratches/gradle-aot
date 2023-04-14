package com.example;

import java.io.IOException;
import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {
	public static void main(String[] args) throws IOException {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(ConfigurableApplicationContext context) {
		return args -> {
			System.err.println(System.getProperty("java.class.path"));
			System.err.println(Arrays.asList(context.getResources("classpath*:/*.txt")));
		};
	}
}
