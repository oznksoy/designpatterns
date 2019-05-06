package designpatterns.creational.prototype.dtopassing;

/**
 * <p>
 * Mock Validator interface to stub the Mock API request
 * </p>
 * 
 * @author Ozan Aksoy
 *
 */
interface Validator {

	public void consumeRequest(SaleOrderAPIRequest apiRequest);

}
