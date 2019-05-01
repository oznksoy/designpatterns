package designpatterns.creational.prototype.dtopassing;

public class SaleOrderAPIResource implements SaleOrderAPI {

	private Validator validator;
	private AddressOperator addressOperator;
	private PaymentOperator paymentOperator;

	public SaleOrderAPIResource() {
		validator = new ValidatorImpl();
		addressOperator = new AddressOperatorImpl();
		paymentOperator = new PaymentOperatorImpl();
	}

	@Override
	public SaleOrderAPIResponse placeSaleOrder(SaleOrderAPIRequest apiRequest) {
		try {
			SaleOrderAPIRequest requestCloneForValidation = apiRequest.clone();
			SaleOrderAPIRequest requestCloneForAddressFeed = apiRequest.clone();
			SaleOrderAPIRequest requestCloneForPaymentOperation = apiRequest.clone();

			validator.consumeRequest(requestCloneForValidation);
			addressOperator.consumeRequest(requestCloneForAddressFeed);
			paymentOperator.consumeRequest(requestCloneForPaymentOperation);

		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

		SaleOrderAPIResponse response = null;

		return response;
	}

}
