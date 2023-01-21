import java.util.Scanner;

public class RegexStudentNumber {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter student number: ");
		String studentNum = input.nextLine();
		if (studentNum.matches("^2.*$") && studentNum.length() == 8) {
			System.out.print("OK");
		} else {
			System.out.print("Invalid student number"  );
		}
	}
}