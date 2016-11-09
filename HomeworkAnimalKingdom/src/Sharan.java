
public class Sharan extends Fish implements Swimable {

	private int age;

	public Sharan(int age) {
		this.age = age;
	}

	@Override
	public void swim() {
		System.out.println("Sharana always swims under water");

	}

	@Override
	public void eat() {
		System.out.println("Sharana eats from the bottom of the river");

	}

	@Override
	public void grow() {

		age++;

	}

}
