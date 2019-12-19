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
	public void tests1() {
		//int i = 2;
		int i = 1;
		Assert.assertEquals(1,i);
		System.out.println("eee");
	}
	
	@Test
	public void tests2() {
		//int i = 2;
		int i = 1;
		Assert.assertEquals(1,i);
		System.out.println("fff");
	}
	
	@Test
	public void tests3() {
		//int i = 2;
		int i = 1;
		Assert.assertEquals(1,i);
		System.out.println("ggg");
	}
	
	@Test
	public void tests4() {
		//int i = 2;
		int i = 1;
		Assert.assertEquals(1,i);
		System.out.println("hhh");
	}
	
}
