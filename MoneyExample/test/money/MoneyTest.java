package money;

import static org.junit.Assert.*;

import org.junit.Test;

public class MoneyTest {
	@Test
	public void testMultiplication() {
		Dollar five = new Dollar(10);				// 10
		five.times(5);								// *5
		assertEquals(50, five.amount);				// 50  (Should be 50)
		five.times(10);								// *10
		assertEquals(500, five.amount);				// 500	(Should be 500)
	}
}
