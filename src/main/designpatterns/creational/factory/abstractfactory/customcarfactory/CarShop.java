package designpatterns.creational.factory.abstractfactory.customcarfactory;

import java.util.List;

import designpatterns.creational.factory.abstractfactory.customcarfactory.constants.CarModel;

public interface CarShop {

	public List<CarModel> queryAvailableModels();

	public Car buyANewCar(CarModel model);

}
