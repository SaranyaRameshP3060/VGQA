package ExportSpreadSheet;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ExportSpreadsheet {
	WebDriver driver=new ChromeDriver();

  @Test
  public void exportToexcel() {
	  driver.get("https://app.vgqa.glint.cloud-dev.microsoft/session/auth");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.manage().window().maximize();
	  driver.findElement(By.xpath("//input[@type=\"email\"]")).sendKeys("qatester@glintinc.com");
	  driver.findElement(By.xpath("//button[@class=\"btnCta glintButton\"]")).click();
	  driver.findElement(By.xpath("//input[@class=\"formInput col-1-2 ng-untouched ng-pristine ng-invalid\"]")).sendKeys("qa20230825");
	  driver.findElement(By.xpath("//button[@class=\"btnCta glintButton\"]")).click();
	  driver.findElement(By.xpath("//input[@class=\"formInput col-1-2 ng-untouched ng-pristine ng-invalid\"]")).sendKeys("Dem0@pass2");
	  driver.findElement(By.xpath("//button[@class=\"btnCta glintButton\"]")).click();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
	  driver.findElement(By.id("tab-4")).click();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
	  driver.findElement(By.xpath("//span[contains(text(),'Tour')]")).click();
	  System.out.println("start tour");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
	  driver.findElement(By.xpath("//li[@class=\"tile ng-star-inserted\"][1]")).click();
	  System.out.println("ESR clicked");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
	  driver.findElement(By.xpath("//div[@class=\"menuButton glintButton btnCta btnSlim\"]")).click();
	  System.out.println("Export btn clicked");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
	  Actions a=new Actions(driver);
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
	  a.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Export Report to Spreadsheet')]"))).click().perform();
	  System.out.println("Export to Excel");
	  driver.findElement(By.xpath("//button[@class=\"btnCta glintButton\"][1]")).click();
	  System.out.println("Export");

  }
}
