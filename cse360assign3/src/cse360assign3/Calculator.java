/**
 * Name:		Maximilian Kossek
 * ASUID:		1211229276
 * Assignment:	3
 * <p>
 * Defines the Calculator class and methods for multiplication,  
 * division and exponentiation.
 * </p>
 */

package cse360assign3;

/**
 * Calculator class extends AddingMachine by adding methods for
 * multiplication, division and exponentiation. 
 * @author      Maximilian Kossek
 * @version     1.0
 * @since       1.3
 */
public class Calculator extends AddingMachine {

	/**
	 * mult method multiplies the parameter with the total.
	 * @param value, the integer to multiply
	 * @since 1.3
	 */
	public void mult (int value) {
		super.total = super.total * value;
		super.history = super.history + " * " + value;
	}
	
	/**
	 * div method divides the parameter from the total.
	 * @param value, the integer to divide by
	 * @since 1.3
	 */
	public void div (int value) {
		if (value == 0) {
			super.total = 0;
		}
		else {
			super.total = super.total / value;
		}
		super.history = super.history + " / " + value;
	}
	
	/**
	 * power method raises the total to the parameter.
	 * @param value, the integer to exponentiate by
	 * @since 1.3
	 */
	public void power (int value) {
		if (value < 0) {
			super.total = 0;
		}
		else {
			super.total = (int) Math.pow(super.total, value);
		}
		super.history = super.history + " ^ " + value;
	}
}
