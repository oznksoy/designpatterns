package designpatterns.creational.factory.abstractfactory.simple.carfactory;

abstract class Car implements ICar {

	protected double speed;
	protected double topSpeed;
	protected double weight;
	protected double height;

	public abstract String identify();

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		if (speed > topSpeed) {
			this.speed = topSpeed;
		} else {
			this.speed = speed;
		}
	}

	public double getTopSpeed() {
		return topSpeed;
	}

	public double getWeight() {
		return weight;
	}

	public double getHeight() {
		return height;
	}

	public double accelerate(double acceleration) {
		speed += acceleration;
		if (speed > topSpeed) {
			speed = topSpeed;
		}
		return speed;
	}

}
