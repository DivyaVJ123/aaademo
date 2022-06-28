package MVNPROJECT.MVNPROJE;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Logout1 {
	@Given("Enter user name")
	public void enter_user_name() {
	    System.out.println("step1");
	}

	@Given("Enter password")
	public void enter_password() {
	    System.out.println("step12");

	}

	@When("click logout botton")
	public void click_logout_botton() {
	    System.out.println("step3");

	}

}
