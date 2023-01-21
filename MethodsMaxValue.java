import java.util.Scanner;
import java.text.DecimalFormat;
public class MethodsMaxValue {
	public static void main(String[] args) {
		
		System.out.print("The largest value is " + maxValue());
}
	private static double maxValue() {
		Scanner input = new Scanner(System.in);
		DecimalFormat twoDecimals = new DecimalFormat("0.00");
		System.out.print("Enter first number: ");
		double num1 = Double.parseDouble(input.nextLine().replace(',', '.'));
		
		System.out.print("Enter second number: ");
		double num2 = Double.parseDouble(input.nextLine().replace(',', '.'));
		
		System.out.print("Enter third number: ");
		double num3 = Double.parseDouble(input.nextLine().replace(',', '.'));
		
		double max ;
		if (num1 >= num2 && num1 >= num3) {
		max = num1 ;	
		}
		else if (num2 >= num1 && num2 >= num3) {
		max = num2; }	
		else {
		max = num3;
	}
		return max;
		
	}}