package designpatterns.creational.prototype.dtopassing;

public interface SaleOrderAPI {

	public SaleOrderAPIResponse placeSaleOrderWithShallowCopy(SaleOrderAPIRequest apiRequest)
			throws CloneNotSupportedException;

	SaleOrderAPIResponse placeSaleOrderWithDeepCopy(SaleOrderAPIRequest apiRequest) throws Exception;

}
