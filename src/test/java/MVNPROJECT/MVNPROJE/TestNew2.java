package MVNPROJECT.MVNPROJE;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNew2{
  @Test(priority=1)
  
    
    public void b() {
  	  System.out.println("hello");
  	  
    }
    @Test(priority=2)
    public void c() {
  	  
  	  System.out.println("hello1");
  }
    @Test(priority=3)
    public void a() {
    	System.out.println("hello2");
    }
    	@BeforeMethod
    	public void Method1()
    	{
    		System.out.println("calling before method");
    	}
    	
    	@AfterMethod
    	public void Method2()
    	{
    		System.out.println("calling after method");
    	
    	}
    	
  	  @BeforeTest
  	  public void Method3() {
  		  System.out.println("calling before test");
  	  }
  	  
  	  @AfterTest
  	  public void Method4() {
  		  System.out.println("calling after test");
  	  }
  	  
  	@BeforeClass
	  public void Method5() {
		  System.out.println("calling before class");
	  }
	  
	  @AfterClass
	  public void Method6() {
		  System.out.println("calling after class");
	  }
    }
  
