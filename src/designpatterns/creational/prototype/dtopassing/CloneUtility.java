package designpatterns.creational.prototype.dtopassing;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class CloneUtility {

	/**
	 * <p>
	 * Copy by Value Object must be serializable and must have a Unique ID key
	 * </p>
	 * 
	 * @author Ozan Aksoy
	 * 
	 * @param serializable object
	 * @return deep copy of the serializable object
	 * @throws Exception
	 */
	@SuppressWarnings("unchecked")
	public static <T extends Serializable> T deepCopy(T object) throws Exception {
		ObjectOutputStream oos = null;
		ObjectInputStream ois = null;
		T deepCopy;
		try {
			ByteArrayOutputStream bos = new ByteArrayOutputStream();
			oos = new ObjectOutputStream(bos);
			oos.writeObject(object);
			oos.flush();
			ByteArrayInputStream bin = new ByteArrayInputStream(bos.toByteArray());
			ois = new ObjectInputStream(bin);
			deepCopy = (T) ois.readObject();
			return deepCopy;
		} catch (Exception e) {
			throw (e);
		} finally {
			oos.close();
			ois.close();
		}
	}

}// End of Utility Class
