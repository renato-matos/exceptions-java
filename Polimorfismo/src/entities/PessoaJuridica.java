package entities;

public class PessoaJuridica extends Pessoa {
	
	private Integer employees;
	
	public PessoaJuridica() {
		super();
	}

	public PessoaJuridica(String name, Double annualIncome, Integer employees) {
		super(name, annualIncome);
		this.employees = employees;
	}

	public Integer getEmployees() {
		return employees;
	}

	public void setEmployees(Integer employees) {
		this.employees = employees;
	}

	@Override
	public Double calculateTax() {
		if (employees > 10) {
			return annualIncome * 0.14;
		} else {
			return annualIncome * 0.16;
		}
	}

}
