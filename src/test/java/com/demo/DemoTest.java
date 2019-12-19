package com.demo;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PowerMockIgnore;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(PowerMockRunner.class)
@PrepareForTest(IdGenerator.class)
@PowerMockIgnore({"javax.management.*"})
public class DemoTest {
	
	@Test
	public void doTest() {
		//int i = 1/0;
		int i = 1;
		Assert.assertEquals(1, i);
		PowerMockito.mockStatic(IdGenerator.class);
		PowerMockito.when(IdGenerator.generateNewId()).thenReturn(15L);//每次调用都会返回15L
		Assert.assertEquals(15L, new ClassUnderTest().methodToTest());
		Assert.assertEquals(15L, new ClassUnderTest().methodToTest());
		long l = IdGenerator.generateNewId();
		System.out.println(l);
	}
	
	@Test
	public void addTest2() {
		Assert.assertEquals(1, 1);
		System.out.println("bbb");
	}
	
	@Test
	public void addTest3() {
		Assert.assertEquals(1, 1);
		System.out.println("ccc");
	}
	
	@Test
	public void addTest4() {
		Assert.assertEquals(1, 1);
		System.out.println("ddd");
	}
	
}
