import java.util.Random;
import java.util.Scanner;

public class LastTask {
	public static void main(String[] args) {
		Random randomGenerator = new Random();
		int number = randomGenerator.nextInt(20) + 1;

		Scanner reader = new Scanner(System.in);
		System.out.println("Choose your number  :  ");
		int input = reader.nextInt();

		if (input == number) {
			System.out.println("You Win");
		} else {
			System.out.println("Choose your second number : ");

		}
		int input2 = reader.nextInt();
		if (input2 == number) {
			System.out.println("You Win");

		} else {
			System.out.println("Choose your final number  :  ");

		}
		int input3 = reader.nextInt();
		if (input3 == number) {
			System.out.println("You Win");

		} else {
			System.out.println("You Lost the Game");
		}
	}
}
