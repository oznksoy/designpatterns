package designpatterns.creational.singleton;

import java.io.IOException;

public class RunSingleton {

	public static void main(String[] args) {
		RunSingleton runner = new RunSingleton();
		int a = 40;
		int b = 5;
		runner.testAdd(a, b, a + b);
		runner.testMultiply(a, b, a * b);
		runner.testSubtract(a, b, a - b);
		runner.testDivide(a, b, a / b);
	}// End of Main

	private void assess(boolean condition) {
		if (condition) {
			System.out.println("Pass!");
		} else {
			System.out.println("Fail!");
		}
	}

	private void testAdd(int a, int b, int expected) {
		ISingletonCalculator calculator = SingletonCalculator.getInstance();
		calculator.getIdentity();
		assess(expected == calculator.add(a, b));
	}

	private void testMultiply(int a, int b, int expected) {
		ISingletonCalculator calculator = SingletonCalculator.getInstance();
		calculator.getIdentity();
		assess(expected == calculator.multiply(a, b));
	}

	private void testSubtract(int a, int b, int expected) {
		ISingletonCalculator calculator = SingletonCalculator.getInstance();
		calculator.getIdentity();
		assess(expected == calculator.subtract(a, b));
	}

	private void testDivide(int a, int b, int expected) {
		ISingletonCalculator calculator = SingletonCalculator.getInstance();
		calculator.getIdentity();
		try {
			assess(expected == calculator.divide(a, b));
		} catch (IOException e) {
			System.out.println("Failed with Error!");
			e.printStackTrace();
		}
	}

}// End of Class
