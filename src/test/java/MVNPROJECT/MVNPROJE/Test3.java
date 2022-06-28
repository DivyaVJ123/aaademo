package MVNPROJECT.MVNPROJE;

import org.junit.AfterClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test3 {
	WebDriver driver;
  @BeforeClass
  public void xyz() {
	  WebDriverManager.chromedriver().setup();
	 driver=new ChromeDriver();
	 driver.get(" https://www.facebook.com/");
  }
  
  @Test
  public void abc() { 
 driver.findElement(By.id("email")).sendKeys("divyavijaya");
 driver.findElement(By.id("pass")).sendKeys("divya3604$");

}
  @AfterClass
  public void ccc() {
	  driver.close();
	  driver.quit();
  }
 
}
