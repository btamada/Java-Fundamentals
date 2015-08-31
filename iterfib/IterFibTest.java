package iterfib;

import static org.junit.Assert.*;

import org.junit.Test;

public class IterFibTest {

	@Test
	public void testMain() {
		iterFib iterfib = new iterFib();
		assertEquals(3, iterfib.iterFib(3));
		assertEquals(5, iterfib.iterFib(4));
		assertEquals(8, iterfib.iterFib(5));
		assertEquals(13, iterfib.iterFib(6));
		assertEquals(21, iterfib.iterFib(7));
		assertEquals(34, iterfib.iterFib(8));
		assertEquals(55, iterfib.iterFib(9));
		assertEquals(89, iterfib.iterFib(10));
	}

}
