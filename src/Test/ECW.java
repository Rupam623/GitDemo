package Test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ECW {
	
	@Test
	public void ecwExtreme()
	{
		System.out.println("This is Ecw extreme");
	}
	
	@Test(groups = {"smoke"})
	public void ecwSpecial()
	{
		System.out.println("This is Ecw special");
	}
	
	@Test
	public void ecwCriteria()
	{
		System.out.println("Need full audience");
	}

}
