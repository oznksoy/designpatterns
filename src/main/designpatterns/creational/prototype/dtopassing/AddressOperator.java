package designpatterns.creational.prototype.dtopassing;

/**
 * <p>
 * Mock Address Operator interface to stub the Mock API request
 * </p>
 * 
 * @author Ozan Aksoy
 *
 */
interface AddressOperator {

	/**
	 * <p>
	 * Fake function entry to generate mock alterations on fake
	 * {@link SaleOrderAPIRequest Api Request}
	 * </p>
	 * 
	 * @param apiRequest
	 */
	public void consumeRequest(SaleOrderAPIRequest apiRequest);

}// End of Interface
