package designpatterns.creational.factory.abstractfactory.simple.carfactory;

interface ICar {

	public String identify();

	public double getWeight();

	public double getHeight();

	public double getSpeed();

	public void setSpeed(double speed);

	public double getTopSpeed();

	public double accelerate(double acceleration);

}
