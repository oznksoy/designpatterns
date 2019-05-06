package designpatterns.creational.prototype.imageloader;

import java.io.Serializable;

/**
 * A simple interface of Prototype Design Pattern on a non-serializable
 * situation. Hence, it does not extend to {@link Serializable} or {@link Cloneable} for this
 * condition. However it is assumed that the implementing classes will correctly
 * implement cloning behavior as it is required for the given condition.
 * 
 * @author Ozan Aksoy
 *
 * @param <T>
 */
interface Prototype<T> {

	T clone();

}
