package designpatterns.creational.factory.abstractfactory.customcarfactory;

import java.util.List;

import designpatterns.creational.factory.abstractfactory.customcarfactory.constants.CarModel;

public class HarkenCarShop extends CarShopImpl {

	public HarkenCarShop(CarFactory carFactory) {
		super(carFactory);
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<CarModel> queryAvailableModels() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Car buyANewCar(CarModel model) {
		// TODO Auto-generated method stub
		return null;
	}

}
