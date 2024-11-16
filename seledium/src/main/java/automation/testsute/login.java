package automation.testsute;

import org.testng.annotations.*;

public class login {
	
	@BeforeMethod
	public void init()
	{
		System.out.println("This is before method");
	}
@Test
public void testcase1()
{
	System.out.println("This is testcasse 1");
}

@Test
public void testcase2()
{
	System.out.println("This is testcasse 2");
}
}

