package designpatterns.creational.prototype.dtopassing;

/**
 * <p>
 * Sale Order API for mock operators to stub the Mock API requests. Core Entry
 * for mocked service. Notice that {@link SaleOrderAPIResponse API Response}
 * object is not realistic, but it is there to serve to underline the
 * alterations and differences between cloning types.
 * </p>
 * 
 * @author Ozan Aksoy
 *
 */
interface SaleOrderAPI {

	public SaleOrderAPIResponse placeSaleOrderWithShallowCopy(SaleOrderAPIRequest apiRequest)
			throws CloneNotSupportedException;

	public SaleOrderAPIResponse placeSaleOrderWithDeepCopy(SaleOrderAPIRequest apiRequest) throws Exception;

}// End of InterfaceF
