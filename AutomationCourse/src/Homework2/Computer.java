package Homework2;

public class Computer {

	private int year;
	private double price;
	private boolean isNotebook;
	private double hardDiskMemory;
	private double freeMemory;
	private String operationSystem;

	Computer() {
		super();
		this.isNotebook = false;
		this.operationSystem = "WindowsXp";

	}

	Computer(boolean isNotebook, String operationSystem, int year, double price, double hardDiskMemory,
			double freeMemory) {

		this();
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
}
