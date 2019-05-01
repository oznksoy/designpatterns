package designpatterns.creational.prototype.dtopassing;

/**
 * <p>
 * Interface for manipulation of processing of mock requests on SaleOrder Demo
 * API
 * </p>
 * 
 * @author Ozan Aksoy
 *
 */
interface SaleOrderConfigurer {

	public Validator getValidator();

	public AddressOperator getAddressOperator();

	public PaymentOperator getPaymentOperator();

}// End of Interface
