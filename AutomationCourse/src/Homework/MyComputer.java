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

	/*- ����������� �� ������������ Computer() ����� ������������ ������
	isNotebook ��� �������� false, � ������ operationSystem � �Win XP�.
	*/

	MyComputer() {
		super();
		this.isNotebook = false;
		this.operationSystem = "WindowsXp";
	}

	/*
	 * ���������� � ��������� Computer(int year, double price, double
	 * hardDiskMemory, double freeMemory), ����� ����� ������� ������������ ��
	 * ������������ � ����� ������������ ���������� ������ ��� �����������
	 * �������� ���� ���������.
	 */

	MyComputer(int price, int year, double hardDiskMemory, int freeMemory, boolean isNotebook, String operationSystem) {
		this();
		this.price = price;
		this.year = year;
		this.hardDiskMemory = hardDiskMemory;
		this.freeMemory = freeMemory;
		this.operationSystem = operationSystem;

	}

	/*- ����������� � ��������� Computer(int year, double price, boolean
			isNotebook,
			double hardDiskMemory, double freeMemory, String operationSystem), �����
			������������ ������ ������ ��� ����������� �������� ���� ��������� ��
			������������.
	*/

	MyComputer(int year, int price, boolean isNotebook, double hardDiskMemory, int freeMemory, String operationSystem) {

		this.year = year;
		this.price = price;
		this.isNotebook = isNotebook;
		this.hardDiskMemory = hardDiskMemory;
		this.freeMemory = freeMemory;
		this.operationSystem = operationSystem;

	}

	/*- ����� int comparePrice(Computer c), ����� �������� ������ �� 2 ���������.
	��� ������ �� ������ �������� (����, �� ����� �� ���� ������) � ��
	������ �� ���� �� ��������� ������� ���� ��������, ������ ����� -1. ���
	������ �� ��������� ������� ���� �������� � ��-��������, �� ����� 1, � ���
	�� �����, ������ ����� �������� 0.
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