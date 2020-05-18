import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Employee;


public class Exercicio222 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee> employees = new ArrayList<>();
		
		//File input = new File("/Users/renato.matos/dev/Java/pedidos.txt");
		System.out.println("Enter full file path: ");
		String fileName = sc.next();
		File input = new File(fileName);
		System.out.println("Enter salary: ");
		Double salary = sc.nextDouble();
		
		try (BufferedReader br = new BufferedReader(new FileReader(input))) {
			
			String line = br.readLine();
			
			while (line!=null) {
				//System.out.println(line);
				String[] register = line.split(",");
				employees.add(new Employee(register[0], register[1], Double.valueOf(register[2])));
				line = br.readLine();
			}
			
			
			List<String> emails = employees.stream()
					.filter(x -> x.getSalary() > salary)
					.map(x -> x.getEmail())
					.sorted()
					.collect(Collectors.toList());
			
			System.out.println("Email of people whose salary is more than " + String.format("%.2f", salary) + ": ");
			emails.forEach(System.out::println);
			
			double sum = employees.stream()
					.filter(x -> x.getName().charAt(0) == 'M')
					.map(x -> x.getSalary())
					.reduce(0.0, (x,y) -> x + y);
			
			System.out.println("Sum of salary of people whose name starts with 'M': " + String.format("%.2f",sum));
					
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
