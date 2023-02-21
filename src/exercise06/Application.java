package exercise06;

import java.util.Locale;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter account number: ");
		String number = sc.next();
		
		sc.nextLine();
		
		System.out.print("Enter account holder: ");
		String holder = sc.nextLine();
		
		System.out.print("Is there an initial deposit (y/n)? ");
		char initialDeposit = sc.next().charAt(0);
		
		Account account;
				
		if (initialDeposit == 'y') {
			System.out.println("Enter a initial deposit value: ");
			double initialDepositValue = sc.nextDouble();
			account = new Account(number, holder, initialDepositValue);	
		} else {
			account = new Account(number, holder);
		}
		
		System.out.println("Account data:");
		System.out.println(account);
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		account.deposit(sc.nextDouble());
		
		System.out.println("Update account data:");
		System.out.println(account);
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		account.withdrawal(sc.nextDouble());
		
		System.out.println("Update account data:");
		System.out.println(account);
		
		sc.close();
	}
}
