
import java.util.*;
public class ArrayServices {
    
	public static void acceptData(int arr[]) {
		Scanner sc= new Scanner(System.in);
		for(int i =0;i<arr.length;i++) {
			System.out.println("Enter numbers");
			arr[i]= sc.nextInt();
			
		}
	}
	  public static void displayData(int arr[]) {
		  System.out.println("numbers are:");
		  for(int i =0;i<arr.length;i++) {
			  System.out.println(arr[i]);		
	  }
	
}
	  
	 public static void addOddNum(int arr[]) {
		 int ans = 0;
		 for(int i =0; i<arr.length;i++) {
			 if(arr[i]%2!=0) { 
				 ans =ans + arr[i];
			 }
			
		 }
		 System.out.println("Addition of odd numbers:" +ans);
		  
	 }
	 public static void factOfNum(int arr[]) {
		 for(int i=0; i<arr.length;i++) {
			 if(arr[i]<7) {
				 int fact= 1;
				 for(int j=1; j<=arr[i];j++) {
				 fact = fact*j;
				 }
				 System.out.println("Factorial of "+arr[i]+"is:"+fact);
			 }
			 
		 }
	 }
	 public static int[] findPrime(int arr[]) {
		 int prime[] = new int [arr.length];
		 int a =0;
		 for(int i =0; i<arr.length;i++) {
			 int cnt=0;
			 for(int j=2;j<arr[i];j++) {
				 if(arr[i]%j==0) {
					 cnt++;
				 }
			 }
			 if(cnt==0) {
				 System.out.println(arr[i]);
				 prime[a]=arr[i];
				 a++;
			 }
			 
		 }
		 return prime;
	 }
	 
	 public static void findNthIndexPrime(int prime[]) {
		 int nthPrime[] = findPrime(prime);
		 
		 System.out.println("Enter value of n to find nth prime");
		 Scanner sc = new Scanner(System.in);
		 int n = sc.nextInt();
	     
		 System.out.println(nthPrime[n]); 
	 }
	 public static int findNthLargestPrime() {
		int nthLarge = 0;
		 
		 
		 return nthLarge;
		 
	 }
}
