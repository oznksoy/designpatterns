package designpatterns.creational.prototype;

import designpatterns.creational.prototype.dtopassing.TestPrototypeSaleOrder;
import designpatterns.creational.prototype.imageloader.TestPrototypeImageCache;

class TestRunner {

	public static void main(String[] args) {

		TestPrototypeImageCache testImageCachePrototype = new TestPrototypeImageCache();
		testImageCachePrototype.testAll();

		TestPrototypeSaleOrder testPrototypeSaleOrder = new TestPrototypeSaleOrder();
		testPrototypeSaleOrder.testAll();

	}// End of Main

}// End of Class
