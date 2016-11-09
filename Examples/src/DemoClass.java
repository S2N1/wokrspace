import java.util.Scanner;

public class DemoClass {

	public static void main(String[] args){
		
		Scanner input1 = new Scanner(System.in);
  		System.out.println("Input a positive number  :  ");

  		int n1 = input1.nextInt();

  		for (int z = 1; z < n1; z++) {
  			if (z % 3 == 0) {
  				System.out.printf(z + ",");
}

