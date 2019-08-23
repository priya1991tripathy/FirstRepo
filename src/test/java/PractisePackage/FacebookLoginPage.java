package PractisePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class FacebookLoginPage {
	WebDriver driver;
	By emailid=By.id("email");
	By pwd=By.id("pass");
	By loginbutton=By.xpath("//input[@value='Log In']");
	public  FacebookLoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	
	public void provideEmail(String phone)
	{
		driver.findElement(emailid) .sendKeys(phone);
	}
	public void providePwd(String password)
	{
		driver.findElement(pwd).sendKeys(password);
	}
	public void providClick()
	{
		driver.findElement(loginbutton).sendKeys(Keys.RETURN);
	}

}
