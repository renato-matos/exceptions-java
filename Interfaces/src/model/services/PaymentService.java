package model.services;

public interface PaymentService {

	double calculateInstallmentAmount(int installmentNumber, double installmentAmount);
	
}
