package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearchSteps {
	
	@Given("Open Google page")
	public void Open_Google_page() {
		
		System.out.print("Open Google page");
	}
	
	@When(" Search {string}")
	public void Search(String searchInput) {
		
		System.out.print("searchInput: " + searchInput );
	}
	
	@When("Click on Search button")
	public void Click_on_Search_Button() {
		
		System.out.print("Click on Search Button");
	}
	
	@Then("The User is redirected to search results")
	public void The_User_is_redirected_to_search_results() {
		
		System.out.print("The search returns multiple responses");
	}
}