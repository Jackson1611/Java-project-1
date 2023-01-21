import java.util.Scanner;
public class CheckInteger {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an integer: ");
		String x = input.nextLine();
		try {		 
			Integer.parseInt(x); 
			System.out.println("OK");
		}  catch (NumberFormatException nfe) {
				
			 System.out.print( "'"+ x +"'" + " is not an integer");
		}
		
	
	}}