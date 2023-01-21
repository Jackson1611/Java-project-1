import java.util.Scanner;
public class PrintDescending {
	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int num = input.nextInt();
		
	      int myArray[] = new int [num];
	      int sum = 0;
	      
		for (int i =1 ;i <= num  ;i++) {
			sum = sum + myArray[i];
	         System.out.print(i + " ");
	 		
	     
			}
		
	}
	

}
