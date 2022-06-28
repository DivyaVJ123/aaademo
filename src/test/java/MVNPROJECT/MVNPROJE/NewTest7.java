package MVNPROJECT.MVNPROJE;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewTest7 {
  @Test
  @BeforeMethod
  @BeforeClass
  public void f() {
	  System.out.println("java");
  }
  public class new1{
  @AfterMethod
  @AfterClass
  public void f2() {
	  System.out.println("java progran");
  }
  
  public class new2{
  public void f3() {
	  System.out.println("java 2");
	  
  }
}
  
