package designpatterns.creational.singleton;

import java.io.IOException;

/**
 * 
 * @author Ozan Aksoy
 *
 */
public class SingletonCalculator implements ISingletonCalculator {

	private static SingletonCalculator instance;

	private SingletonCalculator() {

	}// End of Constructor

	public static SingletonCalculator getInstance() {
		if (instance != null) {
			return instance;
		}
		instance = new SingletonCalculator();
		return instance;
	}

	@Override
	public void getIdentity() {
		System.out.println("SingletonCalculator is initialized! : hash code = " + instance.hashCode());
	}

	@Override
	public int add(int a, int b) {
		return a + b;
	}

	@Override
	public int multiply(int a, int b) {
		return a * b;
	}

	@Override
	public int subtract(int a, int b) {
		return a - b;
	}

	@Override
	public int divide(int a, int b) throws IOException {
		if (b != 0) {
			return a / b;
		}
		String msg = a + " cannot be divided to 0";
		throw new IOException(msg);
	}

}// End of Class
