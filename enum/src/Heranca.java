import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Heranca {

	public static void main(String[] args) {

		Account acc = new Account(1001, "Alex", 0.0);
		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.00, 500.00);
		
		// UPCASTING
		
		Account acc1 = bacc;
		Account acc2 = new BusinessAccount(10023, "Bob", 0.00, 100.00);
		Account acc3 = new SavingsAccount(1004, "Anna", 0.00, 0.01);
		
		// DOWNCASTING
		
		BusinessAccount acc4 = (BusinessAccount) acc2;
	}

}
