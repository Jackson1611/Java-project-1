import java.util.Scanner;
public class StringTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter first string: ");
		String firstS = input.next();
		
		System.out.print("Enter secnond string: ");
		String secondS = input.next();
		int compare = firstS.compareTo(secondS);
		
		if(compare == 0) {
			
			System.out.print("The strings are equal");
		
		} else {
			
			System.out.print("The strings are not  equal");
		}
}}
