package junit;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)

public class TestFirst extends Assert {

	private int x;
	private int y;
	private int result;

	public TestFirst(int x, int y, int result) {
		this.x = x;
		this.y = y;
		this.result = result;
	}

	@Parameterized.Parameters(name = "{0} + {1} = {2}")
	public static Iterable<Object[]> elements() {
		return Arrays.asList(new Object[][] { { -5, 3, -2 }, { 0, 15, 15 }, { 11, 8, 19 } });
	}


	@Test
	public void testEqualsPlus() {

		assertEquals(result, new Calculator().getPlus(x, y));

	}

}
