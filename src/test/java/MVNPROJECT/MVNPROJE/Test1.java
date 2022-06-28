package MVNPROJECT.MVNPROJE;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test1 {
  @Test
  public void M1() {
	  System.out.println("open chrome");
	  Assert.fail();
  }
  @Test(dependsOnMethods= {"M1"})
  public void M2() {
	  System.out.println("pass chrome");

  }
  @Test(dependsOnMethods= {"M2"})
  public void M3() {
	  System.out.println("click chrome");

  }
  @Test(dependsOnMethods= {"M3"},alwaysRun=true)
  public void M4() {
	  System.out.println("page chrome");

  }
}
