
import java.text.DecimalFormat;
import java.util.Scanner;

public class GuitarStrings {
	public static void main(String args[]) {

		DecimalFormat twoDecimals = new DecimalFormat("0.00");

		Scanner input = new Scanner(System.in);

		int gigs;
		double setOfGigs;
		double setStrings;

		System.out.println("Number of gigs: ");
		gigs = input.nextInt();

		System.out.println("Gigs to be played with the same set of strings: ");
		setOfGigs = input.nextDouble();

		System.out.println("Price of a set of guitar strings: ");
		setStrings = input.nextDouble();

		double intValue = (gigs / setOfGigs);

		int news = (int) Math.ceil(intValue);

		double totalCost = news * setStrings;

		System.out.println("The guitarist needs " + news + " new sets of guitar strings");
		System.out.println("The total cost is " + twoDecimals.format(totalCost) + " euros");

	}

}