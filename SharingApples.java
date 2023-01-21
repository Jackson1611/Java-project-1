import java.util.Scanner;

public class SharingApples {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("How many apples? ");
		int apple = Integer.parseInt(input.nextLine());
		
		System.out.print("How many children? ");
		int children = Integer.parseInt(input.nextLine());
		
		
		
		
		int each = apple/children;
		int leftover = apple%children;
		System.out.println("Each child will get " + each +" apples.");
		System.out.println("There will be " + leftover +" leftover apples.");
	}
}
