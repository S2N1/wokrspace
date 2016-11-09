import java.util.Scanner;

public class HomeWork {

	public static void main(String[] args) {

		System.out.println("Slavcho Nikolov");

		char exampleChar = 'A';

		int total = 4;

		byte exampleByte = 10;

		short exampleShort = 100;

		int exmapleInt = 3455;

		float exampleFloat = 3.999f;

		double exampleDouble = 5.854545454;

		boolean exampleBool = false;

		System.out.println(exampleChar + " " + "is a Char;" + total + " " + "is int;" + exampleByte + " " + "is Byte;"
				+ exampleShort + " " + "is Short;" + exampleFloat + " " + "is Float;" + exampleDouble + " "
				+ "is Double;" + exampleBool + " " + "is Boolean;");

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the first number: ");
		int firstNumber = sc.nextInt();

		System.out.println("Enter the second number: ");
		int secondNumber = sc.nextInt();

		int result = firstNumber + secondNumber;
		System.out.println("Result is: " + result);

		if (result > 0) {
			System.out.println("This is a Positive Number");
		} else {
			System.out.println("This is not a Positeve Number");
		}

		sc = new Scanner(System.in);

		System.out.println("I am healty: ");
		boolean myHealth = sc.nextBoolean();

		System.out.println("The Money i have:");
		double myMoney = sc.nextDouble();

		if (myHealth == false && myMoney <= 0) {

			System.out.println("I will stay home and dring tea");

		} else if (myHealth == false && myMoney > 0) {

			System.out.println("I will buy Medecine");

		} else if (myHealth == true && myMoney <= 0) {
			System.out.println("I will play games at home");

		} else if (myHealth == true && myMoney > 10) {
			System.out.println("I will patry all Night");

		} else if (myHealth == true && myMoney <= 10) {
			System.out.println("I will go to drink coffee");
		}
	}

}
