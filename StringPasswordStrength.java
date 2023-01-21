import java.util.Scanner;

public class StringPasswordStrength {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter username: ");
		String user = input.nextLine();
		System.out.print("Enter password: ");
		String password = input.nextLine();
		System.out.print(checkStrength(user,password));
		
	}

	public static String checkStrength(String user, String password) {
		
		String user1 = user.toLowerCase();
		String password1 = password.toLowerCase();
		
		if (password1.contains(user1) ) {
			return ("NOT OK") ;
		} else if (password1.length() < 9) {
			return ("NOT OK");
		} else {
			return ("OK");
		}

	}
}