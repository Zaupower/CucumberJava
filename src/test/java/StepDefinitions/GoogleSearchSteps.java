package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.*;

import java.util.List;

import Context.DataContext;
import Pages.GoogleSearchPage;
import Pages.GoogleSearchResultPage;

public class GoogleSearchSteps extends DataContext {
	
	private DataContext context;
	
	public GoogleSearchSteps(DataContext context)
    {
        this.context = context;
    }
	
	@Given("Open Google page")
	public void Open_Google_page() {		
		context.currentPage = new GoogleSearchPage(context.driver);
		((GoogleSearchPage) context.currentPage).OpenPage();
		((GoogleSearchPage) context.currentPage).AcceptCookies();
		
 	}
	
	@Given("Search {string}")
	public void Search(String searchInput) {
		((GoogleSearchPage) context.currentPage).InputSearchText(searchInput);
	}
	
	@When("Click on Search button")
	public void Click_on_Search_Button() {		
		context.SetCurrentPage(((GoogleSearchPage) context.currentPage).ClickSearch());
	}
	
	@Then("The User is redirected to search results")
	public void The_User_is_redirected_to_search_results() {
		List<String> result =((GoogleSearchResultPage) context.currentPage).PageResults();
		assertTrue(result.size() > 3);
	}
}