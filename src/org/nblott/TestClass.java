package org.nblott;

import org.junit.BeforeClass;
import org.junit.Test;

public class TestClass {

	@BeforeClass
	public void anotherTest() {
		System.out.println("Ran the other tests in test class TestClass");
	}
	
}
