package ArrayListHomeWork;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		List arrayList = new ArrayList<>();
		List arrayList1 = new ArrayList<>();

		System.out.println("Enter size of your first list : ");
		int size = sc.nextInt();

		for (int i = 0; i < size; i++) {
			System.out.println("Enter numbers in your First list : ");
			arrayList.add(sc.nextInt());

		}

		System.out.println("Enter size of your Second list : ");
		int size1 = sc.nextInt();

		for (int i = 0; i < size1; i++) {
			System.out.println("Enter numbers in your Second list : ");
			arrayList1.add(sc.nextInt());

		}

		boolean sameLenght = true;
		for (int i = 0; i < arrayList.size(); i++) {
			if (arrayList.size() != arrayList1.size()) {
				sameLenght = false;
				break;
			}
		}
		boolean areSame = true;
		for (int i = 0; i < arrayList.size(); i++) {
			for (int j = 0; j < arrayList1.size(); i++) {
				if (arrayList.get(i) != arrayList1.get(j))
					areSame = false;
				break;
			}

			if (sameLenght = true) {
				System.out.println("List are with the same lenght");

			} else {
				System.out.println("List are not the same lenght");
			}

			if (areSame = true) {

				System.out.println("List have the same values");
			} else {
				System.out.println("List have different values");

			}

		}

	}
}
