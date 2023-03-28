package Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoogleSearchPage extends BasePage{

	@FindBy(xpath = "//div[contains(@class, 'RNNXgb')]//div[contains(@class, 'a4bIc')]//input[contains(@class, 'gLFyf')]")
	WebElement searchBoxInput;
	
	@FindBy(xpath = "//div[contains(@class, 'FPdoLc lJ9FBc')]//input[contains(@class, 'gNO89b')]")
	WebElement searchButton;
		
	public GoogleSearchPage(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements( driver, this); 
	}
	
	public void OpenPage() {
		driver.navigate().to("https://google.com");
	}
	public void AcceptCookies() {
		WebElement acceptCookiesButton = new WebDriverWait(driver, Duration.ofSeconds(10))
				.until(ExpectedConditions.elementToBeClickable(By.id("L2AGLb")));
		acceptCookiesButton.click();
	}
	public void InputSearchText(String searchText) {
		searchBoxInput.sendKeys(searchText);
	}
	public GoogleSearchResultPage ClickSearch() {
		searchButton.click();		
		return new GoogleSearchResultPage(driver);
	}
	
}
