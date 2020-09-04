package junit;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith({Parameterized.class, CalculatorRunner.class})
//@RunWith(CalculatorRunner.class)
//@SuiteClasses({CalculatorRunner.class, Parameterized.class})
//@RunWith(Suite.class)

public class Third extends Assert {

	private int x;
	private int y;
	private double result;

	public Third(int x, int y, double result) {
		this.x = x;
		this.y = y;
		this.result = result;
	}

	@Parameterized.Parameters(name = "{0} / {1} = {2}")
	public static Iterable<Object[]> elements() {
		
		return Arrays.asList(new Object[][] { { -15, -3, 5 }, { 0, 2, 0 }, { 40, 10, 4 } });
	}

	@Test
	public void checkEqualsDivide() {

		assertEquals(result, Calculator.getDivide(x, y), 0.1);
		
//		assertEquals(5, Calculator.getDivide(50, 10), 0.1);

	}

}
