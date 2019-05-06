package designpatterns.creational.factory.abstractfactory.customcarfactory;

public abstract class CarShopImpl implements CarShop {

	CarFactory carFactory;

	public CarShopImpl(CarFactory carFactory) {
	}

}
