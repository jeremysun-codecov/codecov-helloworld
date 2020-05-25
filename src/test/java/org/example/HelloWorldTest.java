package org.example;

import static org.junit.Assert.*;

import org.junit.Test;

public class HelloWorldTest {

	@Test
	public void testOK() {

	}

	@Test
	public void test_Fizz() {
		HelloWorld hw = new HelloWorld();
		assertEquals("Fizz", hw.fizzBuzz(9));
	}

}