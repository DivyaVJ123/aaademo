package MVNPROJECT.MVNPROJE;

import org.testng.annotations.Test;

public class NewTest1 {
  @Test
  public void method1() {
	  System.out.println("hello");
	  
  }
  @Test
  public void method2() {
	  
	  System.out.println("hello1");
}
  @Test(priority=3,enabled=false)
  public void method3() {
	  
	  System.out.println("hello2");
  }
  
  
  
}