package testng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterisation {
	
	@Parameters("b")
	@Test
	public void test1(String s)
	{
		
		System.out.println("value="+s);
	}
	
	

}
