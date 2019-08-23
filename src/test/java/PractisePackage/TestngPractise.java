package PractisePackage;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestngPractise {
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("beforemethod");
	}
	@Test(priority=1)
	  public void fun1() {
		  System.out.println("test1");
	  }
 @Test(priority=2)
  public void fun2() {
	  System.out.println("test2");
  }
/*  @Test(priority=3)
  public void fun3() {
	  System.out.println("test3");
  }*/
  @AfterMethod
	public void afterMethod()
	{
		System.out.println("aftermethod");
	}
}
