package junit;

import org.junit.Assert;
import org.junit.Test;

public class Second extends Assert {
	
	@Test
	public void testEqualsMultiple() {
		assertEquals(10, Calculator.getMultiple(2, 5));
	}

}
