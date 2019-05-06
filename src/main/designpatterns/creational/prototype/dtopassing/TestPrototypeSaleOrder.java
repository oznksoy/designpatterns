package designpatterns.creational.prototype.dtopassing;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * <p>
 * Class includes a test cases to showcase how different types of cloning types
 * for Prototype Design Pattern can change the usage of the pattern.
 * </p>
 * 
 * @author Ozan Aksoy
 *
 */
public class TestPrototypeSaleOrder {

	public static void main(String[] args) {

		TestPrototypeSaleOrder testPrototypeSaleOrder = new TestPrototypeSaleOrder();
		testPrototypeSaleOrder.testAll();

	}// End of Method

	public void testAll() {

		testCaseBadmintonSet();

	}// End of Method

	private void testCaseBadmintonSet() {

		SaleOrderConfigurer configurer = generateConfigurerForBadminton();
		SaleOrderAPI saleAPI = new SaleOrderAPIResource(configurer);

		try {
			SaleOrderAPIRequest requestToShallowCopy = createRequestBadmintonSet();
			SaleOrderAPIResponse responseShallow;
			responseShallow = saleAPI.placeSaleOrderWithShallowCopy(requestToShallowCopy);
			System.out.println("Shallow copy results:");
			printForTestCaseBadmintonSet(requestToShallowCopy, responseShallow);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

		try {
			System.out.println("Deep copy results:");
			SaleOrderAPIRequest requestToDeepCopy = createRequestBadmintonSet();
			SaleOrderAPIResponse responseDeep;
			responseDeep = saleAPI.placeSaleOrderWithDeepCopy(requestToDeepCopy);
			printForTestCaseBadmintonSet(requestToDeepCopy, responseDeep);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}// End of Method

	private void printForTestCaseBadmintonSet(SaleOrderAPIRequest request, SaleOrderAPIResponse response) {

		StringBuilder strBuilder = new StringBuilder();
		strBuilder.append("Initial Input By Reference :" + "\n");
		strBuilder.append("Installment : " + request.getInstallment());
		strBuilder.append("\n");
		strBuilder.append("City : " + request.getInvoiceAddress().getCity());
		strBuilder.append("\n");
		strBuilder.append("PostalCode : " + request.getInvoiceAddress().getPostalcode());
		strBuilder.append("\n");
		strBuilder.append("Item1.Code : " + request.getItems().get(0).getItemCode());
		strBuilder.append("\n");
		strBuilder.append("Item1.Description : " + request.getItems().get(0).getItemDescription());
		strBuilder.append("\n");
		strBuilder.append("\n");

		strBuilder.append("Validation Process Clone :" + "\n");
		strBuilder.append("Installment : " + response.getCopyForValidation().getInstallment());
		strBuilder.append("\n");
		strBuilder.append("City : " + response.getCopyForValidation().getInvoiceAddress().getCity());
		strBuilder.append("\n");
		strBuilder.append("PostalCode : " + response.getCopyForValidation().getInvoiceAddress().getPostalcode());
		strBuilder.append("\n");
		strBuilder.append("Item1.Code : " + response.getCopyForValidation().getItems().get(0).getItemCode());
		strBuilder.append("\n");
		strBuilder.append(
				"Item1.Description : " + response.getCopyForValidation().getItems().get(0).getItemDescription());
		strBuilder.append("\n");
		strBuilder.append("\n");

		strBuilder.append("Address Feed Clone :" + "\n");
		strBuilder.append("Installment : " + response.getCopyForAddress().getInstallment());
		strBuilder.append("\n");
		strBuilder.append("City : " + response.getCopyForAddress().getInvoiceAddress().getCity());
		strBuilder.append("\n");
		strBuilder.append("PostalCode : " + response.getCopyForAddress().getInvoiceAddress().getPostalcode());
		strBuilder.append("\n");
		strBuilder.append("Item1.Code : " + response.getCopyForAddress().getItems().get(0).getItemCode());
		strBuilder.append("\n");
		strBuilder.append("Item1.Description : " + response.getCopyForAddress().getItems().get(0).getItemDescription());
		strBuilder.append("\n");
		strBuilder.append("\n");

		strBuilder.append("Payment Process Clone :" + "\n");
		strBuilder.append("Installment : " + response.getCopyForPayment().getInstallment());
		strBuilder.append("\n");
		strBuilder.append("City : " + response.getCopyForPayment().getInvoiceAddress().getCity());
		strBuilder.append("\n");
		strBuilder.append("PostalCode : " + response.getCopyForPayment().getInvoiceAddress().getPostalcode());
		strBuilder.append("\n");
		strBuilder.append("Item1.Code : " + response.getCopyForPayment().getItems().get(0).getItemCode());
		strBuilder.append("\n");
		strBuilder.append("Item1.Description : " + response.getCopyForPayment().getItems().get(0).getItemDescription());
		strBuilder.append("\n");
		strBuilder.append("\n");

		System.out.print(strBuilder.toString());

	}// End of Method

	private SaleOrderConfigurer generateConfigurerForBadminton() {
		Validator validator = new Validator() {

			@Override
			public void consumeRequest(SaleOrderAPIRequest apiRequest) {
				apiRequest.setInstallment(10);
			}

		};

		AddressOperator addressOperator = new AddressOperator() {

			@Override
			public void consumeRequest(SaleOrderAPIRequest apiRequest) {
				apiRequest.getInvoiceAddress().setCity("Ankara");
				apiRequest.getInvoiceAddress().setPostalcode("06586");
			}

		};

		PaymentOperator paymentOperator = new PaymentOperator() {

			@Override
			public void consumeRequest(SaleOrderAPIRequest apiRequest) {
				apiRequest.getItems().get(0).setItemCode("1111111");
				apiRequest.getItems().get(0).setItemDescription("Football");
			}

		};

		return new SaleOrderConfigurerImpl(validator, addressOperator, paymentOperator);

	}// End of Method

	private SaleOrderAPIRequest createRequestBadmintonSet() {

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

		return orderRequest;

	}// End of Method

}// End of Class
