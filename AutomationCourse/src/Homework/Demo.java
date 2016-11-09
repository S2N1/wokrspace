package Homework;

public class Demo {
	public static void main(String[] args) {

		/*MyComputer pc = new MyComputer();

		MyComputer pc2 = new MyComputer();

		MyComputer pc5 = new MyComputer();

		MyComputer pc3 = new MyComputer(700, 2016, 500, 500, false, "Win7");

		MyComputer pc4 = new MyComputer(700, 2016, 500, 500, true, "Win7");

		System.out
				.println("The firs computer is more expensive the method will return value : " + pc.comparePrice(pc2));

		System.out.println(
				"The second computer is more expensive the method will return value : " + pc3.comparePrice(pc2));

		System.out.println("The computers have the same price the method will return value : " + pc3.comparePrice(pc3));
*/
		
		Student st = new Student();
		
		System.out.println(st.getisDegree());
		System.out.println(st.getYearInCollege());
		
		st.upYear();
		st.upYear();
		st.upYear();
		st.upYear();
		
		
		
		System.out.println(st.getisDegree());
		System.out.println(st.getYearInCollege());
		
		
		
		
		

}}