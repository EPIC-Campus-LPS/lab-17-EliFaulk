package packageName;
import java.util.ArrayList;
import java.util.Scanner;

public class ChatHistory {

	public static void main(String[] args) {
		
		ArrayList<String> words = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.println("Enter a sentence: ");
			String sentence = sc.nextLine();
			if (sentence.toLowerCase().equals("stop")) {
				break;
			} else {
				String[] x = sentence.split(" ");
				for (int i = 0; i < x.length; i++) {
					words.add(x[i]);
				}
			}
		}
		
		sc.close();
		
		
		int size = words.size();
		ArrayList<String> uniqueWords = new ArrayList<>();
		int the = 0;
		String longest = "";
		boolean allLower = true;
		String condensed = "";
		
		
		for (String word : words) {
			//Create ArrayList of all unique words
			boolean isUnique = true;
			for (String w : uniqueWords) {
				if (w.equals(word.toLowerCase())) {
					isUnique = false;
				}
			}
			if (isUnique) {
				uniqueWords.add(word.toLowerCase());
				if (word.length() > 3) {
					condensed = condensed + word.toLowerCase() + " ";
				}
			}
			
			//Count appearances of "the"
			if (word.toLowerCase().equals("the")) {
				the++;
			}
			
			//Adjust longest word
			if (word.length() > longest.length()) {
				longest = word;
			}
			
			//Check if lower case
			if (!word.equals(word.toLowerCase())) {
				allLower = false;
			}
		}
		
		
		
		System.out.println("CHAT REPORT:");
		System.out.println("You used " + size + " words.");
		System.out.println("You used " + uniqueWords.size() + " unique words.");
		System.out.println("You used \"the\" " + the + " times.");
		System.out.println("\"" + longest + "\" was the longest word.");
		System.out.println("Are all words lowercase? " + allLower);
		System.out.println("\nCondensed Chat History: " + condensed);

	}

}
