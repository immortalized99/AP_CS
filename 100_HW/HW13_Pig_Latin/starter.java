/*
   * Author:  Jay Randeria
   * Date:  12/4/24
   * Collaborator(s):
*/

import java.util.*;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a word or phrase:");
		String sentence = sc.nextLine();
		System.out.println();
		System.out.println("Here's your sentence in Pig Latin!");
		
		while (true) {
			if (sentence.indexOf(" ") == -1) {
				System.out.println(pigLatin(sentence));
				break;
			}
			int space = sentence.indexOf(" ");
			String word = sentence.substring(0, space);
			System.out.print(pigLatin(word) + " ");
			sentence = sentence.substring(space + 1);
		}
	}
	
	public static String pigLatin(String word) {
		String[] vowels = {"a", "e", "i", "o", "u"};
		String[] consonents = {"b", "c", "d", "f", "g", "h", "j", "k", "l", "m", "n", "p", "q", "r", "s", "t", "v", "w", "x", "y", "z"};
		String letter = word.substring(0, 1);
		
		for (int i = 0; i < 5; i++) {
			if (vowels[i].equals(letter)) {
				word += "-way";
				break;
			}
		}
		
		for (int i = 0; i < 21; i++) {
			if (consonents[i].equals(word.substring(0, 1))) {
				for (int j = 0; j < 21; j++) {
					if (consonents[j].equals(word.substring(1,2))) {
						word += "-";
						word += word.substring(0, 1);
						word += word.substring(1, 2);
						word = word.substring(2);
						word += "ay";
						break;
					}
				}
			}
		}
		
		for (int i = 0; i < 21; i++) {
			if (consonents[i].equals(word.substring(0,1))) {
				for (int j = 0; j < 5; j++) {
					if (vowels[j].equals(word.substring(1, 2))) {
						word += "-";
						word += word.substring(0, 1);
						word = word.substring(1);
						word += "ay";
						break;
					}
				}
			}
		}
		return word;
	}
}