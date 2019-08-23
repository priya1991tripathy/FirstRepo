package PractisePackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class FacebookLoginTest 
{
	private static WebDriver driver;
	@BeforeMethod
	public  void loginWithValid()
	{	System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}
	@Test
	public void Loginpage()
	{
		System.out.println("hi1");
		driver.get("https://www.facebook.com");
		FacebookLoginPage flp=new FacebookLoginPage(driver);
		flp.provideEmail("9066192188");
		flp.providePwd("18April1991");
		System.out.println("beforeclick");
		flp.providClick();
	}
	@AfterMethod
	public void teardown()
	{
		System.out.println("afterclick");
		driver.quit();
	}
}

