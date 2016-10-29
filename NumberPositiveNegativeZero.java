package kids;
import java.util.Scanner;

public class NumberPositiveNegativeZero {

	public static String checkNumber(int number) {
		return number == 0 ? "zero" : number > 0 ? "positive" : "negative";
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int number = scan.nextInt();
		System.out.println(checkNumber(number));
		scan.close();
	}
}
