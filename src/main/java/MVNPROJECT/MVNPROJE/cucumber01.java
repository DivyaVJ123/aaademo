package MVNPROJECT.MVNPROJE;

import io.cucumber.java.en.*;

public class cucumber01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

		@Given("I want to write a step with precondition")
		public void i_want_to_write_a_step_with_precondition() {
		   System.out.println("cucumber1");
		}

		@Given("some other precondition")
		public void some_other_precondition() {
			   System.out.println("cucumber2");
		}

		@When("I complete action")
		public void i_complete_action() {
			   System.out.println("cucumber3");

		}

		@When("some other action")
		public void some_other_action() {
			   System.out.println("cucumber4");

		}

		@When("yet another action")
		public void yet_another_action() {
			   System.out.println("cucumber5");

		}

		@Then("I validate the outcomes")
		public void i_validate_the_outcomes() {
			   System.out.println("cucumber6");

		}

		@Then("check more outcomes")
		public void check_more_outcomes() {
			   System.out.println("cucumber7");

		}

}
