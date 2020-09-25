package junit;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class TestSecond extends Assert {

	private int x;
	private int y;
	private int result;

	public TestSecond(int x, int y, int result) {
		this.x = x;
		this.y = y;
		this.result = result;
	}

	@Parameterized.Parameters(name = " {0} * {1} = {2}")
	public static Iterable<Object[]> elements() {
		return Arrays.asList(new Object[][] { { -3, 2, -6 }, { 0, 34, 0 }, { 3, 7, 21 } });

	}

	@Test
	public void testCheckMultiple() {
		assertEquals(result, Calculator.getMultiple(x, y));

	}

}
