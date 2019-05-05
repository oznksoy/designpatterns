package designpatterns.creational.factory.abstractfactory.customcarfactory;

import designpatterns.creational.factory.abstractfactory.customcarfactory.constants.CarStyles;
import designpatterns.creational.factory.abstractfactory.customcarfactory.part.Exhaust;
import designpatterns.creational.factory.abstractfactory.customcarfactory.part.WindShield;
import designpatterns.creational.factory.abstractfactory.customcarfactory.part.accesory.SideSkirt;
import designpatterns.creational.factory.abstractfactory.customcarfactory.part.accesory.Spoiler;
import designpatterns.creational.factory.abstractfactory.customcarfactory.part.carlight.CarLightSet;
import designpatterns.creational.factory.abstractfactory.customcarfactory.part.exterior.Bumper;
import designpatterns.creational.factory.abstractfactory.customcarfactory.part.exterior.Door;
import designpatterns.creational.factory.abstractfactory.customcarfactory.part.exterior.Hood;
import designpatterns.creational.factory.abstractfactory.customcarfactory.part.exterior.Trunk;
import designpatterns.creational.factory.abstractfactory.customcarfactory.part.wheel.Rim;
import designpatterns.creational.factory.abstractfactory.customcarfactory.part.wheel.Tire;

public interface CarFactory {

	public Door createDoor(CarStyles style);

	public CarLightSet createCarLightSet(CarStyles style);

	public Bumper createBumber();

	public Exhaust createExhaust();

	public Hood createHood();

	public Rim createRim();

	public Tire createTire();

	public Trunk createTrunk();

	public WindShield createWindShield();

}// End of Interface