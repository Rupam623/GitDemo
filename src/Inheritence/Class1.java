package Inheritence;

import org.testng.annotations.Test;

public class Class1 {

	// Method 1: by directly calling the method from parent class
	/*
	 * @Test public void operation() { int b = addition(5); System.out.println(b); }
	 */

	/*
	 * //Method2: by calling object and sending parameter on the the method
	 * 
	 * @Test public void operation2() { Class1 cs1= new Class1(); int c =
	 * cs1.addition(5); System.out.println(c);
	 */

	// method3: by sending parameter during object creation

	@Test
	public void operation3() {
		Class2 cs2 = new Class2(3);
		System.err.println(cs2.addition());
		System.out.println(cs2.multiplication());


	}

}
