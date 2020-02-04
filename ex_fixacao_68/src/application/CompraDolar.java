package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class CompraDolar {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the dollar price? ");
		double price = sc.nextDouble();
		System.out.print("How many dolllars will be bought? ");
		double quantity = sc.nextDouble();
		
		System.out.printf("Amount to be paid in reais = %.2f %n", CurrencyConverter.amountToBePaid(price, quantity));
		
		sc.close();

	}

}
