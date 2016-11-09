
public class FlyFish extends Fish implements Swimable, Flyable {

	private int age;

	private int getAge() {
		return age;
	}

	private void setAge(int age) {
		this.age = age;
	}

	public FlyFish(int age) {
		this.age = age;

	}

	@Override
	public void fly() {
		System.out.println("FlyFish can also fly over the surface of the water");

	}

	@Override
	public void eat() {
		System.out.println("Flyfish is eating");

	}

	@Override
	public void grow() {
		age++;
	}

}
