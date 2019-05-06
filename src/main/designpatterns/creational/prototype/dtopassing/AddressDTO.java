package designpatterns.creational.prototype.dtopassing;

import java.io.Serializable;

/**
 * <p>
 * Mock address DTO class for Prototype Design Pattern Example
 * </p>
 * 
 * @author Ozan Aksoy
 *
 */
abstract class AddressDTO implements Serializable {

	private String fullname;
	private String address;
	private String postalcode;
	private String city;
	private String country;
	private String phoneNumber;

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPostalcode() {
		return postalcode;
	}

	public void setPostalcode(String postalcode) {
		this.postalcode = postalcode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}// End of Class
