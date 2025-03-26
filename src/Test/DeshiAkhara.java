package Test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class DeshiAkhara {
	
	
	@Test(groups = {"smoke"})
	public void deshiFight()
	{
		System.out.println("This is Deshi fight");
	}
	
	@Parameters("Browser")
	@Test(timeOut = 4000)
	public void deshiHatafai(String broswer)
	{
		System.out.println("This is Deshi hatafai");
		System.out.println(broswer);
	}
	
	@Test(dataProvider="dataSend")
	public void deshiKushti(String a, String b)
	{
		System.out.println(a + b);
	}
	
	@DataProvider
	public Object dataSend()
	{
		Object[][] obj = new Object[3][2];
		
		obj[0][0] = "Rupam";
		obj[0][1] = "Ban";
		
		obj[1][0] = "Ramen";
		obj[1][1] = "Muk";
		
		obj[2][0] = "Arpan";
		obj[2][1] = "Muk";
		
		return obj;

}

			
	
	
	
	
	
	
	
	
	
	
	
	
	
}
