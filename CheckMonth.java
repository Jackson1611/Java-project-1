import java.util.Scanner;
public class CheckMonth {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a month number: ");
		String x = input.nextLine();
		
		
		try {	
			
			if(Integer.parseInt(x) > 0 && Integer.parseInt(x) < 13) {
				
				System.out.println("OK");
				} else {
					System.out.print(x + " is not a valid month number.");
				}  ;
			
		}  catch (NumberFormatException nfe) {
				
			 System.out.print(x + " is not a valid month number.");
		}
		
		}
	}