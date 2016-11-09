
public class OneCelledAmeba extends OneCelled {

	public void grow() {
		setAge(getAge() + 1);

	}

	public void eat() {
		System.out.println("Ameba is eating");

	}

	public void move() {
		System.out.println("Ameba is moving");

	}
}
