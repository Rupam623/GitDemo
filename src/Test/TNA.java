package Test;

import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TNA {

	
	
	@Test
	public void tnaSuper()
	{
		System.out.println("This is Tna super");
	}
	
	@Test(groups = {"smoke"})
	public void tnaAdvance()
	{
		System.out.println("This is Tna advance");
	}
	
	@Test
	public void tnaSpecial()
	{
		System.out.println("This is Tna spcial");
	}
}
