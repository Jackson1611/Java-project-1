import java.util.Scanner;
public class CheckWeekdayNumber {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a weekday number: ");
		String x = input.nextLine();
		
		try {	
			
			if(Integer.parseInt(x) < 8 && Integer.parseInt(x) > 0) {
				
				System.out.println("OK");
				} else {
					System.out.print("Please enter an integer between 1 and 7");
				}  ;
			
		}  catch (NumberFormatException nfe) {
				
			 System.out.print("Please enter an integer between 1 and 7");
		}
		
	
	}}