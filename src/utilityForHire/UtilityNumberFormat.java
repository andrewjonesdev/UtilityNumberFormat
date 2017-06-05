package utilityForHire;

import java.text.NumberFormat;
import java.util.Random;

public abstract class UtilityNumberFormat {

	public UtilityNumberFormat() {
		// TODO Auto-generated constructor stub
	}
	public static String toCurrency(double price){
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		return currency.format(price); //returns $11.58
	}
	public static double toDecimal(double decimal, int place){
		NumberFormat number = NumberFormat.getNumberInstance();
		number.setMaximumFractionDigits(place);
		String decimalString = number.format(decimal);
		return Double.parseDouble(decimalString);
	}
	public static String toPercent(double percentInput){
		NumberFormat percent = NumberFormat.getPercentInstance();
		return percent.format(percentInput); //returns 50%
	}
	public static int randomOf(int one, int two){
		Random random = new Random();
		return random.nextInt(two+1-one)+one;
	}
	public static int maxOf(int one, int two){
		return Math.max(one, two);
	}
	public static int minOf(int one, int two){
		return Math.min(one, two);
	}
	
}
