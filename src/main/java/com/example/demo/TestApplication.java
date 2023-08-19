package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestApplication {

	public static void main(String[] args) {
		for (int i = 0; i < 1000; i++) {
			System.out.println("I LOve You");
		}
	}
}
