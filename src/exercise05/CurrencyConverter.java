package exercise05;

public class CurrencyConverter {
	public static final double IOF = 0.06;

	public static double calculate(double dollarPrice, double dollarQuantity) {
		
		return (dollarQuantity * IOF + dollarQuantity) * dollarPrice;

	}

}
