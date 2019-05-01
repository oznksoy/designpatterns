package designpatterns.creational.prototype.dtopassing;

/**
 * <p>
 * Mock DTO object for Prototype Example
 * </p>
 * 
 * @author Ozan Aksoy
 *
 */
class InvoiceAddressDTO extends AddressDTO {

	private boolean isCorporation;

	public boolean isCorporation() {
		return isCorporation;
	}

	public void setCorporation(boolean isCorporation) {
		this.isCorporation = isCorporation;
	}

}// End of Class
