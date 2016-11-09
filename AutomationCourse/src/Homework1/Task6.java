package Homework1;

import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter a number : ");

		int enteredNumber = sc.nextInt();

		int result = 0;

		for (int i = 0; i <= enteredNumber; i++) {
			result += i;

		}
		System.out.println(result);
	}
}
