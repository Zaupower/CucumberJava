package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertArrayEquals;

import java.util.List;

import Context.DataContext;
import Pages.GoogleSearchPage;
import Pages.GoogleSearchResultPage;

public class GoogleSearchSteps extends DataContext {
	
	private DataContext Context;
	
	public GoogleSearchSteps(DataContext context)
    {
        this.Context = context;
    }
	
	@Given("Open Google page")
	public void Open_Google_page() {		
		Context.CurrentPage = new GoogleSearchPage(Context.Driver);
		((GoogleSearchPage) Context.CurrentPage).OpenPage();
		((GoogleSearchPage) Context.CurrentPage).AcceptCookies();
		
 	}
	
	@Given("Search {string}")
	public void Search(String searchInput) {
		((GoogleSearchPage) Context.CurrentPage).InputSearchText(searchInput);
	}
	
	@When("Click on Search button")
	public void Click_on_Search_Button() {		
		Context.SetCurrentPage(((GoogleSearchPage) Context.CurrentPage).ClickSearch());
	}
	
	@Then("The User is redirected to search results")
	public void The_User_is_redirected_to_search_results() {
		List<String> result =((GoogleSearchResultPage) Context.CurrentPage).PageResults();
		//assertArrayEquals();
	}
}