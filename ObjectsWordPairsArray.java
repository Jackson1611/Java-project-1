
public class ObjectsWordPairsArray {
	public static void main(String[] args) {
	WordPair[] wordArray = {
	new WordPair("school","koulu"),	
	new WordPair("student","opiskelija"),
	new WordPair ("textbook","oppikirja")
};
	
	for (WordPair WordPairObject : wordArray) {
		 System.out.println(WordPairObject);
		}
}
}