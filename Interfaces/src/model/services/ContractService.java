package model.services;

import java.util.Calendar;
import java.util.Date;

import model.entities.Contract;
import model.entities.Installment;

public class ContractService {

	private Double contractValue;
	private Integer installments;
	
	private PaymentService paymentService;

	public ContractService(Double contractValue, Integer installments, PaymentService paymentService) {
		this.contractValue = contractValue;
		this.installments = installments;
		this.paymentService = paymentService;
	}
	
	public void processInstallments(Contract contract) {
		Calendar c = Calendar.getInstance();
		
		for (int i = 1; i <= this.installments; i ++) {
			c.setTime(contract.getDate());
			c.add(Calendar.MONTH, i);
			contract.addInstallment(new Installment(c.getTime(), paymentService.calculateInstallmentAmount(i, this.contractValue / this.installments)));
		}
		
	}
	
}
