package MVNPROJECT.MVNPROJE;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewTest9 extends test9 {
	
	public WebDriver driver;
	  @Test

	public void m1() {
	driver.get("https://www.facebook.com/");
	System.out.println(driver.getTitle());
	} 
	
  
  @BeforeMethod
   void f() throws MalformedURLException {
	  driver=BrowserConnection("chrome");
			  
		
  }
 
  
  
   @AfterMethod
  public void f2() {
	  driver.close();
	  driver.quit();

  }
}
