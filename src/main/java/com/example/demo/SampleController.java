package com.example.demo;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE )
public class SampleController {

	//GetMapping
	//@RequestMapping(value = "/hello" , method = {RequestMethod.GET,RequestMethod.PUT})
	//@RequestMapping({"/hello","/hi"})
	
	@RequestMapping(value = "/helloyo" , consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ResponseBody
	public String helloYo() {
		return "hello sungwon";
	}
	
	@GetHelloMapping
	@ResponseBody
	public String hello() {
		return "hello";
	}
	
	//
	@GetMapping("/events")
	@ResponseBody
	public String events() {
		return "events";
	}
	
	@GetMapping("/events/{id}")
	@ResponseBody
	public String events1(@PathVariable("id") int id) {
		return "event";
	}
	
	@PostMapping(value="/events" ,consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ResponseBody
	public String createEvent() {
		return "event";
	}
	
	
}
