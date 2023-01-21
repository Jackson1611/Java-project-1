import java.util.Arrays; 
import java.util.Scanner;
import java.text.DecimalFormat;
public class ArraysGrades {
	public static void main(String[] args) {
		DecimalFormat oneDecimals = new DecimalFormat("0.0");
		String[] letter = {"A", "A", "B", "A", "C", "B", "C", "F", "B", "B", "A", "A", "C", "C", "C"};
		Scanner input = new Scanner(System.in);
		System.out.print("Enter grade letter: ");
		String grade = input.next();
		double counter = 0 ;
		for(int i = 0 ; i < letter.length; i++) {
			if (grade.equalsIgnoreCase(letter[i]) ) {
				counter = counter + 1 ;
			}
		
		}
	double percentage =  (counter* 100) / (letter.length)   ;
	System.out.print(oneDecimals.format(percentage) + "%");
	
}
}