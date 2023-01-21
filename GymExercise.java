import java.text.DecimalFormat;
import java.util.Scanner;

public class GymExercise {
	public static void main(String args[]) {

		DecimalFormat twoDecimals = new DecimalFormat("0.00");

		Scanner input = new Scanner(System.in);

		int days;
		double priceOfDayPass;
		double yearMembership;

		System.out.print("Enter the number of days of gym visits per year: ");
		days = input.nextInt();

		System.out.print("Enter price for a day pass: ");
		priceOfDayPass = input.nextDouble();

		System.out.print("Enter yearly membership fee: ");
		yearMembership = input.nextDouble();

		double pricePayByDay = days * priceOfDayPass ;

		double difference1 =  pricePayByDay - yearMembership ;

		double difference2 = yearMembership - pricePayByDay;
if (pricePayByDay > yearMembership ) {
		System.out.println("Paying the yearly membership fee is " + twoDecimals.format(difference1) + " euros cheaper");
}else if (pricePayByDay < yearMembership ) {
	System.out.println("Buying day passes is " + twoDecimals.format(difference2) + " euros cheaper");

	}else {
		System.out.println("There is no price difference");
	}

}}