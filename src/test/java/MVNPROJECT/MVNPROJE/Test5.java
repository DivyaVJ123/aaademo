package MVNPROJECT.MVNPROJE;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


  @Test
  
  public class Test5 {
		WebDriver driver;

		@BeforeClass
		@Parameters({ "browser", "url" })

		public void f(String browser, String url) {
			if (browser.equalsIgnoreCase("chrome")) {
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();

			} else {
				System.out.println("invalid browser");
			}
			driver.get(url);
		}

		@AfterClass
		public void A() {
			driver.close();
			driver.quit();
		}

		@Test
		public void abc() {
			driver.findElement(By.id("email")).sendKeys("divyavijaya");
			driver.findElement(By.id("pass")).sendKeys("divya3604$");
		}

	}

