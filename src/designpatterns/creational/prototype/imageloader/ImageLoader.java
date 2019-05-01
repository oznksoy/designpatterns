package designpatterns.creational.prototype.imageloader;

import java.awt.Color;

/**
 * Image Loader scheme with Prototype design. It is expected that implementation
 * of image loader will concretely implement a correct cloning behavior for the
 * required scenario.
 * 
 * @author Ozan Aksoy
 *
 */
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
