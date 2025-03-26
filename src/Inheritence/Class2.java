package Inheritence;

import org.testng.annotations.Test;

public class Class2 extends Class3{

int a;
	public Class2(int a) {
		super(a);
	this.a=a;
}
	@Test
	public int addition()
	{
		a = a+5;
		return a;
	}
	

	

}
