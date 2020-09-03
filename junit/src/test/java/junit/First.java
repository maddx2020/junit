package junit;

import org.junit.Assert;
import org.junit.Test;

public class First extends Assert {
	@Test
	public void testEqualsPlus() {

		assertEquals(5, Calculator.getPlus(2, 2));
		
	}

}
