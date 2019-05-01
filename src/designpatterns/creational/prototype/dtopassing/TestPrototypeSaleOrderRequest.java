package designpatterns.creational.prototype.dtopassing;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class TestPrototypeSaleOrderRequest {

	public static void main(String[] args) {
		testCaseBadmintonSetKayaOrhan();
	}// End of Main

	private static void testCaseBadmintonSetKayaOrhan() {

		SaleOrderAPIRequest orderRequest = new SaleOrderAPIRequest();

		orderRequest.setInstallment(6);
		orderRequest.setOrderId(UUID.randomUUID().toString());

		List<ItemDTO> items = new ArrayList<ItemDTO>();
		// item 1
		ItemDTO item1 = new ItemDTO();
		item1.setItemCode(UUID.randomUUID().toString());
		item1.setItemDescription("Badminton Gym Bag");
		item1.setItemPrice(190.5);
		item1.setItemQuantity(1);
		items.add(item1);
		// item 2
		ItemDTO item2 = new ItemDTO();
		item2.setItemCode(UUID.randomUUID().toString());
		item2.setItemDescription("Badminton Ball");
		item2.setItemPrice(12.0);
		item2.setItemQuantity(6);
		items.add(item2);
		// item 3
		ItemDTO item3 = new ItemDTO();
		item3.setItemCode(UUID.randomUUID().toString());
		item3.setItemDescription("Badminton Racket");
		item3.setItemPrice(55.0);
		item3.setItemQuantity(2);
		items.add(item3);
		orderRequest.setItems(items);

		PurchaserDTO purchaser = new PurchaserDTO();
		purchaser.setName("Kaya");
		purchaser.setSurname("Orhan");
		purchaser.setBirthDate("29-04-1980");
		purchaser.setEmail("kayaorhan@pseudoemail.com");
		purchaser.setGsmNumber("+90-535-553-08936");
		orderRequest.setPurchaser(purchaser);

		InvoiceAddressDTO invoiceAddress = new InvoiceAddressDTO();
		invoiceAddress.setAddress("Sehremini Eminonu No:1");
		invoiceAddress.setPostalcode("34104");
		invoiceAddress.setCity("Istanbul");
		invoiceAddress.setCountry("Turkey");
		invoiceAddress.setCorporation(false);
		invoiceAddress.setFullname(purchaser.getName().trim() + " " + purchaser.getSurname().trim());
		invoiceAddress.setPhoneNumber(purchaser.getGsmNumber());
		orderRequest.setInvoiceAddress(invoiceAddress);

		ShippingAddressDTO shippingAddress = new ShippingAddressDTO();
		shippingAddress.setAddress(invoiceAddress.getAddress());
		shippingAddress.setPostalcode(invoiceAddress.getPostalcode());
		shippingAddress.setCity(invoiceAddress.getCity());
		shippingAddress.setCountry(invoiceAddress.getCountry());
		shippingAddress.setFullname(invoiceAddress.getFullname());
		shippingAddress.setPhoneNumber(invoiceAddress.getPhoneNumber());
		orderRequest.setShippingAddress(shippingAddress);

		SaleOrderAPI saleAPI = new SaleOrderAPIResource();
		saleAPI.placeSaleOrder(orderRequest);

	}// End of Method

}// End of Class
