/**
 * Name:		Maximilian Kossek
 * ASUID:		1211229276
 * Assignment:	1
 * <p>
 * Test cases for <code>AddingMachine</code>.
 * </p>
 */

package cse360assign3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AddingMachineTest {
	
	/**
	 * Checks if the empty string is a palindrome.
	 */
	@Test
	public void testNull() {
		AddingMachine empty = new AddingMachine();
		assertEquals(0, empty.getTotal());
		System.out.println(empty.toString());
	}
	
	/**
	 * Checks division by zero.
	 */
	@Test
	public void divisionZero() {
		Calculator test = new Calculator();
		test.add(2);
		test.div(0);
		assertEquals(0, test.getTotal());
		System.out.println(test.toString());
	}
	
	/**
	 * Checks power by zero.
	 */
	@Test
	public void power() {
		Calculator test = new Calculator();
		test.add(5);
		test.power(2);
		test.subtract(10);
		assertEquals(15, test.getTotal());
		System.out.println(test.toString());
		test.clear();
		test.power(0);
		assertEquals(1, test.getTotal());
		test.power(-1);
		assertEquals(0, test.getTotal());
		System.out.println(test.toString());
	}
	
	/**
	 * Checks multiplication by zero.
	 */
	@Test
	public void multiplication() {
		Calculator test = new Calculator();
		test.mult(5);
		test.add(2);
		test.mult(10);
		assertEquals(20, test.getTotal());
		test.mult(-1);
		assertEquals(-20, test.getTotal());
		System.out.println(test.toString());
		test.clear();
	}

}
