package designpatterns.creational.prototype.imageloader;

import java.awt.Color;

import designpatterns.creational.prototype.imageloader.ImageCache.AvailableImages;

/**
 * Test Cases for Prototype Design Pattern with a collaboration with
 * Factory/Selector design.
 * 
 * @author Ozan Aksoy
 *
 */
public class TestPrototypeImageCache {

	public static void main(String[] args) {
		TestPrototypeImageCache testPrototypeImageCache = new TestPrototypeImageCache();
		testPrototypeImageCache.testAll();
	}

	public void testAll() {
		testCaseCity();
		testCaseForest();
		testCaseWinter();
		testCaseYellowstone();
	}// End of Test Suite

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

	private void testCase(AvailableImages selectedImage) {

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
