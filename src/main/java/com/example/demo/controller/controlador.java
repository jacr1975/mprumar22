package com.example.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/example")
public class controlador {


		
		@GetMapping("/hello-world")
		public ResponseEntity<String> get() {
			int i = 0;
			return ResponseEntity.ok("Hello World Andres2!");
		}
	}