
public class Varan extends Lizard implements Swimable {

	public Varan(int age) {
		this.age = age;

	}

	@Override
	public void eat() {
		System.out.println("Varana qde meso");

	}

	@Override
	public void grow() {
		age++;

	}
	public void swim(){
		System.out.println("Varana moje da pluva");
	}

	@Override
	public void makeSound() {
	System.out.println("Grrrrrr");
		
	}

}
