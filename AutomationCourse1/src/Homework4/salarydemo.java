package Homework4;

public class salarydemo {

	public static void main(String[] args) {

		/*
		 * Да се състави масив от 10 елемента от тип Person. 2. Да се създадът
		 * по два обекта от тип Person, Student и Employee и да се вкарат в
		 * масива от хора.
		 */

		Employee emp = new Employee("Ivan", 20, true, 30);
		Employee emp1 = new Employee("Petkan", 21, true, 30);

		Student st = new Student("Petur", 18, true, 3);
		Student st1 = new Student("GeriNikol", 16, false, 6);

		Person p = new Person("Gosho", 40, true);
		Person p1 = new Person("Tupan", 30, true);

		Person[] pers = new Person[10];

		pers[1] = emp;
		pers[2] = emp1;
		pers[3] = st;
		pers[4] = st1;
		pers[5] = p;
		pers[6] = p1;

		/*
		 * Да се обходим масива и в зависимост от това дали обекта е от тип
		 * Person, Student или Employee да се извика съответно метода
		 * showPersonInfo, showStudentInfo или showEmployeeInfo
		 */

		for (int i = 0; i < pers.length; i++) {
			if (pers[i] != null) {
				pers[i].showPersonInfo();

			}

		}

		/*
		 * Да се обходи още веднъж масива с хора и за всеки човек, който е
		 * работник, да се изведе на екрана сумата, която му се дължи при 2 часа
		 * работа извън работно време.
		 */

		for (int i = 0; i < pers.length; i++) {
			if (pers[i] != null) {
			}

			if (pers[i] instanceof Employee) {
				Employee emp3 = (Employee) pers[i];
				System.out.println(emp3.calculateOvertime(2));

			}

		}

	}
}