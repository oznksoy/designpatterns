package designpatterns.creational.prototype.dtopassing;

import java.io.Serializable;

interface Prototype<T> extends Cloneable, Serializable {

	T cloneAsDeepCopy() throws Exception;

}// End of Interface
