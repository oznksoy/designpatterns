package designpatterns.creational.prototype.dtopassing;

import java.io.Serializable;

/**
 * <p>
 * Mock DTO object of Prototype Example
 * </p>
 * 
 * @author Ozan Aksoy
 *
 */
class PurchaserDTO implements Serializable {

	private String name;
	private String surname;
	private String email;
	private String birthDate;
	private String gsmNumber;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public String getGsmNumber() {
		return gsmNumber;
	}

	public void setGsmNumber(String gsmNumber) {
		this.gsmNumber = gsmNumber;
	}

}// End of Class
