package designpatterns.creational.factory.abstractfactory.customcarfactory;

import java.util.List;

import designpatterns.creational.factory.abstractfactory.customcarfactory.part.Exhaust;
import designpatterns.creational.factory.abstractfactory.customcarfactory.part.WindShield;
import designpatterns.creational.factory.abstractfactory.customcarfactory.part.accesory.Accesory;
import designpatterns.creational.factory.abstractfactory.customcarfactory.part.carlight.CarLightSet;
import designpatterns.creational.factory.abstractfactory.customcarfactory.part.exterior.Bumper;
import designpatterns.creational.factory.abstractfactory.customcarfactory.part.exterior.Door;
import designpatterns.creational.factory.abstractfactory.customcarfactory.part.exterior.Hood;
import designpatterns.creational.factory.abstractfactory.customcarfactory.part.exterior.SideMirror;
import designpatterns.creational.factory.abstractfactory.customcarfactory.part.exterior.Trunk;
import designpatterns.creational.factory.abstractfactory.customcarfactory.part.wheel.Rim;
import designpatterns.creational.factory.abstractfactory.customcarfactory.part.wheel.Tire;

public interface Car {

	public CarLightSet getCarLights();
	
	public SideMirror getSideMirror();

	public Door getDoor();

	public Bumper getBumber();

	public Hood getHood();
	
	public Trunk getTrunk();

	public Rim getRim();

	public Tire getTire();
	
	public Exhaust getExhaust();

	public WindShield getWindShield();

	public List<Accesory> getAccessories();

}
