import java.util.Scanner;

public class RegexPlateNumber {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter plate number: ");
		String str = input.nextLine();
		if (str.matches("^[A-Z]{3}(-)[0-9]{3}") && str.length() == 7) {
			System.out.print("OK");
		} else {
			System.out.print("Invalid plate number"  );
		}
	}
}