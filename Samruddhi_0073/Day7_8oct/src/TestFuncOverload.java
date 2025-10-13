
public class TestFuncOverload {

	public static void main(String[] args) {
      
		System.out.println(FuncOverLoad.add(45,68));
		
		FuncOverLoad obj = new FuncOverLoad();
		System.out.println(obj.max(88,44));
		
		System.out.println(obj.max(52.33f,52.30f));
         System.out.println(obj.add(2, 4, 44,7,9,10));
         System.out.println(FuncOverLoad.add(5, 4,9));
	}

}
