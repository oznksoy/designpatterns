package designpatterns.creational.prototype.imageloader;

import java.util.HashMap;
import java.util.Map;

class ImageCache {

	private static ImageCache instance;

	private Map<AvailableImages, ImageLoader> map;

	private ImageCache() {
		map = new HashMap<ImageCache.AvailableImages, ImageLoader>();
		map.put(AvailableImages.CITY, new ImageLoaderImp("resources/prototype/inputs/city.jpg"));
		map.put(AvailableImages.FOREST, new ImageLoaderImp("resources/prototype/inputs/forest.jpg"));
		map.put(AvailableImages.WINTER, new ImageLoaderImp("resources/prototype/inputs/winter.jpg"));
		map.put(AvailableImages.YELLOWSTONE, new ImageLoaderImp("resources/prototype/inputs/yellowstone.jpg"));
	}

	public static ImageCache getInstance() {
		if (instance != null) {
			return instance;
		}
		instance = new ImageCache();
		return instance;
	}

	public enum AvailableImages {
		WINTER, //
		CITY, //
		FOREST, //
		YELLOWSTONE;//
	}

	public ImageLoader getSource(AvailableImages image) {
		return map.get(image);
	}// End of Method

	public ImageLoader getClone(AvailableImages image) {
		return map.get(image).clone();
	}// End of Method

}
