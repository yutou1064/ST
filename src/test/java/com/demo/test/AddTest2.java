package com.demo.test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PowerMockIgnore;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;


@RunWith(PowerMockRunner.class)
@PrepareForTest
@PowerMockIgnore({"javax.management.*"})
public class AddTest2 {

	@Test
	public void addTest1() {
		Assert.assertEquals(1, 1);
		System.out.println("ccc");
	}
	
}
