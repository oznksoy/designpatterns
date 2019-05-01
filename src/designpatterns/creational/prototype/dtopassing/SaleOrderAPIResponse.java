package designpatterns.creational.prototype.dtopassing;

public class SaleOrderAPIResponse {

	private SaleOrderAPIRequest shallowCopyForValidation;
	private SaleOrderAPIRequest shallowCopyForAddress;
	private SaleOrderAPIRequest shallowCopyForPayment;

	private SaleOrderAPIRequest deepCopyForValidation;
	private SaleOrderAPIRequest deepCopyForAddress;
	private SaleOrderAPIRequest deepCopyForPayment;

	public SaleOrderAPIRequest getShallowCopyForValidation() {
		return shallowCopyForValidation;
	}

	public void setShallowCopyForValidation(SaleOrderAPIRequest shallowCopyForValidation) {
		this.shallowCopyForValidation = shallowCopyForValidation;
	}

	public SaleOrderAPIRequest getShallowCopyForAddress() {
		return shallowCopyForAddress;
	}

	public void setShallowCopyForAddress(SaleOrderAPIRequest shallowCopyForAddress) {
		this.shallowCopyForAddress = shallowCopyForAddress;
	}

	public SaleOrderAPIRequest getShallowCopyForPayment() {
		return shallowCopyForPayment;
	}

	public void setShallowCopyForPayment(SaleOrderAPIRequest shallowCopyForPayment) {
		this.shallowCopyForPayment = shallowCopyForPayment;
	}

	public SaleOrderAPIRequest getDeepCopyForValidation() {
		return deepCopyForValidation;
	}

	public void setDeepCopyForValidation(SaleOrderAPIRequest deepCopyForValidation) {
		this.deepCopyForValidation = deepCopyForValidation;
	}

	public SaleOrderAPIRequest getDeepCopyForAddress() {
		return deepCopyForAddress;
	}

	public void setDeepCopyForAddress(SaleOrderAPIRequest deepCopyForAddress) {
		this.deepCopyForAddress = deepCopyForAddress;
	}

	public SaleOrderAPIRequest getDeepCopyForPayment() {
		return deepCopyForPayment;
	}

	public void setDeepCopyForPayment(SaleOrderAPIRequest deepCopyForPayment) {
		this.deepCopyForPayment = deepCopyForPayment;
	}

}
