import java.util.Scanner;
public class MethodsSecond {
	public static void main(String[] args) {
		multiPrint();
}
	public static void multiPrint() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter string: ");
		String str = input.nextLine();
		System.out.print("Enter count: ");
		int num = input.nextInt();
		
		for (int i = 0; i < num ;i++) {
			System.out.print(str + " ");
		}
}
}