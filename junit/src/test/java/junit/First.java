package junit;

import org.junit.Test;

import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class First extends Assert {
	@Test
	public void testEquals() {

		assertEquals(4, 2+2);
		
	}

}
