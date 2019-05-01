package designpatterns.creational.prototype;

import java.awt.Color;

interface ImageLoader extends Prototype<ImageLoader> {
	
	public void printIdentity();

	public void writeAsGIF();

	public void writeAsBMP();

	public void writeAsPNG();

	public void writeAsJPG();

	public void alterImage(Color color, int x, int y, int inwards);

	public void setFileLoc(String fileLoc);

	public void setOutputLoc(String outputLoc);

}
