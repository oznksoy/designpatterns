package designpatterns.creational.prototype.dtopassing;

public interface SaleOrderAPI {

	public SaleOrderAPIResponse placeSaleOrderWithShallowCopy(SaleOrderAPIRequest apiRequest);

	SaleOrderAPIResponse placeSaleOrderWithDeepCopy(SaleOrderAPIRequest apiRequest);

}
