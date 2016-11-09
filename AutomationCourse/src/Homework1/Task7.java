package Homework1;

import java.util.Scanner;

public class Task7 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter a number: ");

		int enteredNumber = sc.nextInt();

		for (int i = 3 ; i < enteredNumber ; i++) {
			
			if (i % 3 == 0) {
				System.out.println(i);
			}

		}

	}
}