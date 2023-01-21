import java.util.Scanner;

public class StringUsername {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter given name: ");
		String givenName = input.nextLine();
		System.out.print("Enter surname: ");
		String surname = input.nextLine();
		System.out.println(createUsername(givenName, surname));
		
	}

	public static String createUsername(String givenName, String surname) {
		try {
		String given = givenName.toLowerCase();
		String sur = surname.toLowerCase();
		
		
		String first = given.substring(0,2);
		String second = sur.substring(sur.length()-3 );
		String username = second + first ;
		
		
		return username ;
		} catch(Exception e) {
			return ("Cannot create a username!");
		}
	}
}