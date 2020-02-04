package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Banking {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Enter account number: ");
		int accountNumber = sc.nextInt();
		System.out.printf("Enter account holder: ");
		sc.nextLine();
		String accountHolder = sc.nextLine();
		System.out.printf("Is there an initial deposit (y/n)? ");
		char initialDeposit = sc.next().charAt(0);		
		
		Account account;
		
		if (initialDeposit=='y') {
			System.out.print("Enter initial deposit value:  ");
			double initialDepositAmount = sc.nextDouble();
			account = new Account(accountNumber, accountHolder, initialDepositAmount);
		} else {
			account = new Account(accountNumber, accountHolder);
		}
		
		System.out.println();
		System.out.printf("%s %n%n", account.toString());
		
		System.out.print("Enter a deposit value: ");
		double depositAmount = sc.nextDouble();
		
		account.deposit(depositAmount);
		
		System.out.print("Update account data:");
		System.out.printf("%s %n%n", account.toString());
		
		System.out.print("Enter a withdraw value: ");
		double withdrawAmount = sc.nextDouble();
		
		account.withdraw(withdrawAmount);
		
		System.out.print("Update account data:");
		System.out.printf("%s %n%n", account.toString());
		
		
		sc.close();
		
	}

}
