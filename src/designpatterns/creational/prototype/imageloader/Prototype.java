package designpatterns.creational.prototype.imageloader;

/**
 * A simple interface of Prototype Design Pattern on a non-serializable
 * situation. Hence, it does not extend to serializable or clonable for this
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
