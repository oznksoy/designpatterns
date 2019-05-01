package designpatterns.creational.prototype.dtopassing;

class InvoiceAddressDTO extends AddressDTO {

	private boolean isCorporation;

	public boolean isCorporation() {
		return isCorporation;
	}

	public void setCorporation(boolean isCorporation) {
		this.isCorporation = isCorporation;
	}

}// End of Class
