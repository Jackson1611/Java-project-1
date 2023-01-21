import java.math.BigDecimal;
import java.util.Scanner; // program uses class Scanner

public class ComputeAverage {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double total = 0;
		int counter = 0;

		System.out.print("Enter first number: ");
		double fNumber = input.nextDouble();

		while (fNumber != 0) {
			total = total + fNumber;
			counter = counter + 1; 
			System.out.print("Enter next number: ");
			fNumber = input.nextDouble();

		}
		if (counter != 0) {
			
			double average =  total / counter;	
			System.out.printf("The average is %.3f%n",average);
		} else 
			System.out.println("Nothing to be calculated");
	}
}