package Homework4;

public class Employee extends Person {

	private double daySalary;

	public double getDaySalary() {
		return daySalary;
	}

	public void setDaySalary(double daySalary) {
		this.daySalary = daySalary;
	}

	Employee(String name, int age, boolean isMan, double daysalary) {

		super(name, age, isMan);
		this.daySalary = daysalary;
	}

	/*
	 * В случай че на работник се наложи да работи извън работно време, на него
	 * му се дължи допълнителна сума пари (overtime) за часовете които е
	 * работил. Сумата се пресмята по следния начин: ако работника, няма
	 * навършени 18 години, дължимата сума е 0. В противен случай, за всеки
	 * отработен час, на работника се заплаща сумата която получава на час
	 * (зависи от дневната заплата) умножена по 1,5. – метод
	 * calculateOvertime(double hours) който пресмята и връща стойността на
	 * сумата която му се дължи при работа извън работно време
	 */
	double calculateOvertime(double hours) {
		double overtime = 0;
		if (this.getAge() < 18) {
			double hourWage = this.daySalary / 8;

		}
		if (this.getAge() > 18) {
			double hourWage = this.daySalary / 8;
			overtime = hours *= hourWage * 1.5;

		}
		return overtime;

	}

	/*
	 * – метод showEmployeeInfo(), който показва информация за човека, както и
	 * информация за дневната му заплата
	 */

	@Override
	public String toString() {
		return "Employee salary is: " + daySalary + "lv" + " his name is : " + getName() + " his age is :" + getAge()
				+ " is he a real man :" + isMan() + "";
	}

	void showEmployeeInfo() {

		System.out.println(this.toString());

	}

}
