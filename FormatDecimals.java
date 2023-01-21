import java.text.DecimalFormat;
import java.util.Scanner;

public class FormatDecimals {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat oneDecimal = new DecimalFormat("0.00");
		DecimalFormat twoDecimal = new DecimalFormat("0.0000");
		System.out.print("Enter a decimal number: ");
		 double insertNumber = input.nextDouble();
		
		System.out.println(oneDecimal.format(insertNumber));
		System.out.println(twoDecimal.format(insertNumber));
		
	}

	private static double readDouble(Scanner input) {
		 return Double.parseDouble(input.nextLine().replace(',', '.'));
	
}}