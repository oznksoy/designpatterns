package designpatterns.creational.factory.abstractfactory.simple.carfactory;

class CarFactoryImpl implements ICarFactory {

	@Override
	public Car getCar(CarType carType) {
		switch (carType) {
		case A:
			return new CarA();
		case B:
			return new CarB();
		case C:
			return new CarC();
		default:
			return null;
		}
	}

}// End of Class
