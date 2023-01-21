import java.util.Scanner;

public class RegexLetters  {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		String str = input.nextLine();
		str = str.toLowerCase();
		if (str.matches("\\b[aeäoiöuy]+\\b")) {
			System.out.print("Vowels only");
		} else {
			System.out.print("Not only vowels!"  );
		}
	}
}
