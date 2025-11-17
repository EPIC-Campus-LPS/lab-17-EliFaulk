package packageName;
import java.util.ArrayList;
import java.util.Scanner;

public class ChatHistory {

	public static void main(String[] args) {
		
		ArrayList<String> words = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		while (true) {
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
		int unique = 0;
		ArrayList<String> uniqueWords = new ArrayList<>();
		int the = 0;
		String longest = "";
		boolean allLower = true;
		
		for (String word : words) {
			
		}
		
		
		
		System.out.println("CHAT REPORT:");
		System.out.println("You used " + size + " words.");
		System.out.println("You used " + unique + " unique words.");
		System.out.println("You used \"the\" " + the + " times.");
		System.out.println("\"" + longest + "\" was the longest word.");
		System.out.println("Are all words lowercase? " + allLower);

	}

}
