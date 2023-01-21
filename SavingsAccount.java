import java.text.DecimalFormat;
import java.util.Scanner;

public class SavingsAccount {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat twoDecimals = new DecimalFormat("0.00");

		System.out.println("Enter initial deposit: ");
		double deposit = Double.parseDouble(input.nextLine().replace(',', '.'));

		System.out.println("Enter number of years: ");
		int years = Integer.parseInt(input.nextLine());

		System.out.println("Enter interest rate: ");
		double interestRate = Double.parseDouble(input.nextLine().replace(',', '.'));

		System.out.println("Enter capital income tax rate: ");
		Double incomeTax = Double.parseDouble(input.nextLine().replace(',', '.'));

		for (int i = 1; i <= years; i++) {

			double brutProf = deposit * (interestRate / 100);
			double netProf = brutProf - (brutProf * (incomeTax / 100));
			deposit = deposit + netProf;
			System.out.println("Year " + i + ": " + twoDecimals.format(deposit));

		}
	}
}
