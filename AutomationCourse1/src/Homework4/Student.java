package Homework4;

public class Student extends Person {

	private int score;

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	Student(String name, int age, boolean isMan, int score) {
		super(name, age, isMan);
		this.score = score;

	}

	@Override
	public String toString() {
		return "Student score is " + score + " his name is " + getName() + " his age is " + getAge() + "is he a real man "
				+ isMan() + "";
	}

	void showStudentInfo(Student s) {
		System.out.println(this.toString());

	}

}
