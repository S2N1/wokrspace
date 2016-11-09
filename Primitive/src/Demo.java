




import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		
		//System.out.println(total);
		
		{
			int total = 4;
			
			System.out.println(total);
		}
		
		//System.out.println(total);
		
		int total = 23;
		
		{
			System.out.println(total);
		}
		
		System.out.println(total);
	
		total = 45;
		
		System.out.println(total);
		
		///////
		
		byte b = -128;
		
		short s = -6300;
		
		int i = 2000000000;
		
		//long l = 200000000000000l;
		long l = 2;
		
		int i2 = (int) l;
		
		System.out.println(i2);
		
		///////
		
		float f = 3.14324234223456789876543212345678f;
		
		System.out.println(f);
		
		double d = 3.14324234223456789876543212345678;
		
		System.out.println(d);
		
		float f2 = 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f;
		double d2 = 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1;
		
		System.out.println(f2);
		System.out.println(d2);
		
		float f3 = 7 * 0.1f;
		System.out.println(f3);
		
		char ch = '+';
		ch = '\u03c0';
		
		System.out.println(ch);
		
		int a1 = 7;
		int a2 = 3;
		int a3 = a1 / a2;
		int a4 = a1 % a2;
		
		
		int a5 = 4;
		//a5 = a1 * (2 + 1);
		a5 = a5 + 7;
		a5 += 7;
		a5 /= 7; // a5 = a5 / 7;
		
		a5 = a5 + 1;
		a5 += 1;
		a5++;
		++a5;
		
		a5 = 8;
		int a6 = a5++;
		int a7 = ++a5;
		
		boolean bool = true;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first number: ");
		int firstNumber = sc.nextInt();
		
		System.out.println("Enter the second number: ");
		int secondNumber = sc.nextInt();
		
		int result = firstNumber * secondNumber;
		System.out.println("Result is: " + result);
		
		/*
		if(result > 0) {
			System.out.println("Positive");
		} else { 
			if(result == 0) {
				System.out.println("Zero");
			} else {
				System.out.println("Non-positive");
			}
		}
		*/
		
		if(result > 0) {
			System.out.println("Positive");
		} else if(result == 0) {
			System.out.println("Zero");
			result += 10;
		} else if(result == 10) {
			System.out.println("10 e");
		} else {
			System.out.println("Non-positive");
		}
		
		System.out.println("Bye");
	}
	
}
