package designpatterns.creational.factory.abstractfactory.customcarfactory;

import designpatterns.creational.factory.abstractfactory.customcarfactory.constants.CarStyles;
import designpatterns.creational.factory.abstractfactory.customcarfactory.constants.CarTypes;

public class CarShopImpl implements CarShop {

	private CarFactory carFactory;

	public CarShopImpl(CarFactory carFactory) {
		this.carFactory = carFactory;
	}

	@Override
	public Car buyANewCar(CarTypes type, CarStyles style) {
		return null;
	}

}
