package com.docker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerClass {
	
	@GetMapping
	public String test() {
		return "test docker";
	}

}
