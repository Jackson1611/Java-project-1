import java.util.ArrayList;
import java.util.Scanner;


public class ObjectsTranslatorArrayList {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("=== Creating an English-Finnish dictionary (ok ends) === ");
		ArrayList<WordPair> wordList = new ArrayList();
		String english = "";
		String finnish = "";

		while (!english.equals("quit")) {
			System.out.print("Enter an English word: ");
			english = input.nextLine();
			if (english.equals("quit")) {
				break;
			}
			System.out.print("Enter a Finnish word: ");
			finnish = input.nextLine();
			wordList.add(new WordPair(english, finnish));
		}
		String inputEng = "";
		boolean found = false;
		
		
		System.out.println("=== English-Finnish translation service (quit ends) ===");
		while (!inputEng.equals("quit")) {
			System.out.println("Enter an English word: ");
			inputEng = input.nextLine();
			if (inputEng.equals("quit")) {
				break;
			}
			for (WordPair word : wordList) {
				if (inputEng.equalsIgnoreCase(word.englishWord)) {
					System.out.println(word.getFinnishWord());
					found = true;
				}
			}
		}
	}
}