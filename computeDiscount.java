import java.text.DecimalFormat;
import java.util.Scanner;
public class computeDiscount {
	public static void main(String[] args) {
		
		System.out.print(computeDiscount());
}
	private static String computeDiscount() {
		Scanner input = new Scanner(System.in);
		DecimalFormat twoDecimals = new DecimalFormat("0.00");
		System.out.print("Enter price: ");
		double price = input.nextDouble();
		System.out.print("Enter discount percentage: ");
		double discountPercentage = input.nextDouble();
		double discount = (discountPercentage*price)/100;
		return "The discount is " + twoDecimals.format(discount) + " euros"  ;
}
}