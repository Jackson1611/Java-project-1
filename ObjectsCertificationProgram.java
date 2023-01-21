
import java.util.Scanner;

class Coach {
	private String name;
	private int score;

	Coach(String name, int score) {
		this.name = name;
		this.score = score;
	}

	String getName() {
		return name;
	}

	int getScore() {
		return score;
	}

}

public class ObjectsCertificationProgram {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int counter = 0;
		int min;
		String[] name = new String[4];
		int[] score = new int[4];
		Coach[] coachArray;
		coachArray = new Coach[4];
		for (int i = 0; i < coachArray.length; i++) {
			
			System.out.print("Enter coach name: ");
			
			name[i] = input.nextLine();

			System.out.print("Enter " + name[i] + "'s score: ");

			score[i] = Integer.parseInt(input.nextLine());
			coachArray[i] = new Coach(name[i], score[i]);
			
		}
		System.out.println();
		System.out.print("Enter the minimum passing score: ");
		min = input.nextInt();
		System.out.println();
		System.out.println("Passing scores");

		for (int i = 0; i < coachArray.length; i++) {
			if (coachArray[i].getScore() >= min) {
				System.out.println(coachArray[i].getName() + " (" + coachArray[i].getScore() + " points)");
				counter++;
			}
		}
		double percent = counter * 25;

		System.out.println("The passing rate is " + percent + "%");

	}

}
