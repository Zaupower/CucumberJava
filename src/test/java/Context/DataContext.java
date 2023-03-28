package Context;

import org.openqa.selenium.WebDriver;

import Pages.BasePage;

public class DataContext {

	public WebDriver Driver;
	public BasePage CurrentPage;
		
	public void SetCurrentPage(BasePage currentPage) {
		this.CurrentPage = currentPage; 
	}
	
	public BasePage GetCurrentPage() {
		return this.CurrentPage;
	}
}
