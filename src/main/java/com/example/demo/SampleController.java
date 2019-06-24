package com.example.demo;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SampleController {

	//GetMapping
	//@RequestMapping(value = "/hello" , method = {RequestMethod.GET,RequestMethod.PUT})
	//@RequestMapping({"/hello","/hi"})
	
	@RequestMapping(value = "/hello" , consumes = MediaType.APPLICATION_JSON_UTF8_VALUE ,produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public String hello() {
		return "hello sungwon";
	}
	
	
}
