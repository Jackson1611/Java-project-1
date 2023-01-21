import java.util.Scanner;

public class RegexSize {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter size: ");
		String text = input.nextLine();
		if (text.matches("XXS|XS|S|M|L|XL|XXL")) {
			System.out.print("Size ok");
		} else {
			System.out.print("Invalid size");
		}
	}
}