package LoginPage;


import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/*
 1)Open WebApp
 2)Login WebApp
 3)Logout WebApp
 
 */


public class FirstTestCase {
	
	WebDriver driver;
	public void iwait() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	@Test(priority=1)
	
	public void openApp() 
	{
	driver=new ChromeDriver();
	driver.get("https://app.vgqa.glint.cloud-dev.microsoft/session/auth");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	System.out.println("Opening WebApp");	
	}
	
	@Test(priority=2)
	public void testLogo() 
	{
	WebElement status= driver.findElement(By.xpath("//div[@class=\"logo\"]"));
	boolean displayed=status.isDisplayed();
	System.out.println("Logo Displayed" +":"+displayed);	
	}
	
	@Test(priority=3)
	public void loginWebApp()
	{
		driver.findElement(By.xpath("//input[@type=\"email\"]")).sendKeys("qatester@glintinc.com");
		driver.findElement(By.xpath("//button[@class=\"btnCta glintButton\"]")).click();
		driver.findElement(By.xpath("//input[@class=\"formInput col-1-2 ng-untouched ng-pristine ng-invalid\"]")).sendKeys("qa20230825");
		driver.findElement(By.xpath("//button[@class=\"btnCta glintButton\"]")).click();
		driver.findElement(By.xpath("//input[@class=\"formInput col-1-2 ng-untouched ng-pristine ng-invalid\"]")).sendKeys("Dem0@pass2");
		driver.findElement(By.xpath("//button[@class=\"btnCta glintButton\"]")).click();
		System.out.println("Entering valid credentials");
	}

	@Test(priority=4)
	public void logOut()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.findElement(By.xpath("//li[@class=\"iconNavItem user ng-star-inserted\"]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.findElement(By.xpath("//li[@id=\"option2\"]")).click();
		//driver.quit();
		System.out.println("Logging out from WebApp");
	}
	
}
