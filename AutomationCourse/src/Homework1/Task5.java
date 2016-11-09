package Homework1;

import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println(" Please enter the first number : ");

		int firstNumber = sc.nextInt();

		System.out.println(" Please enter the second number : ");

		int secondNumber = sc.nextInt();

		if (firstNumber > secondNumber) {

			System.out.println("Please reset the program and first enter the smaller number and then the biggest!");
		} else {
			for (int i = firstNumber; i <= secondNumber; i++) {

				System.out.println(i);

			}

		}
	}
}
