import java.text.DecimalFormat;
import java.util.Scanner;

public class AccurateArithmetic {
	public static void main(String args[]) {

		DecimalFormat twoDecimals = new DecimalFormat("0.00");

		Scanner input = new Scanner(System.in);

		double firstNumber;
		double secondNumber;

		
		System.out.print("Enter first number: ");
		firstNumber = Double.parseDouble(input.nextLine().replace(',', '.'));

		System.out.print("Enter second number: ");
		secondNumber = Double.parseDouble(input.nextLine().replace(',', '.'));

		
		double total = firstNumber + secondNumber;

		
		System.out.println(firstNumber + " + " + secondNumber + " = " + twoDecimals.format(total));

	}

}