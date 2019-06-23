package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(method = RequestMethod.GET)
public class SampleController {

	//GetMapping
	//@RequestMapping(value = "/hello" , method = {RequestMethod.GET,RequestMethod.PUT})
	@RequestMapping("/hello")
	@ResponseBody
	public String hello() {
		return "hello";
	}
	
}
