package Homework;

public class Demo {
	public static void main(String[] args) {

		MyComputer pc = new MyComputer();

		MyComputer pc2 = new MyComputer();

		MyComputer pc5 = new MyComputer();

		MyComputer pc3 = new MyComputer(700, 2016, 500, 500, false, "Win7");

		MyComputer pc4 = new MyComputer(700, 2016, 500, 500, true, "Win7");

		System.out
				.println("The firs computer is more expensive the method will return value : " + pc.comparePrice(pc2));

		System.out.println(
				"The second computer is more expensive the method will return value : " + pc3.comparePrice(pc2));

		System.out.println("The computers have the same price the method will return value : " + pc3.comparePrice(pc3));

		Student st = new Student();
		Student st1 = new Student();
		Student st2 = new Student();
		Student st3 = new Student();
		Student st4 = new Student();
		System.out.println(st.getYearInCollege());

		st.upYear();
		st.upYear();
		st.upYear();

		System.out.println(st.getisDegree());
		System.out.println(st.getYearInCollege());

		st.setSubject("math");
		st1.setSubject("math");
		st2.setSubject("math");
		st3.setSubject("math");
		st4.setSubject("math");
		st.setGrade(6);
		st1.setGrade(1);
		st2.setGrade(2);
		st3.setGrade(3);
		st4.setGrade(5);
		st.setName("Ivan");
		st1.setName("Gosho");
		st2.setName("Petur");
		st3.setName("Kaloqn");
		st4.setName("Tupan");
		st.setAge(18);
		StudentGroup sg = new StudentGroup();

		sg.groupSubject = "math";

		sg.addStudent(st);
		sg.addStudent(st1);
		sg.addStudent(st2);

		sg.addStudent(st4);
		System.out.println(sg.freePlaces);

		sg.theBeststudent();

		st.recieveScholarship(5, 800);

		System.out.println("Student has the following amount of money : " + st.getMoney());

		sg.printStudentsInGroup();

	}
}