import java.util.Scanner;

class WordPair {
	String englishWord;
	String finnishWord;

	WordPair(String englishWord, String finnishWord) {
		this.englishWord = englishWord;
		this.finnishWord = finnishWord;

	}

	String getEnglishWord() {
		return englishWord;
	}

	String getFinnishWord() {
		return finnishWord;
	}

	public String toString() {
		return englishWord + " = " + finnishWord;
	}

}

public class ObjectsTranslatorArray {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		WordPair wordPair1 = new WordPair("bird", "lintu");
		WordPair wordPair2 = new WordPair("bar", "baari");
		WordPair wordPair3 = new WordPair("bus", "bussi");
		WordPair wordPair4 = new WordPair("car", "auto");
		WordPair wordPair5 = new WordPair("cat", "kissa");
		WordPair wordPair6 = new WordPair("dog", "koira");
		WordPair[] objArray = { wordPair1, wordPair2, wordPair3, wordPair4, wordPair5, wordPair6 };
		boolean found = false;
		System.out.print("Enter an English word: ");
		String word = input.nextLine();

		for (int i = 0; i < objArray.length; i++) {

			if (word.equals(objArray[i].englishWord)) {
				System.out.println(objArray[i].finnishWord);
				found = true;
				break;
			}

		}

		if (!found) {
			System.out.println("Unknown word");
		}
	}
}