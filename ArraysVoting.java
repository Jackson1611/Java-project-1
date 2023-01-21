import java.util.Scanner;

public class ArraysVoting {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the number of candidates: ");
		int numOfCandidate = input.nextInt();
		int forVotes = 0;
		int forCom = 0;
		int tie = 0;
		int tie2 = 0;
		int fina = 0;
		int one = 0;
		int counter = 0;
		String[] nameArray = new String[numOfCandidate];
		int[] numsOfCands = new int[numOfCandidate];
		int[] votes = new int[numOfCandidate];

		int length = nameArray.length;
		for (int i = 0; i < length; i++) {
			input.nextLine();
			System.out.println("Enter candidate's name: ");
			nameArray[i] = input.nextLine();
			System.out.println("Enter " + nameArray[counter] + "\'" + "s votes: ");

			votes[i] = input.nextInt();
			counter += 1;

		}
		for (int i = 0; i < nameArray.length; i++) {
			if (votes[i] > forVotes) {
				forVotes = votes[i];
				forCom = i;
			}
		}

		for (int j = 0; j < nameArray.length; j++) {
			if (votes[j] == forVotes && j != forCom) {

				fina++;
			}
		}
		int[] tieNumbers = new int[fina];

		for (int j = 0; j < nameArray.length; j++) {
			if (votes[j] == forVotes && j != forCom) {

				tieNumbers[one] = j;
				one += 1;
			}
		}
		if (fina > 0) {
			System.out.println("It is a tie!");
			System.out.println(nameArray[forCom] + "(" + forVotes + "votes)");
			for (int n = 0; n < tieNumbers.length; n++) {
				tie2 = tieNumbers[tie];
				System.out.println(nameArray[tie2] + "(" + forVotes + "votes)");
				tie += 1;
			}

		} else {
			System.out.println(nameArray[forCom] + " is the winner with " + forVotes + " votes!");
		}

	}
}

