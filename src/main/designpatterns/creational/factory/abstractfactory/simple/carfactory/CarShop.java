package designpatterns.creational.factory.abstractfactory.simple.carfactory;

class CarShop implements ICarShop {

	ICarFactory carFactory;

	public CarShop(ICarFactory carFactory) {
		this.carFactory = carFactory;
	}

	@Override
	public Car buyACar(CarType carType) {
		CarFactoryImpl carFactory = new CarFactoryImpl();
		return carFactory.getCar(carType);
	}

}// End of Class
