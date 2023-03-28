package Context;

import org.openqa.selenium.WebDriver;

import Pages.BasePage;

public class DataContext {

	public WebDriver driver;
	public BasePage currentPage;
		
	public void SetCurrentPage(BasePage currentPage) {
		this.currentPage = currentPage; 
	}
	
	public BasePage GetCurrentPage() {
		return this.currentPage;
	}
}
