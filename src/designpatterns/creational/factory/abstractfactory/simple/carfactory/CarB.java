package designpatterns.creational.factory.abstractfactory.simple.carfactory;

class CarB extends Car {

	private String identity = "CarTypeB" + "@" + Integer.toHexString(this.hashCode());

	public CarB() {
		this.speed = 0; // km
		this.topSpeed = 270; // km
		this.height = 1.6; // m
		this.weight = 2118.3; // kg

	}

	@Override
	public String identify() {
		return this.identity;
	}

}
