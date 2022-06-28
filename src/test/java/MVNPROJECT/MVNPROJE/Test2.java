package MVNPROJECT.MVNPROJE;

import org.testng.annotations.Test;

public class Test2 {
   
	  @Test(groups= {"sanity"})
	  
	    
	    public void b() {
	  	  System.out.println("hello");
	  	  
	    }
	    @Test(groups= {"sanity"})
	    public void c() {
	  	  
	  	  System.out.println("hello1");
	  }
	    @Test(groups= {"regretion"})
	    public void a() {
	    	System.out.println("hello2");
  }
}
