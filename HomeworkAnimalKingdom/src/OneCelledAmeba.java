
public class OneCelledAmeba extends Animal {

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

	// public OneCelledAmeba(int age, String species) {
	// this.Age = age;
	// this.species = species;

	// }

	public OneCelledAmeba() {
		
	}



	public void grow() {
		Age++;

	}

	public void eat() {
		System.out.println("Ameba is eating");
		
	}

}
