/**
 * Name:		Maximilian Kossek
 * ASUID:		1211229276
 * Assignment:	3
 * <p>
 * Defines the AddingMachine class and method for computing 
 * arithmetic operations: add, subtract.
 * </p>
 */

package cse360assign3;

/**
 * AddingMachine is a class that keeps track of a total and
 * manipulates the total by <code>add</code> and 
 * <code>subtract</code> methods.
 * @author      Maximilian Kossek
 * @version     1.3
 * @since       1.0
 */
public class AddingMachine {
	
	protected int total;
	protected String history;
	
	/**
	 * Constructor method to initialize the total to 0.
	 * @since 1.0
	 */
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
		history = "0";
	}
	
	/**
	 * Returns the total of an object of the AddingMachine class.
	 * @return <code>int total</code>.
	 * @since 1.0
	 */
	public int getTotal () {
		return total;
	}
	
	/**
	 * Addition method adds the parameter to the total.
	 * @param value, the integer to add
	 * @since 1.0
	 */
	public void add (int value) {
		total = total + value;
		history = history + " + " + value;
	}
	
	/**
	 * Subtraction method, subtracts the parameter from the total.
	 * @param value, the integer to subtract
	 * @since 1.0
	 */
	public void subtract (int value) {
		total = total - value;
		history = history + " - " + value;
	}
	
	/**
	 * Returns the toString of an object of the AddingMachine class.
	 * The toString includes all the transaction history of the total.
	 * @return <code>String</code>.
	 * @since 1.0
	 */
	public String toString () {
		return history;
	}

	/**
	 * Clears the transaction history and resets the total to 0.
	 * @since 1.0
	 */
	public void clear() {
		total = 0;
		history = "0";
	}
}