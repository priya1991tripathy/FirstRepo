package PractisePackage;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestngPractiseTwo {
	@BeforeTest
	public void beforeMethod()
	{
		System.out.println("beforemethodtwo");
	}
	@Test(priority=1)
	  public void fun12() {
		  System.out.println("test1two");
	  }
  @Test(priority=2)
  public void fun22() {
	  System.out.println("test2two");
  }
 @Test(priority=3)
  public void fun33() {
	  System.out.println("test3two");
  }
  @AfterTest
	public void afterMethod()
	{
		System.out.println("aftermethodtwo");
	}

}
