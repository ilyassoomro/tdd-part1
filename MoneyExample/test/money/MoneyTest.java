package money;

import static org.junit.Assert.*;

import org.junit.Test;

public class MoneyTest {
	@Test
	public void testMultiplication() {
		Dollar amount= new Dollar(5);
		Dollar product= amount.times(2);
		assertEquals(5, amount.amount);
		assertEquals(10, product.amount);
		product= amount.times(3);
		assertEquals(15, product.amount);
	}
	
	@Test
	public void testEquality() {
		assertTrue(new Dollar(10).equals(new Dollar(10)));
		assertFalse(new Dollar(10).equals(new Dollar(11)));
	}
}
