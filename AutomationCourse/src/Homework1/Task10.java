package Homework1;

import java.awt.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {

		ArrayList arrL = new ArrayList<>();

		Scanner sc = new Scanner(System.in);
		System.out.println("enter numbers in the list : ");
		while (sc.hasNextInt()) {
			System.out.println("enter numbers in the list : ");
			int size = sc.nextInt();
			arrL.add(size);
		}
		System.out.println("The result ArrayList is: " + arrL);

		Iterator itr = arrL.iterator();
		int min = (int) arrL.get(0);
		boolean db3 = false;

		while (itr.hasNext()) {
			int tmp = (int) itr.next();
			if (tmp % 3 == 0 && (min % 3 == 0 && min > tmp)) {
				min = tmp;
				db3 = true;

			}

		}
		if (db3 = true && min % 3 == 0) {
			System.out.println("dev by 3 is" + min);

		}

		System.out.println(min);

	}
}
