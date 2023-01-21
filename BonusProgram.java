import java.util.Scanner;
import java.text.DecimalFormat;

public class BonusProgram {
	public static void main(String[] args) {
		DecimalFormat twoDecimals = new DecimalFormat("0.00");
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the boat's selling price: ");

		double bonus;

		int price = Integer.parseInt(input.nextLine());

		if (price < 50000) {

			bonus = price * 0.01;

			if (bonus < 200) {

				bonus = 200;
			}

		} else {

			bonus = price * 0.015;

		}
		input.close();

		System.out.println("The bonus is " + twoDecimals.format(bonus) + " euros.");

	}
}
