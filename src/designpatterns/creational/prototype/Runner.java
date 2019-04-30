package designpatterns.creational.prototype;

import java.awt.Color;

import designpatterns.creational.prototype.ImageCache.AvailableImages;

class Runner {

	public static void main(String[] args) {
		Runner runner = new Runner();
		runner.testCaseCity();
		runner.testCaseForest();
		runner.testCaseWinter();
		runner.testCaseYellowstone();
	}// End of Main

	public void testCaseCity() {
		testCase(AvailableImages.CITY);
	}// End of Test Case

	public void testCaseForest() {
		testCase(AvailableImages.FOREST);
	}// End of Test Case

	public void testCaseWinter() {
		testCase(AvailableImages.WINTER);
	}// End of Test Case

	public void testCaseYellowstone() {
		testCase(AvailableImages.YELLOWSTONE);
	}// End of Test Case

	public void testCase(AvailableImages selectedImage) {

		ImageLoader originalImage = ImageCache.getInstance().getSource(selectedImage);
		originalImage.printIdentity();

		ImageLoader cloneForJPG = ImageCache.getInstance().getClone(selectedImage);
		cloneForJPG.printIdentity();
		cloneForJPG.alterImage(Color.YELLOW, 10, 10, 20);

		originalImage.writeAsJPG();
		cloneForJPG.writeAsJPG();

		ImageLoader cloneForBMP = ImageCache.getInstance().getClone(selectedImage);
		cloneForBMP.printIdentity();
		cloneForBMP.alterImage(Color.BLUE, 10, 10, 20);

		originalImage.writeAsBMP();
		cloneForBMP.writeAsBMP();

		ImageLoader cloneForGIF = ImageCache.getInstance().getClone(selectedImage);
		cloneForGIF.printIdentity();
		cloneForGIF.alterImage(Color.GREEN, 10, 10, 20);

		originalImage.writeAsGIF();
		cloneForGIF.writeAsGIF();

		ImageLoader cloneForPNG = ImageCache.getInstance().getClone(selectedImage);
		cloneForPNG.printIdentity();
		cloneForPNG.alterImage(Color.RED, 10, 10, 20);

		originalImage.writeAsPNG();
		cloneForPNG.writeAsPNG();

	}// End of Test Case

}// End of Class
