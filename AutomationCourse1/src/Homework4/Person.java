package Homework4;

public class Person {
	private String name;
	private int age;
	private boolean isMan;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isMan() {
		return isMan;
	}

	public void setMan(boolean isMan) {
		this.isMan = isMan;
	}

	Person(String name, int age, boolean isMan) {

		this.name = name;
		this.age = age;
		this.isMan = isMan;

	}

	@Override
	public String toString() {
		return "Person name is " + name + "his age " + age + "is he a real man " + isMan + "";
	}

	void showPersonInfo() {

		System.out.println(this.toString());

	}

}
