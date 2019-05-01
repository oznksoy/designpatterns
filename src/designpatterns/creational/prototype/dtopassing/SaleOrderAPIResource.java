package designpatterns.creational.prototype.dtopassing;

class SaleOrderAPIResource implements SaleOrderAPI {

	private Validator validator;
	private AddressOperator addressOperator;
	private PaymentOperator paymentOperator;

	public SaleOrderAPIResource(SaleOrderConfigurer configurer) {
		validator = configurer.getValidator();
		addressOperator = configurer.getAddressOperator();
		paymentOperator = configurer.getPaymentOperator();
	}

	@Override
	public SaleOrderAPIResponse placeSaleOrderWithShallowCopy(SaleOrderAPIRequest apiRequest)
			throws CloneNotSupportedException {

		SaleOrderAPIResponse response = null;

		SaleOrderAPIRequest shallowCopyForValidation;
		shallowCopyForValidation = apiRequest.clone();
		SaleOrderAPIRequest shallowCopyForAddress = apiRequest.clone();
		SaleOrderAPIRequest shallowCopyForPayment = apiRequest.clone();

		validator.consumeRequest(shallowCopyForValidation);
		addressOperator.consumeRequest(shallowCopyForAddress);
		paymentOperator.consumeRequest(shallowCopyForPayment);

		response = new SaleOrderAPIResponse();
		response.setCopyForValidation(shallowCopyForValidation);
		response.setCopyForAddress(shallowCopyForAddress);
		response.setCopyForPayment(shallowCopyForPayment);

		return response;

	}

	@Override
	public SaleOrderAPIResponse placeSaleOrderWithDeepCopy(SaleOrderAPIRequest apiRequest) throws Exception {

		SaleOrderAPIResponse response = null;

		SaleOrderAPIRequest deepCopyForValidation = apiRequest.cloneAsDeepCopy();
		SaleOrderAPIRequest deepCopyForAddress = apiRequest.cloneAsDeepCopy();
		SaleOrderAPIRequest deepCopyForPayment = apiRequest.cloneAsDeepCopy();

		validator.consumeRequest(deepCopyForValidation);
		addressOperator.consumeRequest(deepCopyForAddress);
		paymentOperator.consumeRequest(deepCopyForPayment);

		response = new SaleOrderAPIResponse();
		response.setCopyForValidation(deepCopyForValidation);
		response.setCopyForAddress(deepCopyForAddress);
		response.setCopyForPayment(deepCopyForPayment);

		return response;

	}

}
