import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Contract;
import model.entities.Installment;
import model.services.ContractService;
import model.services.PaypalService;

public class Exercicio189 {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Enter contract data");
		System.out.print("Number: ");
		int contract = sc.nextInt();
		sc.nextLine();
		System.out.print("Date (dd/MM/yyyy): ");
		Date date = sdf.parse(sc.nextLine());
		System.out.print("Contract value: ");
		double value = sc.nextDouble();		
		
		Contract c = new Contract(contract, date, value);
		
		System.out.print("Enter number of installments: ");
		int installments = sc.nextInt();
		
		ContractService cs = new ContractService(value, installments, new PaypalService());
		
		cs.processInstallments(c);
		
		System.out.println("Installments:");
		
		for (Installment i : c.getInstallments()) {
			System.out.println(sdf.format(i.getDueDate()) + " - " + String.format("%.2f", i.getAmount()));
		}
		
		sc.close();
	}

}
