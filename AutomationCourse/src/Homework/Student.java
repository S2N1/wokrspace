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

	/*-конструктор по подразбиране който задава следните стойностите на
	полетата: grade = 4.0, yearInCollege = 1, isDegree = false, money = 0
	*/

	Student() {

		this.grade = 4.0;
		this.yearInCollege = 1;
		this.isDegree = false;
		this.money = 0;

	}

	/*-констуктор с параметри които извиква конструктора по подразбиране и
	инициализира(задава първоначални стойности) останалите полета на
	класа
	*/

	Student(String name, String subject, double grade, int yearInCollege, int age, boolean isDegree, double money) {
		this();
		this.name = name;
		this.subject = subject;
		this.age = age;

	}

	/*-метод void upYear() който увеличава годината в колежа с единица, ако
	студента не е завършил, в противен случай извежда подходящо
	съобщение. Ако след увеличаването годината стане 4, задава true на
	полето isDegree
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

	/*-метод double receiveScholarship(double min, double amount) – добавя сумата
	amount кум парите на студента, само ако успеха му е по-висок или равен
	на минималния успех подаден като параметър (min) и ако възрастта му е
	под 30 години.
	Метода връща текущите пари на студента (след евентуалното им
	увеличение)
	*/

	double recieveScholarship(double min, double amount) {
		double currentMoney = 0;
		if (this.grade > min && this.age < 30) {
			currentMoney = this.money + amount;

		}
		return currentMoney;
	}
}
