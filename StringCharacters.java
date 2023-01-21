import java.util.Scanner;

public class StringCharacters {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String str = input.nextLine();

		char[] ch = str.toCharArray();
		int letter = 0;
		int num = 0;
		int otherchat = 0;
		for (int i = 0; i < str.length(); i++) {
			if (Character.isLetter(ch[i])) {
				letter++;
			} else if (Character.isDigit(ch[i])) {
				num++;
			} else {
				otherchat++;
			}
			
		}
		System.out.println( letter +" letter(s)");
		System.out.println( num + " digit(s)");
		System.out.println( otherchat + " other character(s)");
	
	}
	
}
