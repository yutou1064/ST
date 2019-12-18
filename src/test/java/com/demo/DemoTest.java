package com.demo;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PowerMockIgnore;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(PowerMockRunner.class)
@PrepareForTest
@PowerMockIgnore({"javax.management.*"})
public class DemoTest {

	@Test
	public void doTest() {
		int i = 1;
		Assert.assertEquals(1, i);
		System.out.println("do test");
	}
	
}
