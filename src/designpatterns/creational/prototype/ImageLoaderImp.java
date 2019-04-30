package designpatterns.creational.prototype;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ImageLoaderImp implements ImageLoader {

	private String fileLoc;
	private String outputLoc;
	private BufferedImage bufferedImage;

	@SuppressWarnings("unused")
	private ImageLoaderImp() {

	}

	public ImageLoaderImp(String fileLoc) {
		this.fileLoc = fileLoc;
		loadImageFileToBuffer();
		generateOutputPath();
	}// Initializer

	public ImageLoaderImp(ImageLoaderImp original) {

		this.fileLoc = original.fileLoc;
		this.bufferedImage = new BufferedImage(//
				original.bufferedImage.getColorModel(), //
				original.bufferedImage.copyData(null), //
				original.bufferedImage.getColorModel().isAlphaPremultiplied(), //
				null);
		this.outputLoc = original.outputLoc.substring(0, original.outputLoc.lastIndexOf("@")) + "@"
				+ Integer.toHexString(this.bufferedImage.hashCode());

	}// End of Clone Constructor

	private void generateOutputPath() {

		if (!fileLoc.isBlank() && fileLoc.length() > 3) {
			int index = fileLoc.lastIndexOf("/");
			String end = fileLoc.substring(index, fileLoc.length());
			end = end.substring(0, end.lastIndexOf("."));
			outputLoc = fileLoc.substring(0, fileLoc.lastIndexOf("/inputs"))
					+ "/outputs".concat(end.concat("@" + Integer.toHexString(bufferedImage.hashCode())));
		}

	}// End of Method

	private void loadImageFileToBuffer() {
		try {
			File file = new File(fileLoc);
			bufferedImage = ImageIO.read(file);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}// End of Method

	public String getFileLoc() {
		return fileLoc;
	}

	@Override
	public void setFileLoc(String fileLoc) {
		this.fileLoc = fileLoc;
	}

	public String getOutputLoc() {
		return outputLoc;
	}

	@Override
	public void setOutputLoc(String outputLoc) {
		this.outputLoc = outputLoc;
	}

	public void alterImage(Color color, int x, int y, int inwards) {
		Graphics2D g = (Graphics2D) bufferedImage.getGraphics();
		g.setStroke(new BasicStroke(3));
		g.setColor(color);
		g.drawRect(x, y, bufferedImage.getWidth() - inwards, bufferedImage.getHeight() - inwards);
	}

	@Override
	public void writeAsGIF() {
		try {
			ImageIO.write(bufferedImage, "gif", new File(outputLoc.concat(".gif")));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}// End of Method

	@Override
	public void writeAsBMP() {
		try {
			ImageIO.write(bufferedImage, "bmp", new File(outputLoc.concat(".bmp")));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}// End of Method

	@Override
	public void writeAsPNG() {
		try {
			ImageIO.write(bufferedImage, "png", new File(outputLoc.concat(".png")));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}// End of Method

	@Override
	public void writeAsJPG() {
		try {
			ImageIO.write(bufferedImage, "jpg", new File(outputLoc.concat(".jpg")));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}// End of Method

	@Override
	public void printIdentity() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("This : " + Integer.toHexString(this.hashCode()) + "\n");
		stringBuilder.append("fileloc : " + Integer.toHexString(this.fileLoc.hashCode()) + " : " + this.fileLoc + "\n");
		stringBuilder.append("bufferred image : " + Integer.toHexString(this.bufferedImage.hashCode()) + "\n");
		stringBuilder.append(
				"outputloc : " + Integer.toHexString(this.outputLoc.hashCode()) + " : " + this.outputLoc + "\n");
		System.out.println(stringBuilder.toString());
	}

	@Override
	public ImageLoader clone() {

		return new ImageLoaderImp(this);// clone via copy constructor

	}// End of Method

}// End of Class
