
public interface Inter1 {
	int x =10;
	
	 void m1();
	 void m1(int x);
	 void m1(float m, float n);
	
	  default void m2() {
		System.out.println("Default method of interface1");
	}
     int m3(int x);
     
     static void m4() {
    	 System.out.println("static method of interface");
     }
    
}
