import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTest6 {
	WebDriver driver;

	@BeforeClass
	@Parameters({ "browser", "url" })
  @Test
  public void f(String browser,String url) {
		if (browser.equalsIgnoreCase("chrome"))   
	  
	  WebDriverManager.chromedriver().setup();
	   driver=new ChromeDriver();
  }
	else {
		System.out.println("invalid browser");

	}
	driver.get(url);
}
  @Test
  public void f1() {
	  driver.get("https://www.facebook.com/");
	  driver.findElement(By.id("email")).sendKeys("ambika");
	  driver.findElement(By.id("pass")).sendKeys("8867944707");
	  driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/button[1]")).click();

  }
  @AfterClass
  public void f3() {
	  driver.close();
	  driver.quit();
  }
 
  
}
