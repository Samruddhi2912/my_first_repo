import java.util.*;
public class DynamicArr {

	public static void accept(int arr[][]) {
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<arr.length;i++) {
			
				System.out.println("Enter number of cols for row "+i);
				int cols= sc.nextInt();
				arr[i] =new int[cols];
				//accepting data
			
				for(int j=0;j<arr[i].length;j++) {
					System.out.println("enter data for"+ i+","+j);
					arr[i][j]=sc.nextInt();
				}
	
		}
	}
	  public static void display(int arr[][]) {
    System.out.println("displaying data");
    for(int i=0; i<arr.length;i++) {
    	for(int j=0;j<arr[i].length;j++) {
    		System.out.print(arr[i][j]+"\t");
    	}
    	System.out.println();
    }
    
   }
	  public static int maxOfAll(int arr[][]){
		  int max =arr[0][0];
		  for(int i=0;i<arr.length;i++) {
			  for(int j =0; j<arr[i].length;j++) {
				  if(arr[i][j]>max) {
					  max= arr[i][j];
				  }
				  
			  } 
		  }
		  
		  return max;
	  }
	public static int[] maxRowWise(int[][] arr) {
		int maxRow[]= new int [arr.length];
		 for(int i=0;i<arr.length;i++) {
			  maxRow[i]=arr[i][0];
			  for(int j =0; j<arr[i].length;j++) {
				  if(maxRow[i]<arr[i][j]) {
					  maxRow[i] = arr[i][j];
				  }
	}
		 }
		 return maxRow;
		 }
	  
	
}
