import java.util.Scanner;
public class StringOfPearls {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		System.out.print("Enter first string: ");
		
		int counter1 = 0 ;
		int counter2 = 0 ;
		String check = "pearl" ;
		String str = input.nextLine();
		
		while (!str.equals("quit")) {
			counter2 = counter2 + 1 ;
			System.out.print("Enter next string: ");
			str = input.nextLine();
		
		if (str.equalsIgnoreCase(check)) {
			counter1 = counter1 + 1 ; 
		}
		}
		if(counter2 > 1) {
			System.out.println( counter1 + " pearl(s)" );
			System.out.println("Bye!");
		} else {
			
			System.out.println("Bye!");
		}

	
	
		}}