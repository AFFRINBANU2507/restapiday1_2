package com.example.day12.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Apicontroller {
@GetMapping("affrin")
public String getName()
{
	String studentName="IamNeo";
	return "Welcome"+studentName+"!";
}
}
