package ArrayListHomeWork;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number for the first and second indeh of the list :  ");
		int ind = sc.nextInt();

		List arrl = new ArrayList<>();

		arrl.add(1);
		arrl.add(1);

		for (int i = 2; i < 10; i++) {
			arrl.add(i, (int) arrl.get(i - 2) + (int) arrl.get(i - 1));

		}
		System.out.println(arrl);
	}

}
