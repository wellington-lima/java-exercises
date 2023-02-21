package exercise05;

import java.util.Locale;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the dollar price? ");
		double dollarPrice = sc.nextDouble();
		
		System.out.print("How many dollars will be bought? ");
		double dollarQuantity = sc.nextDouble();
		
		double ammount = CurrencyConverter.calculate(dollarPrice, dollarQuantity);
		
		System.out.println();
		System.out.printf("Ammount to be paid in reais = %.2f", ammount);
		
		sc.close();

	}

}
