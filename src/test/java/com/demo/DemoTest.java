package com.demo;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import javax.servlet.http.HttpServletRequest;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.powermock.core.classloader.annotations.PowerMockIgnore;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.springframework.http.ResponseEntity;

@RunWith(PowerMockRunner.class)
@PrepareForTest
@PowerMockIgnore({"javax.management.*"})
public class DemoTest {
	
	@Mock
	private HttpServletRequest request;
	
	@Test
	public void testGetMaoVersion() throws Exception {
		String s = "SUCCESSFUL";
		
		Assert.assertEquals("SUCCESS",s.substring(0,5));
		Assert.assertEquals("Request processed successfully.", s.substring(1));
	}
	
	
	@Test
	public void doTest() {
		int i = 1/0;
		Assert.assertEquals(1, i);
	}
	
}
