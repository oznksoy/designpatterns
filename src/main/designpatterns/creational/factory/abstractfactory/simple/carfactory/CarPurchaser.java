package designpatterns.creational.factory.abstractfactory.simple.carfactory;

class CarPurchaser {

	ICarShop carShop;

	public CarPurchaser(ICarShop carShop) {

		this.carShop = carShop;

	}

	public ICar purchaseCarTypeA() {

		ICar carTypeA = carShop.buyACar(CarType.A);
		return carTypeA;

	}// End of Method

	public ICar purchaseCarTypeB() {

		ICar carTypeB = carShop.buyACar(CarType.B);
		return carTypeB;

	}// End of Method

	public ICar purchaseCarTypeC() {

		ICar carTypeC = carShop.buyACar(CarType.C);
		return carTypeC;

	}// End of Method

}// End of Class
