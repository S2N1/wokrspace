package Homework1;

import java.util.Scanner;

public class Task9 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter first number: ");

		int firstNum = sc.nextInt();

		System.out.println("Please enter second number: ");

		int secondNum = sc.nextInt();

		for (int i = firstNum; i < secondNum; i++) {
			if (i % 3 == 0) {

				System.out.println("skip" + i);

			} else {
				System.out.println(i * i);

			}

		}

	}
}
