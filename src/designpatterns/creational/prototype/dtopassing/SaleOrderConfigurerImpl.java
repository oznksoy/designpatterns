package designpatterns.creational.prototype.dtopassing;

/**
 * <p>
 * {@link SaleOrderConfigurer Configuration} Implementation
 * </p>
 * 
 * @author Ozan Aksoy
 *
 */
class SaleOrderConfigurerImpl implements SaleOrderConfigurer {

	private Validator validator;
	private AddressOperator addressOperator;
	private PaymentOperator paymentOperator;

	@SuppressWarnings("unused")
	private SaleOrderConfigurerImpl() {
	}

	public SaleOrderConfigurerImpl(Validator validator, AddressOperator addressOperator,
			PaymentOperator paymentOperator) {
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
