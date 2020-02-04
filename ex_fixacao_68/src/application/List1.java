package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee1;

public class List1 {

public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("How many employees will be registered? ");
		Integer quantityOfEmployees = sc.nextInt();
		sc.nextLine();
		
		// Entrada de Dados
		
		List <Employee1> employee = new ArrayList<Employee1>();
		
		for (int i = 0; i < quantityOfEmployees; i++) {
			System.out.printf("Employee #%d %n", i+1);
			System.out.printf("Id: ");
			Integer id = sc.nextInt();
			sc.nextLine();
			System.out.printf("Name: ");
			String name = sc.nextLine();
			System.out.printf("Salary: ");
			Double salary = sc.nextDouble();
			employee.add(new Employee1(id, name, salary));
		}
		
		// Lógica de Aumento
		
		System.out.print("Enter the employee id that will have salary increase: ");
		Integer employeeIdIncrease = sc.nextInt();
		sc.nextLine();
		
		Employee1 employeeIncrease = employee.stream().filter(x -> x.getId() == employeeIdIncrease).findFirst().orElse(null);
		
		if (employeeIncrease == null) {
			System.out.printf("This id does not exist! %n");
		} else {
			System.out.print("Enter the percentage: ");
			Double percentage = sc.nextDouble();
			employeeIncrease.increaseSalary(percentage);
		}
		
		// Finalização
		
		System.out.printf("List of Employees: %n");
		
		for (Employee1 obj : employee) {
			System.out.printf("%s %n", obj.toString());
		}
		
		sc.close();

	}

}
