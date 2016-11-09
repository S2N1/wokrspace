package Homework;

public class Student {

	private String name;
	private String subject;
	private double grade;
	private int yearInCollege;
	private int age;
	private boolean isDegree;
	private double money;

	protected boolean getisDegree() {
		return isDegree;
	}

	protected int getYearInCollege() {
		return yearInCollege;
	}

	/*-����������� �� ������������ ����� ������ �������� ����������� ��
	��������: grade = 4.0, yearInCollege = 1, isDegree = false, money = 0
	*/

	Student() {

		this.grade = 4.0;
		this.yearInCollege = 1;
		this.isDegree = false;
		this.money = 0;

	}

	/*-���������� � ��������� ����� ������� ������������ �� ������������ �
	������������(������ ������������ ���������) ���������� ������ ��
	�����
	*/

	Student(String name, String subject, double grade, int yearInCollege, int age, boolean isDegree, double money) {
		this();
		this.name = name;
		this.subject = subject;
		this.age = age;

	}

	/*-����� void upYear() ����� ��������� �������� � ������ � �������, ���
	�������� �� � ��������, � �������� ������ ������� ���������
	���������. ��� ���� ������������� �������� ����� 4, ������ true ��
	������ isDegree
	*/

	void upYear() {
		if (this.isDegree != true) {
			this.yearInCollege++;
		} else {
			System.out.println("The student has greduated");
		}
		if (this.yearInCollege > 4) {
			this.isDegree = true;
		}

	}

	/*-����� double receiveScholarship(double min, double amount) � ������ ������
	amount ��� ������ �� ��������, ���� ��� ������ �� � ��-����� ��� �����
	�� ���������� ����� ������� ���� ��������� (min) � ��� ��������� �� �
	��� 30 ������.
	������ ����� �������� ���� �� �������� (���� ������������ ��
	����������)
	*/

	double recieveScholarship(double min, double amount) {
		double currentMoney = 0;
		if (this.grade > min && this.age < 30) {
			currentMoney = this.money + amount;

		}
		return currentMoney;
	}
}
