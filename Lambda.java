

public class Lambda {

	public static void main(String[] args) {
		
		/*
		 * ALL VALID LAMBDA EXPRESSIONS
		 * () -> System.out.println("Hello World!"); // no parameters
		 * (x) -> System.out.println(x); // one parameter
		 * (int x) -> System.out.println(x); // type parameter
		 * (x,y) -> System.out.println(x+y); // 2 parameters 
		 */
		FunctionalInterface lamb = (int a) -> System.out.println(a*5);
		FunctionalInterface lamb2 = (int a) -> System.out.println(a*5*3);
		// initializing a lambda expression + MUST MATCH WITH THE PARAMETERS IN THE METHOD (TYPE DOES NOT NEED TO MATCH)
		
		lamb.doSomething(6);
		lamb2.doSomething(3);
		
	}
	interface FunctionalInterface{
		public void doSomething(int a); 
		// in order to have a functional interface, you can only have one method
	
	}
	

}
