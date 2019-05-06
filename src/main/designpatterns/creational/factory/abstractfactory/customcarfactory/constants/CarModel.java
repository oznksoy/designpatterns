package designpatterns.creational.factory.abstractfactory.customcarfactory.constants;

public final class CarModel {

	private CarTypes type;
	private CarStyles style;
	private CarBrands brand;

	public CarTypes getType() {
		return type;
	}

	public void setType(CarTypes type) {
		this.type = type;
	}

	public CarStyles getStyle() {
		return style;
	}

	public void setStyle(CarStyles style) {
		this.style = style;
	}

	public CarBrands getBrand() {
		return brand;
	}

	public void setBrand(CarBrands brand) {
		this.brand = brand;
	}

}// End of Class
