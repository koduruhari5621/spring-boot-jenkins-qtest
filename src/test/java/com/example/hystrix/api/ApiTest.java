package com.example.hystrix.api;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.util.ReflectionTestUtils;

@RunWith(SpringRunner.class)
public class ApiTest {

	@InjectMocks
	ApiImpl apiImpl;

	@Test
	public void apiTest() {
		String propValue = apiImpl.returnpropValue();
		ReflectionTestUtils.setField(apiImpl, "testValue", "hystrix-dashboard");
		assertNotNull(propValue);
		assertEquals("hystrix-dashboard", propValue);

	}

}
