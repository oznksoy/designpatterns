package designpatterns.creational.prototype.dtopassing;

public interface ISaleOrderConfigurer {

	public Validator getValidator();

	public AddressOperator getAddressOperator();

	public PaymentOperator getPaymentOperator();

}
