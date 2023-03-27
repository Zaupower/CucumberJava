package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

	@Given("User navigates to login page")
	public void Navigate_to_Login_page() {
		
		System.out.print("Navigate to Login page");
	}
	
	@When("User input {string} and {string} credentials")
	public void User_inputs_login_credentials(String username, String password) {
		
		System.out.print("username: " + username + ", password: " + password);
	}
	
	@When("Click on login button")
	public void click_on_login_button() {
		
		System.out.print("Selenium Click on login button");
	}
	
	@Then("User is redirected to the home page")
	public void user_is_redirected_to_the_home_page() {
		
		System.out.print("Navigate to Home page");
	}
	
}
