package designpatterns.creational.factory.abstractfactory.customcarfactory;

import designpatterns.creational.factory.abstractfactory.customcarfactory.constants.CarStyles;
import designpatterns.creational.factory.abstractfactory.customcarfactory.constants.CarTypes;

public interface CarShop {
	
	public Car buyANewCar(CarTypes type, CarStyles style);

}
