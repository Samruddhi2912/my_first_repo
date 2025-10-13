import java.util.*;
public class Test_Dynamic {

	public static void main(String[] args) {

		int arr[][]= new int[3][];
		
		
		DynamicArr.accept(arr);
		DynamicArr.display(arr);
		
		int choice;
		Scanner sc = new Scanner(System.in);
		do {
		System.out.println("1. find max of all data\n2. find max rowwise");
		System.out.println("3. find max column wise\n4. find addition rowwise");
        System.out.println("5. find addition columnwise\n6.exit\n choice:");
        choice = sc.nextInt();
        
        switch(choice) {
        
        case 1:
        	int max=DynamicArr.maxOfAll(arr);
        	System.out.println("maximum of all:"+max);
        	break;
        
        case 2:
        	break;
        	//DynamicArr.maxRowWise(arr)
        
        case 3:
        	break;
        
        case 4:
        	break;
        
        case 5:
        	break;
        
        case 6:
        	System.out.println("Thank you.......");
        	break;
        
        
        
        default:
        	System.out.println("Invalid ...");
        }
        
        
		}while(choice!=6);
	}

}
