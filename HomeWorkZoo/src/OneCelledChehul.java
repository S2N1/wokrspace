
public class OneCelledChehul extends OneCelled {

	protected int age;
	
	@Override
	public void grow() {
		setAge(getAge() + 1);

	}
	@Override
	public void eat() {
		System.out.println("Chehula izqjda Amebate");

	}
	public void move() {
		System.out.println("Chehula is moving");

	}

}
