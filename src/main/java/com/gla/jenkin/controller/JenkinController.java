package com.gla.jenkin.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class JenkinController {
	@GetMapping
	public String myCode() {
		return "this is jenkins";
	}

}
