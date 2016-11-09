import java.util.Random;
import java.util.Scanner;

public class Homework2 {

	public static void main(String[] args) {

		int i = 1;
		while (i <= 100) {
			System.out.println(i);
			i++;
		}
		int d = 10;
		while (d >= 0) {
			System.out.println(d);
			d--;

		}

		Scanner reader = new Scanner(System.in);
		System.out.println("Enter the first number:  ");
		int m = reader.nextInt();
		System.out.println("Enter the second number:  ");
		int m1 = reader.nextInt();
		for (int r = m; r < m1 + 1; r++) {
			System.out.println("Number in range are :  " + r);

		}
		Scanner scc = new Scanner(System.in);
		System.out.println("Enter a random number: ");
		int n = scc.nextInt();
		int num = 1;
		int sum = 1;
		System.out.print("The Result 1");
		while (num < n) {
			num++;
			sum += num;
			System.out.printf("+%d", num);
		}
		System.out.printf(" = %d%n", sum);

		Scanner input2 = new Scanner(System.in);
		System.out.println("Give me 15 positive numbers   :   ");
		int number = input2.nextInt();
		int max = number;
		int min = number;

		for (int y = 0; y < 14; y++) {
			System.out.println("Give the next number  :   ");
			number = input2.nextInt();

			if (number > max) {
				max = number;

			}
			if (number < min) {
				min = number;
			}
		}
		System.out.println("Highest value is  :  " + max);
		System.out.println("Min  value is  :  " + min);

		Scanner input1 = new Scanner(System.in);
		System.out.println("Input a positive number  :  ");

		int n1 = input1.nextInt();

		for (int z = 1; z < n1; z++) {
			if (z % 3 == 0) {
				System.out.printf(z + ",");
			}

		}

		Random randomGenerator = new Random();
		int number1 = randomGenerator.nextInt(20) + 1;

		Scanner reader1 = new Scanner(System.in);
		System.out.println("Choose your number  :  ");
		int inputA = reader.nextInt();

		if (inputA == number) {
			System.out.println("You Win");
		} else {
			System.out.println("Choose your second number : ");

		}
		int inputB = reader.nextInt();
		if (inputB == number) {
			System.out.println("You Win");

		} else {
			System.out.println("Choose your final number  :  ");

		}
		int inputC = reader.nextInt();
		if (inputC == number) {
			System.out.println("You Win");

		} else {
			System.out.println("You Lost the Game");
		}
	}

}
//Scanner sc = new Scanner(System.in);

//int[] newArr = new int[10];
//for( int i =0 ; i< newArr.length; i++){
	//newArr[i] = sc.nextInt();
