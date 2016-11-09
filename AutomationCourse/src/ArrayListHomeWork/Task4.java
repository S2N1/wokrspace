package ArrayListHomeWork;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of the array :");
		int size = sc.nextInt();

		List arrayList = new ArrayList<>();

		for (int i = 0; i < size; i++) {
			System.out.println("Enter the value for the intex : ");
			arrayList.add(sc.nextInt());

		}

		boolean isMirror = true;
		for (int i = 0; i < size / 2; i++) {
			if (arrayList.get(i) != arrayList.get(size - 1 - i)) {
				isMirror = false;
				break;
			}
		}

	}

}
