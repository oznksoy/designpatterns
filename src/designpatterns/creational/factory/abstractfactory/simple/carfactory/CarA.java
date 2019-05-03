package designpatterns.creational.factory.abstractfactory.simple.carfactory;

class CarA extends Car {

	private String identity = "CarTypeA" + "@" + Integer.toHexString(this.hashCode());

	public CarA() {
		this.speed = 0; // km
		this.topSpeed = 250; // km
		this.height = 1.5; // m
		this.weight = 2210.7; // kg

	}

	@Override
	public String identify() {
		return this.identity;
	}

}
