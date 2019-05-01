package designpatterns.creational.prototype.dtopassing;

interface SaleOrderConfigurer {

	public Validator getValidator();

	public AddressOperator getAddressOperator();

	public PaymentOperator getPaymentOperator();

}
