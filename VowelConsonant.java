package kids;

import java.util.Scanner;

public class VowelConsonant {
	
	public static boolean checkVowel(char character) {
		String vowels = "aeiouAEIOU";
		return vowels.indexOf(character) != -1;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a character : " );
		char character = scan.next().charAt(0);
		System.out.println(checkVowel(character) == true ? "vowel" : "consonant");
		scan.close();
	}
}
