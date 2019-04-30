package designpatterns.creational.singleton;

import java.io.IOException;

public interface ISingletonCalculator {

	public void getIdentity();

	public int add(int a, int b);

	public int multiply(int a, int b);

	public int subtract(int a, int b);

	public int divide(int a, int b) throws IOException;

}// End of Interface
