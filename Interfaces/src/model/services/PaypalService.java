package model.services;

public class PaypalService implements PaymentService {

	@Override
	public double calculateInstallmentAmount(int installmentNumber, double installmentAmount) {
		return (installmentAmount * (1 + 0.01 * installmentNumber)) * 1.02;
	}
	
	
}
