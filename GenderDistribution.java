import java.util.Scanner;
import java.text.DecimalFormat;
public class GenderDistribution {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat oneDecimal = new DecimalFormat("0.0");
		System.out.print("Enter the number of female students: ");
		double female = input.nextDouble();

		System.out.print("Enter the number of male students: ");
		double male = input.nextDouble();

		double total = male + female;

		double femalePercentage = Math.round((female / total) * 100);
		System.out.println("Female: " + oneDecimal.format(femalePercentage) + "%");
		double malePercentage = Math.round((male / total) * 100);
		System.out.println("Male: " + oneDecimal.format(malePercentage) + "%");
		
	}
	
	private static double readDouble(Scanner input) {
		 return Double.parseDouble(input.nextLine().replace(',', '.'));
}}
