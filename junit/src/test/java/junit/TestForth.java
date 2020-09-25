package junit;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(CalculatorRunner.class)
public class TestForth extends Assert{

	@Test
	public void testEqualsMinus() {

		assertEquals(5, new Calculator().getMinus(10, 5));
		
	}
}
