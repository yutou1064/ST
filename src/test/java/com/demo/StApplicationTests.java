package com.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@SpringBootTest
public class StApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Test
	@RequestMapping("/test")
	public String test() {
		return "test ok!";
	}
	
}
