package exceptions;

public class Student {

	private int age;

	private String sex;

	private String firstName;

	private String lastName;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setStudentAge(int age) {
		try {
			if (age < 7 || age > 18) {
				throw new IllegalArgumentException();
			} else {
				this.setAge(age);
				System.out.println("You have set the age to " + this.getAge());
			}
		} catch (IllegalArgumentException e) {
			System.out.println("The age of the Student must be between 7 and 18");
			e.printStackTrace();
		}

	}

	public void setStudentFirstName(String name) {
		try {
			if (name.length() > 12) {
				throw new IllegalArgumentException();
			} else {
				this.setFirstName(name);
				System.out.println("The First Name of the Student is " + this.getFirstName());
			}

		} catch (IllegalArgumentException e) {
			System.out.println("The Name of the Student is too Long");
			e.printStackTrace();

		}
	}
}