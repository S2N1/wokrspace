package ArrayHomeWork;

public class Task7 {

	public static void main(String[] args) {

		int[] arr = new int[] { 13, 2, 7 };

		int[] arr1 = new int[] { 13, 2, 7 };

		boolean isSame = true;
		if (arr.length != arr1.length) {
			System.out.println("Arrs are not the same");

		} else {
			for (int i = 0; i < arr1.length; i++) {
				if (arr[i] != arr1[i]) {
					isSame = false;
					break;
				}
			}
			if (isSame) {
				System.out.println("Arrs have the same numbers in them");
			} else {
				System.out.println("Arrs dont have the same numbers in them");
			}

		}

	}
}