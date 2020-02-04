package entities;

public class Employee1 {

	public Integer id;
	public String name;
	public Double salary;
	
	public Employee1(Integer id, String name, Double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return "Employee1 [id=" + id + ", name=" + name + ", salary=" + String.format("%.2f", salary) + "]";
	}

	public void increaseSalary(Double percentage) {
		salary *= 1 + percentage / 100;
	}
	
}
