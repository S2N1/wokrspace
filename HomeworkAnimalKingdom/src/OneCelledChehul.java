
public class OneCelledChehul extends Animal {

	private int Age;
	private String species;

	private int getAge() {
		return Age;
	}

	private void setAge(int age) {
		Age = age;
	}

	private String getSpecies() {
		return species;
	}

	private void setSpecies(String species) {
		this.species = species;
	}

	// OneCelledChehul(int age, String species) {
	// this.Age = age;
	// this.species = species;

	public OneCelledChehul() {

	}

	public void eat() {
		System.out.println("Chehulcheto vinagi izqjda Amebata");
	}

	public void grow() {
		Age++;

	}
}
