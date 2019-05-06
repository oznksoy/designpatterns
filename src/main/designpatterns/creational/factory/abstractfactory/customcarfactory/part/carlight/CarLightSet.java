package designpatterns.creational.factory.abstractfactory.customcarfactory.part.carlight;

public interface CarLightSet {

	public StopLight getStopLight();

	public BackLight getBackLight();

	public FogLight getFogLight();

	public HeadLight getHeadLight();

	public Indicator getIndicator();

}
