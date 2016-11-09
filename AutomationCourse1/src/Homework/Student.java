package Homework;

public class Student {

	private String name;
	private String subject;
	private double grade;
	private int yearInCollege;
	private int age;
	private boolean isDegree;
	private double money;

	public void setAge(int age) {
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public double getGrade() {
		return grade;
	}

	public int getAge() {
		return age;
	}

	public boolean isDegree() {
		return isDegree;
	}

	public double getMoney() {
		return money;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public void setGrade(double grade) {
		this.grade = grade;
	}

	protected boolean getisDegree() {
		return isDegree;
	}

	public String getSubject() {
		return subject;
	}

	protected int getYearInCollege() {
		return yearInCollege;
	}

	Student() {

		this.grade = 4.0;
		this.yearInCollege = 1;
		this.isDegree = false;
		this.money = 0;

	}

	Student(String name, String subject, double grade, int yearInCollege, int age, boolean isDegree, double money) {
		this();
		this.name = name;
		this.subject = subject;
		this.age = age;

	}

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

	double recieveScholarship(double mingrade, double amount) {
		if (this.grade > mingrade && this.age < 30) {
			this.money += amount;

		}
		return this.money;
	}
}
