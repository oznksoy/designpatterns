package designpatterns.creational.prototype.dtopassing;

/**
 * <p>
 * Designed to satisfy request-response pair nature of fake API showcase. Not
 * realistic on implementation, but it is used in carrying altered versions of
 * cloned request DTOs
 * </p>
 * 
 * @author Ozan Aksoy
 *
 */
class SaleOrderAPIResponse {

	private SaleOrderAPIRequest copyForValidation;
	private SaleOrderAPIRequest copyForAddress;
	private SaleOrderAPIRequest copyForPayment;

	public SaleOrderAPIRequest getCopyForValidation() {
		return copyForValidation;
	}

	public void setCopyForValidation(SaleOrderAPIRequest copyForValidation) {
		this.copyForValidation = copyForValidation;
	}

	public SaleOrderAPIRequest getCopyForAddress() {
		return copyForAddress;
	}

	public void setCopyForAddress(SaleOrderAPIRequest copyForAddress) {
		this.copyForAddress = copyForAddress;
	}

	public SaleOrderAPIRequest getCopyForPayment() {
		return copyForPayment;
	}

	public void setCopyForPayment(SaleOrderAPIRequest copyForPayment) {
		this.copyForPayment = copyForPayment;
	}

}
