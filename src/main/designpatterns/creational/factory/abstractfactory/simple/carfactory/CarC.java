package designpatterns.creational.factory.abstractfactory.simple.carfactory;

class CarC extends Car {

	private String identity = "CarTypeC" + "@" + Integer.toHexString(this.hashCode());

	public CarC() {
		this.speed = 0; // km
		this.topSpeed = 300; // km
		this.height = 1.55; // m
		this.weight = 2156.2; // kg
	}

	@Override
	public String identify() {
		return this.identity;
	}

}
