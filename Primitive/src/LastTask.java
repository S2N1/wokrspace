import java.util.Scanner;

public class LastTask {
 
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("I am healty: ");
		boolean myHealth = sc.nextBoolean();
		
		System.out.println("The Money i have:");
		double myMoney = sc.nextDouble();
		
	  if(myHealth == false && myMoney <= 0){
			
			System.out.println("I will stay home and dring tea");
			
			} else if  (myHealth == false && myMoney > 0 ){
				
				System.out.println("I will buy Medecine" );
									
			}	 else if (myHealth == true && myMoney <=0){
				System.out.println("I will play games at home" );
				
			}  else if (myHealth == true && myMoney>10){
				System.out.println("I will patry all Night" );
				
				} else if(myHealth == true && myMoney<=10 ){
					System.out.println("I will go to drink coffee" );
				}
				
			} 
			
	  }
		  
	


	

