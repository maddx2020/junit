package junit;

import org.junit.Assert;
import org.junit.Test;

public class Third extends Assert {

	@Test
	public void testEqualsDivide() {

		assertEquals(2, Calculator.getDivide(10, 5), 0.1);
	}

}
