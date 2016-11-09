package ArrayHomeWork;

import java.util.Scanner;

public class Task4 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of the array : ");
		int size = sc.nextInt();

		int[] array = new int[size];

		for (int i = 0; i < array.length; i++) {
			System.out.println("Enter the values of the array : ");
			array[i] = sc.nextInt();
		}

		boolean isMirror = true;
		for (int i = 0; i < array.length / 2; i++) {
			if (array[i] != array[array.length - 1 - i]) {
				isMirror = false;
				break;
			}

		}
		if (isMirror) {
			System.out.println("is mirror");
		} else {
			System.out.println("not mirror");
		}

	}

}
