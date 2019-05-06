package designpatterns.creational.factory.abstractfactory.customcarfactory;

import java.util.List;

import designpatterns.creational.factory.abstractfactory.customcarfactory.constants.CarStyles;
import designpatterns.creational.factory.abstractfactory.customcarfactory.part.accesory.Accesory;
import designpatterns.creational.factory.abstractfactory.customcarfactory.part.accesory.SideSkirt;
import designpatterns.creational.factory.abstractfactory.customcarfactory.part.accesory.Spoiler;
import designpatterns.creational.factory.abstractfactory.customcarfactory.part.carlight.CarLightSet;
import designpatterns.creational.factory.abstractfactory.customcarfactory.part.exterior.Bumper;
import designpatterns.creational.factory.abstractfactory.customcarfactory.part.exterior.Door;
import designpatterns.creational.factory.abstractfactory.customcarfactory.part.exterior.Hood;
import designpatterns.creational.factory.abstractfactory.customcarfactory.part.exterior.Trunk;
import designpatterns.creational.factory.abstractfactory.customcarfactory.part.singleitem.Exhaust;
import designpatterns.creational.factory.abstractfactory.customcarfactory.part.singleitem.WindShield;
import designpatterns.creational.factory.abstractfactory.customcarfactory.part.wheel.Rim;
import designpatterns.creational.factory.abstractfactory.customcarfactory.part.wheel.Tire;

public interface CarFactory {

	public Door createDoor();

	public CarLightSet createCarLightSet();

	public Bumper createBumber();

	public Exhaust createExhaust();

	public Hood createHood();

	public Rim createRim();

	public Tire createTire();

	public Trunk createTrunk();

	public WindShield createWindShield();

	public List<Accesory> createAccesorries();

}// End of Interface