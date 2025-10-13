import java.util.*;
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int choice;
		
		do {
			System.out.println();
			System.out.println("1) Display all test data");
			System.out.println("2)find test by id");
			System.out.println("3) find all tests by subject");
			System.out.println("4)Add a new Test");
			System.out.println("5) Add queston in a test by using id");
			System.out.println("6) start a test using test id");
			System.out.println("7) Exit");
			System.out.println("Enter your choice :");
			choice=sc.nextInt();
			
			switch(choice) {
			case 1:
				TestService.displayAllTests();
                break;
			case 2:
				System.out.println("Enter test id :");
				int tId = sc.nextInt();
				Test test = TestService.findTestById(tId);
				if(test==null) {
					System.out.println("test not found");
				}
				else {
					System.out.println(test);
				}
				break;
			case 3:
				sc.nextLine();
				System.out.println("Enter Subject name");
				String subject =sc.nextLine();
				Test[] tArr = TestService.findAllTestsBySubject(subject);
				if(tArr!=null) {
					for(Test t : tArr) {
						if(t==null) break;
						System.out.println(t);
					}
				}else {
					System.out.println("Not Found");
				}
				break;
			case 4:
				boolean status = TestService.addNewTest(sc);
				if(status) {
					System.out.println("Test added successfully !");
				}else {
					System.out.println("not found");
				}
				break;
			case 5:
				System.out.println("Enter test id");
				int tid = sc.nextInt();
				status = TestService.addQueInTestById(tid , sc);
				if(status) {
					System.out.println("question added successfully !");
				}else {
					System.out.println("not found");
				}
				break;
			case 6:
				System.out.println("Enter test id");
				 tid = sc.nextInt();
				status = TestService.startTest(tid , sc);
				if(status) {
					System.out.println("Test submited sucessfully!");
				}else {
					System.out.println("not found");
				}
				break;
			default:
				System.out.println("Invalid choice!");
			}
					
		}while(choice!=7);

	}

}
