package MVNPROJECT.MVNPROJE;

import org.testng.annotations.Test;

public class NewTest3 {
   
	  @Test(priority=1)
	  
	   	  public void b() {
	  	  System.out.println("hello");
	  	  
	    }
	    @Test(priority=2)
	    public void c() {
		  	   System.out.println("hello1");
	    }
	    	 @Test(priority=1)
	   	  
		   	  public void A() {
		  	  System.out.println("hello2");
	  }
	    
}
