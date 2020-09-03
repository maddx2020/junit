package junit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

// опытный класс - в конце работы переделать как надо


public class First extends Assert {
	
	private Calculator calc;
	
	
	@Before
	public void init() {
		
		calc = new Calculator();
		System.out.println("before");
	}
	
	
	@Test
	public void testEqualsPlus() {

		
		assertEquals(4, calc.getPlus(2, 2));
		
		assertEquals(20, calc.getPlus(10, 10));
		
		assertEquals(502, calc.getPlus(500, 2));
		
		System.out.println("tests passed");
		
	}

}
