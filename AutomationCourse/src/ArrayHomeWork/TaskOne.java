package ArrayHomeWork;

public class TaskOne {

	public static void main(String[] args) {

		int[] intArr = new int[5];

		intArr[0] = 10;
		intArr[1] = 66;
		intArr[2] = 12;
		intArr[3] = -417;
		intArr[4] = 5;

		// find the minimum number multiple by 3
		boolean hasNumberMultipleBy3 = false;
		int min = intArr[0];

		for (int i = 1; i < intArr.length; i++) {
			if (intArr[i] % 3 == 0 && (min % 3 != 0 || intArr[i] < min)) {
				hasNumberMultipleBy3 = true;
				min = intArr[i];
			}
		}

		if (hasNumberMultipleBy3 == false && min % 3 != 0) {
			System.out.println("No number multiple by 3 in the array");
		} else {
			System.out.println("The minimum number multiple by 3 is " + min);
		}
	}
}