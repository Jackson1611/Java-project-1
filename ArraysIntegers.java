import java.util.Scanner;
import java.util.Arrays; 
import java.util.Collections; 
public class ArraysIntegers {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int[] Numbers = new int[5];
	for (int i = 0; i < Numbers.length; i++) {
		
		System.out.print("Enter an integer: ");
		
		Numbers[i] = input.nextInt();
		}
	
int temp ;
	for (int i = 0; i < Numbers.length; i++) {
		for (int j = i + 1; j < Numbers.length; j++) {
			if (Numbers[i] < Numbers[j]) {
				temp = Numbers[i];
				Numbers[i] = Numbers[j];
				Numbers[j] = temp;
				
			}
			
		}
		
	}
	for (int i = 0; i < Numbers.length; i++) {
	System.out.print((Numbers[i]) + " ");
	}
	}
	}