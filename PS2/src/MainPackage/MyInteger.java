package MainPackage;

public class MyInteger {

	// Data field to store int value
	private int value;

	// Constructor
	public MyInteger(int value) {
		this.value = value;
	}

	//Get Method
	public int get() {
		return this.value;
	}

	// Methods
	public boolean isEven() {
		return (this.value % 2 == 0);
	}

	public boolean isOdd() {
		return (this.value % 2 != 0);
	}

	public boolean isPrime() {
		return (primeCalc(this.value));
	}

	
	//Static methods with int
	public static boolean isEven(int value) {
		return (value % 2 == 0);
	}

	public static boolean isOdd(int value) {
		return (value % 2 != 0);
	}

	public static boolean isPrime(int value) {
		return (primeCalc(value));
	}

	
	//Static methods with MyInteger
	public static boolean isEven(MyInteger value) {
		return (value.get() % 2 == 0);
	}

	public static boolean isOdd(MyInteger value) {
		return (value.get() % 2 != 0);
	}

	public static boolean isPrime(MyInteger value) {
		return (primeCalc(value.get()));
	}

	
	//Method using int to see if the value is equal 
	public boolean equalsInt(int value) {
		return (this.value == value);
	}

	
	//Method using MyInteger to see if the value is equal
	public boolean equals(MyInteger value) {
		return (this.value == value.get());
	}

	//Static method to convert array of numbers to ints
	public static int parseInt(char[] values) {
		return Integer.parseInt(new String(values));
	}
	
	//Static method to convert a string to int
	public static int parseInt(String values){
		return Integer.parseInt(new String(values));
	}

	/*
	 * Method used to see if a number is prime
	 * Used to avoid redundancies
	 */

	private static boolean primeCalc(int value) {
		if (value % 2 == 0)
			return false;
		else {
			for (int i = 2; i < (value); i++){
				if (value % i == 0) {
					break;
				}
				return false;
			}
			return true;

		}		
	}
}
