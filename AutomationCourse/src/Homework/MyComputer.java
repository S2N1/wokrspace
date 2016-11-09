package Homework;

public class MyComputer {

	private int price;
	private int year;
	boolean isNotebook;
	private double hardDiskMemory;
	private int freeMemory;
	private String operationSystem;

	/*
	 * for testing purpose : protected String getOperationSystem() { return
	 * operationSystem; }
	 */
	protected void setPrice(int price) {
		this.price = price;
	}

	protected boolean isNotebook() {
		return isNotebook;
	}

	/*- конструктор по подразбиране Computer() който инициализира полето
	isNotebook със стойност false, и полето operationSystem с „Win XP“.
	*/

	MyComputer() {
		super();
		this.isNotebook = false;
		this.operationSystem = "WindowsXp";
	}

	/*
	 * констуктор с параметри Computer(int year, double price, double
	 * hardDiskMemory, double freeMemory), който първо извиква конструктора по
	 * подразбиране и после инициализира останалите полета със стойностите
	 * подадени като аргументи.
	 */

	MyComputer(int price, int year, double hardDiskMemory, int freeMemory, boolean isNotebook, String operationSystem) {
		this();
		this.price = price;
		this.year = year;
		this.hardDiskMemory = hardDiskMemory;
		this.freeMemory = freeMemory;
		this.operationSystem = operationSystem;

	}

	/*- конструктор с параметри Computer(int year, double price, boolean
			isNotebook,
			double hardDiskMemory, double freeMemory, String operationSystem), който
			инициализира всички полета със стойностите подадени като аргументи на
			конструктора.
	*/

	MyComputer(int year, int price, boolean isNotebook, double hardDiskMemory, int freeMemory, String operationSystem) {

		this.year = year;
		this.price = price;
		this.isNotebook = isNotebook;
		this.hardDiskMemory = hardDiskMemory;
		this.freeMemory = freeMemory;
		this.operationSystem = operationSystem;

	}

	/*- метод int comparePrice(Computer c), който сравнява цените на 2 компютъра.
	Ако цената на първия компютър (този, за който се вика метода) е по
	висока от тази на компютъра подаден като аргумент, метода връща -1. Ако
	цената на компютъра подаден като аргумент е по-високата, се връща 1, а ако
	са равни, метода връща стойност 0.
	*/

	int comparePrice(MyComputer computer) {
		int biggerprice = 0;
		if (this.price > computer.price)
			biggerprice = -1;

		if (this.price < computer.price)
			biggerprice = 1;

		if (this.price == computer.price)
			biggerprice = 0;

		return biggerprice;

	}

}