import java.util.*;
public class Test {

	public static void main(String[] args) {
	
		
		System.out.println("Enter size of array");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();		
		 int arr[] = new int [size];
		 ArrayServices.acceptData(arr);
		 ArrayServices.displayData(arr);
		 
		 int choice ;
		 do {
			 
			System.out.println("Enter choice\n 1.Addition of odd numbers \n 2.Factorial of number\n 3.Find Prime Numbers\n 4.find nth index prime no\n5.exit");
			 System.out.println("-----------------------------");
		  choice = sc.nextInt();
		  switch(choice) {
		  case 1: 
			  ArrayServices.addOddNum(arr);
			  break;
		  case 2:
			  ArrayServices.factOfNum(arr);
			  break;
		  case 3: 
			  ArrayServices.findPrime(arr);
			  break;
		  case 4:
			  ArrayServices.findNthIndexPrime(arr);
			  break;
		  case 5:
			  System.out.println("thank you....");
			  break;
		  default:
			  System.out.println("Invalid");
		  }
		  System.out.println("-----------------------------");
		 }while(choice!=5);
		
		
		 
		 
		
		
		

	}

}
