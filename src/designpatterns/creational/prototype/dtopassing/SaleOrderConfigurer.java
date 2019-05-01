package designpatterns.creational.prototype.dtopassing;

public class SaleOrderConfigurer implements ISaleOrderConfigurer {

	private Validator validator;
	private AddressOperator addressOperator;
	private PaymentOperator paymentOperator;

	private SaleOrderConfigurer() {
	};

	public SaleOrderConfigurer(Validator validator, AddressOperator addressOperator, PaymentOperator paymentOperator) {
		this.validator = validator;
		this.addressOperator = addressOperator;
		this.paymentOperator = paymentOperator;
	}

	@Override
	public Validator getValidator() {
		return this.validator;
	}

	@Override
	public AddressOperator getAddressOperator() {
		return this.addressOperator;
	}

	@Override
	public PaymentOperator getPaymentOperator() {
		return this.paymentOperator;
	}

}
