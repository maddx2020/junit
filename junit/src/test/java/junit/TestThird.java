package junit;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)

public class TestThird extends Assert {

	private int x;
	private int y;
	private double result;

	public TestThird(int x, int y, double result) {
		this.x = x;
		this.y = y;
		this.result = result;
	}

	@Parameterized.Parameters(name = "{0} / {1} = {2}")
	public static Iterable<Object[]> elements() {

		return Arrays.asList(new Object[][] { { -15, -3, 5 }, { 0, 2, 0 }, { 40, 10, 4 } });
	}

	@Test
	public void testcheckEqualsDivide() {

		assertEquals(result, new Calculator().getDivide(x, y), 0.1);

	}

}
