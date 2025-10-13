import java.util.Date;
import java.util.Scanner;

public class TestService {
	private static Test[] testArr;
	private static int index ;
	
	static {
		testArr = new Test[100];
		
		 Question[] questions1 =new Question[] {
		            new Question("What is Java?", new String[]{"A platform", "A language", "A drink", "An OS"}, "A language"),
		            new Question("Default value of int?", new String[]{"1", "null", "0", "undefined"}, "0"),
		            new Question("Which keyword for inheritance?", new String[]{"extends", "implements", "import", "instanceof"}, "extends"),
		            new Question("Which is not a Java feature?", new String[]{"Platform Independent", "Object Oriented", "Pointer Arithmetic", "Robust"}, "Pointer Arithmetic"),
		            new Question("What is JVM?", new String[]{"Compiler", "Interpreter", "Loader", "Virtual Machine"}, "Virtual Machine")
		        };

		        // Create questions for second Test
		        Question[] questions2 = new Question[] {
		            new Question("Access modifier with most access?", new String[]{"public", "protected", "private", "default"}, "public"),
		            new Question("Which creates object?", new String[]{"new", "class", "void", "interface"}, "new"),
		            new Question("To stop thread?", new String[]{"terminate", "end", "stop", "exit"}, "stop"),
		            new Question("Which is NOT exception?", new String[]{"NullPointerException", "FileNotFoundException", "IndexOutOfBoundsException", "FileDeletedException"}, "FileDeletedException"),
		            new Question("Which collection does not allow duplicates?", new String[]{"List", "Set", "Map", "Array"}, "Set")
		        };

		        // Create questions for third Test
		        Question[] questions3 = new Question[] {
		            new Question("Constructor returns?", new String[]{"void", "class", "object", "none"}, "none"),
		            new Question("Method overloading means?", new String[]{"same name, diff params", "same name, same params", "diff name, same params", "diff name, diff params"}, "same name, diff params"),
		            new Question("Wrapper class for int?", new String[]{"Int", "integer", "Integer", "Number"}, "Integer"),
		            new Question("Main method signature?", new String[]{"public static main(String[] args)", "public static void main(String[] args)", "void main(String[] args)", "None"}, "public static void main(String[] args)"),
		            new Question("Can abstract class have constructor?", new String[]{"No", "Only private", "Yes", "Only static"}, "Yes")
		        };

		        // Create 3 Test objects
		        Test test1 = new Test("Java Basics", new Date(), questions1, questions1.length);
		        Test test2 = new Test("OOP Concepts", new Date(), questions2, questions2.length);
		        Test test3 = new Test("Advanced Java", new Date(), questions3, questions3.length);
		        
		        testArr[0]=test1;
		        testArr[1]=test2;
		        testArr[2]=test3;
		        index=3;
		        
	}
	
	private static Question createQue(Scanner sc) {
		
		do {
			System.out.println("Enter question text");
			sc.nextLine();
			String qText= sc.nextLine();
			
			//option arr
			String[] optionArr=new String[4];
			
			//accepting options
			for(int i=0 ; i<4 ; i++) {
				System.out.println("Enter "+i+"th option");
				optionArr[i] = sc.nextLine();
			}
			System.out.println("Enter answer");
			String ans = sc.nextLine();
			
			boolean validate=false;
			
			// validate ans
			for(int i=0 ; i<4 ; i++) {
				if(optionArr[i].equals(ans)) {
					validate=true;
					break;
				}
			}
			if(!validate) {
				System.out.println("Answer is wrong Enter question again..");
				continue;
			}
			return new Question(qText ,optionArr , ans);
		}while(true);
		
		
	}

	// to display all the tests
	public static void displayAllTests() {
		// TODO Auto-generated method stub
		for(int i=0 ; i<index ; i++) {
			System.out.println(testArr[i]);
		}
	}
	
	
    // to find test by id
	public static Test findTestById(int tId) {
		for(int i=0 ; i<index ; i++) {
			if(testArr[i].getId()==tId) {
				return testArr[i];
			}
		}
		return null;
	}

	//to fild all tests by subject name
	public static Test[] findAllTestsBySubject(String subject) {
		Test[] tArr = new Test[index];
		int j=0;
		for(int i=0 ; i<index ; i++) {
			if(testArr[i].getSubjectName().equals(subject)) {
				tArr[j++]=testArr[i];
			}
		}
		return j==0 ?null:tArr;
	}
//	private static int countQ=0;
//	private int id;
//	private String questionText;
//	private String[] options;
//	private String answer;

	// to add a new test
	public static boolean addNewTest(Scanner sc) {
		System.out.println("Enter subject name :");
		sc.nextLine();
		String subject = sc.nextLine();
		
		//array of quetion
		Question[] qArr = new Question[10];
		int a=0;
		
		/// choce variable to add question according to choice 
		int choice;
		
		do {
			
			// creating question object
			qArr[a++]=createQue(sc);
			
			System.out.println("Do you want to enter one more question? if yes enter 1 else enter 0");
			choice=sc.nextInt();
			if(choice!=1) {
				break;
			}
			
		}while(a!=10);
		
		//creating test object
		Test t = new Test(subject , new Date() ,qArr ,a);
		testArr[index++]=t;
		return true;
	}


	public static boolean addQueInTestById(int tid , Scanner sc) {
		Test t = findTestById(tid);
		if (t==null) return false;
		
		if (t.getNoOfQuestions()==10) return false;
		
		t.getQuestionList()[t.getNoOfQuestions()]=createQue(sc);
		t.setNoOfQuestions(t.getNoOfQuestions()+1);
		
	   
		// TODO Auto-generated method stub
		return true;
	}

	public static boolean startTest(int tid , Scanner sc) {
		int marks=0;
		int maxmarks=0;
		Test t = findTestById(tid);
		if(t==null) {
			return false;
		}
		for(Question q :t.getQuestionList()) {
			if(q==null) break;
			maxmarks+=2;
			System.out.println(q.getQuestionText());
			for(String s : q.getOptions()) {
				System.out.println(s);
			}
			System.out.println("Enter answer as 1 , 2 , 3 , 4");
			int ans=sc.nextInt();
			if(ans>4) continue;
			if(q.getOptions()[ans-1].equals(q.getAnswer())) {
				marks+=2;
			}
		}
		System.out.println();
		System.out.println("Your marks :"+marks +"/"+maxmarks);
		return true;
	}


	
	
	
	

}
