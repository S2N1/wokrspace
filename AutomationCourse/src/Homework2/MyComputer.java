package Homework2;

import java.util.Scanner;

public class MyComputer {

	int year = 2016;
	double price = 700;
	boolean isNotebook = false;
	double hardDiskMemory = 1000;
	double freeMemory = 500;
	String operationSystem = "Linux";

	MyComputer() {
	}

	MyComputer(boolean isNotebook, String operationSystem) {
		this();
		this.isNotebook = isNotebook;
		this.operationSystem = operationSystem;

	}

	MyComputer(boolean isNotebook, String operationSystem, int year, double price, double hardDiskMemory,
			double freeMemory) {
		this(isNotebook, operationSystem);
		this.year = year;
		this.price = price;
		this.hardDiskMemory = hardDiskMemory;
		this.freeMemory = freeMemory;

	}

	double comparePrice(MyComputer computer) {
		int biggerPrice = 0;
		if (this.price > computer.price) {
			biggerPrice = -1;

		}
		if (this.price < computer.price) {
			biggerPrice = 1;

		}
		if (this.price == computer.price) {

			biggerPrice = 0;

		}
		return biggerPrice;

	}

	Scanner sc = new Scanner(System.in);

	void changeOperationSystem() {

		System.out.println("Enter your new operation system : ");

		String newOperationSystem = sc.nextLine();

		operationSystem = newOperationSystem;

		System.out.println("Yor new operation system is : " + operationSystem);

	}

	void useMemory() {

		System.out.println("How much memory you want to use :");

		int useMemory = sc.nextInt();

		if (useMemory > freeMemory) {

			System.out.println("Not enough free memory");

		} else {
			freeMemory -= useMemory;
			System.out.println("This is your available memory now : " + freeMemory);
		}

	}

	void showComputerStatistics() {

		System.out.println("These are the your computer statictics year : " + year + "; price " + price
				+ "; isNotebook " + isNotebook + "; hardDiskMemory " + hardDiskMemory + "; freeMemory " + freeMemory
				+ "; operationSystem " + operationSystem);

	}

}
