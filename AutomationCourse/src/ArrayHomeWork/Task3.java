package ArrayHomeWork;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {

		

		int[] array = new int[10];

		array[0] = 1;
		array[1] = 1;

		for (int i = 2; i < array.length; i++) {
			array[i] = array[i-2] + array[i-1];
		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");

		}

	}
}