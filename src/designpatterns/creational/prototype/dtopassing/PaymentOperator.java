package designpatterns.creational.prototype.dtopassing;

/**
 * <p>
 * Mock Payment Operator interface to stub the Mock API request
 * </p>
 * 
 * @author Ozan Aksoy
 *
 */
interface PaymentOperator {

	public void consumeRequest(SaleOrderAPIRequest apiRequest);

}// End of Interface
