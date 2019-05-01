package designpatterns.creational.prototype.dtopassing;

public class SaleOrderAPIResource implements SaleOrderAPI {

	private Validator validator;
	private AddressOperator addressOperator;
	private PaymentOperator paymentOperator;

	public SaleOrderAPIResource(ISaleOrderConfigurer configurer) {
		validator = configurer.getValidator();
		addressOperator = configurer.getAddressOperator();
		paymentOperator = configurer.getPaymentOperator();
	}

	@Override
	public SaleOrderAPIResponse placeSaleOrderWithShallowCopy(SaleOrderAPIRequest apiRequest) {

		try {

			SaleOrderAPIRequest shallowCopyForValidation = apiRequest.clone();
			SaleOrderAPIRequest shallowCopyForAddress = apiRequest.clone();
			SaleOrderAPIRequest shallowCopyForPayment = apiRequest.clone();

			validator.consumeRequest(shallowCopyForValidation);
			addressOperator.consumeRequest(shallowCopyForAddress);
			paymentOperator.consumeRequest(shallowCopyForPayment);

		} catch (Exception e) {
			e.printStackTrace();
		}

		SaleOrderAPIResponse response = null;

		return response;
	}

	@Override
	public SaleOrderAPIResponse placeSaleOrderWithDeepCopy(SaleOrderAPIRequest apiRequest) {

		try {

			SaleOrderAPIRequest deepCopyForValidation = apiRequest.cloneAsDeepCopy();
			SaleOrderAPIRequest deepCopyForAddress = apiRequest.cloneAsDeepCopy();
			SaleOrderAPIRequest deepCopyForPayment = apiRequest.cloneAsDeepCopy();

			validator.consumeRequest(deepCopyForValidation);
			addressOperator.consumeRequest(deepCopyForAddress);
			paymentOperator.consumeRequest(deepCopyForPayment);

		} catch (Exception e) {
			e.printStackTrace();
		}

		SaleOrderAPIResponse response = null;

		return response;
	}

}
