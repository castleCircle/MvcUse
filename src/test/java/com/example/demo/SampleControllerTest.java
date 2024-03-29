package com.example.demo;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@WebMvcTest
public class SampleControllerTest {

	@Autowired
	MockMvc mockMvc;
	
	@Test
	public void helloYoTest() throws Exception {
		
		mockMvc.perform(get("/helloyo")
				.contentType(MediaType.APPLICATION_JSON).accept(MediaType.APPLICATION_JSON))
				.andDo(print())
				.andExpect(status().isOk());
		
	}
	
	@Test
	public void helloTest() throws Exception{
		mockMvc.perform(get("/hello"))
			.andDo(print())
			.andExpect(status().isOk());
		
	}
	
	
	@Test
	public void getEvents() throws Exception{
		mockMvc.perform(get("/events"))
		.andExpect(status().isOk());
	}
	
	@Test
	public void getEventsWithId() throws Exception{
		mockMvc.perform(get("/events/1")).andExpect(status().isOk());
		mockMvc.perform(get("/events/2")).andExpect(status().isOk());
		mockMvc.perform(get("/events/3")).andExpect(status().isOk());
	}
	
	@Test
	public void createEvent() throws Exception{
		mockMvc.perform(post("/events").contentType(MediaType.APPLICATION_JSON_UTF8).accept(MediaType.APPLICATION_JSON))
		.andExpect(status().isOk());
	}
	 
}
