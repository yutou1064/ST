package com.demo.test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AddTest {

	@Test
	public void tests() {
		int i = 2;
		Assert.assertEquals(1,i);
		System.out.println("aaa");
	}
	
}
