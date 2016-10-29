package kids;

import java.util.Scanner;

public class NumberOddEven {
	
	public static String checkNumber(int number) {
		return number % 2 != 0 ? "odd" : "even";
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int number = scan.nextInt();
		System.out.println(checkNumber(number));
		scan.close();
	}
}
