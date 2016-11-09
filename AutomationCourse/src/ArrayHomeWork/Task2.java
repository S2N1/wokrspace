package ArrayHomeWork;

import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter the lenght of the array : ");
		int lenghtArr = sc.nextInt();

		int[] myArr = new int[lenghtArr];

		for (int i = 0; i < myArr.length / 2; i++) {
			System.out.println("Please enter number for the array: ");
			myArr[i] = sc.nextInt();
			myArr[myArr.length / 2 + i] = myArr[i];

		}
		for (int i = 0; i < myArr.length; i++) {
			System.out.print(myArr[i] + " ");

		}
	}
}