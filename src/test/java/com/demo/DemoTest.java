package com.demo;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoTest {

	@Test
	public void doTest() {
		int i = 1/0;
		Assert.assertEquals(1, i);
		System.out.println("do test");
	}
	
}
