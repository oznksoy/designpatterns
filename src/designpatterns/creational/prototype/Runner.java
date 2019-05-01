package designpatterns.creational.prototype;

import designpatterns.creational.prototype.imageloader.TestPrototypeImageCache;

class Runner {

	public static void main(String[] args) {
		TestPrototypeImageCache testImageCachePrototype = new TestPrototypeImageCache();
		testImageCachePrototype.testAll();
	}// End of Main

}// End of Class
