package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
//localhost:8080
@Controller
public class WebController {
	
	//localhost:8080/home
	@RequestMapping("/home")
	@ResponseBody
	String display()
	{
		return "Spring Boot web Application";
	}
	
	@RequestMapping("/rcb")
	@ResponseBody
	String display1()
	{
		return "<h1>Virat ABD Gayle</h1>";
	}
	
	@RequestMapping("/rcb1")
	@ResponseBody
	String display2(String name)
	{
		return "Hello:"+name;
	}

}
