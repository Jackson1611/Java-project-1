import java.text.DecimalFormat;
import java.util.Scanner;

public class RenovationExpenses {
	public static void main(String args[]) {

		DecimalFormat twoDecimals = new DecimalFormat("0.00");

		Scanner input = new Scanner(System.in);

		int numberOfPeople;
		int totalArea;
		double paintCoverage;
		double price;
		

		System.out.print("Total area to be painted (square meters): ");
		totalArea = input.nextInt();

		System.out.print("Paint coverage (square meters): ");
		paintCoverage = input.nextDouble();

		System.out.print("Paint price per liter (euros): ");
		price = input.nextDouble();
		
		System.out.print("Number of people: ");
		numberOfPeople = input.nextInt();

		
		double numberOfCan = totalArea/paintCoverage;
		numberOfCan =  Math.ceil(numberOfCan);
		double totalCost = numberOfCan*price;
		double shouldPay = totalCost/numberOfPeople;

		System.out.println("Each of the " + numberOfPeople + " people should pay " + twoDecimals.format(shouldPay) +" euros");
		

	}

}