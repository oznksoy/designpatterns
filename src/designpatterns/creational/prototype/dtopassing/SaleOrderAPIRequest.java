package designpatterns.creational.prototype.dtopassing;

import java.util.List;

public class SaleOrderAPIRequest {

	private String orderId;
	private Integer installment;
	private List<ItemDTO> items;
	private PurchaserDTO purchaser;
	private InvoiceAddressDTO invoiceAddress;
	private ShippingAddressDTO shippingAddress;

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public Integer getInstallment() {
		return installment;
	}

	public void setInstallment(Integer installment) {
		this.installment = installment;
	}

	public List<ItemDTO> getItems() {
		return items;
	}

	public void setItems(List<ItemDTO> items) {
		this.items = items;
	}

	public PurchaserDTO getPurchaser() {
		return purchaser;
	}

	public void setPurchaser(PurchaserDTO purchaser) {
		this.purchaser = purchaser;
	}

	public InvoiceAddressDTO getInvoiceAddress() {
		return invoiceAddress;
	}

	public void setInvoiceAddress(InvoiceAddressDTO invoiceAddress) {
		this.invoiceAddress = invoiceAddress;
	}

	public ShippingAddressDTO getShippingAddress() {
		return shippingAddress;
	}

	public void setShippingAddress(ShippingAddressDTO shippingAddress) {
		this.shippingAddress = shippingAddress;
	}

}
