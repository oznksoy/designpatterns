package designpatterns.creational.factory.abstractfactory.customcarfactory.carfactory.torcar;

import java.util.List;

import designpatterns.creational.factory.abstractfactory.customcarfactory.carfactory.CoupeCarFactory;
import designpatterns.creational.factory.abstractfactory.customcarfactory.part.accesory.Accesory;
import designpatterns.creational.factory.abstractfactory.customcarfactory.part.carlight.CarLightSet;
import designpatterns.creational.factory.abstractfactory.customcarfactory.part.exterior.Bumper;
import designpatterns.creational.factory.abstractfactory.customcarfactory.part.exterior.Door;
import designpatterns.creational.factory.abstractfactory.customcarfactory.part.exterior.Hood;
import designpatterns.creational.factory.abstractfactory.customcarfactory.part.exterior.Trunk;
import designpatterns.creational.factory.abstractfactory.customcarfactory.part.singleitem.Exhaust;
import designpatterns.creational.factory.abstractfactory.customcarfactory.part.singleitem.WindShield;
import designpatterns.creational.factory.abstractfactory.customcarfactory.part.wheel.Rim;
import designpatterns.creational.factory.abstractfactory.customcarfactory.part.wheel.Tire;

public class TorkarCoupeCarFactory extends CoupeCarFactory {

	@Override
	public Door createDoor() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CarLightSet createCarLightSet() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Bumper createBumber() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Exhaust createExhaust() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Hood createHood() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Rim createRim() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Tire createTire() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Trunk createTrunk() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public WindShield createWindShield() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Accesory> createAccesorries() {
		// TODO Auto-generated method stub
		return null;
	}

}
