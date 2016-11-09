

public class UsingClasses {
	public static void main(String[] args){
		Person milena = new Person();
		Person krasi = new Person();
		Person slavi = new Person();
		Person poli = new Person();
		
		
		milena.firstName = "Milena";
		milena.lastName ="Atanasova";
		milena.age = 26;
		milena.hight = 1.56;
		milena.weight = 43;
		milena.isMale = false;
		milena.isPartOfFamily = false;
		milena.friend =krasi;
		
		
		krasi.firstName = "Krasi";
		krasi.lastName ="Atanasov";
		krasi.age = 33;
		krasi.hight = 1.76;
		krasi.weight = 70;
		krasi.isMale = true;
		krasi.isPartOfFamily = true;
		krasi.friend =milena;
		krasi.friend = poli;
		
		
		
		
		
	}

	
	
}
