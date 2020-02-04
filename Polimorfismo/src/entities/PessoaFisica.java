package entities;

public class PessoaFisica extends Pessoa {

	private double healthExpenses;
	
	public PessoaFisica() {
		super();
	}
	
	public PessoaFisica(String name, Double annualIncome, double healthExpenses) {
		super(name, annualIncome);
		this.healthExpenses = healthExpenses;
	}

	public double getHealthExpenses() {
		return healthExpenses;
	}

	public void setHealthExpenses(double healthExpenses) {
		this.healthExpenses = healthExpenses;
	}

	@Override
	public Double calculateTax() {
		
		Double discount = 0.0;
		
		if (healthExpenses > 0) {
			discount = healthExpenses / 2;
		}
		
		if (annualIncome < 20000) {
			return annualIncome * 0.15 - discount;
		} else {
			return annualIncome * 0.25 - discount;
		}
		
	}

	
}
