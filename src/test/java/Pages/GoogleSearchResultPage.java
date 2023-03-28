package Pages;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.ArrayList;

public class GoogleSearchResultPage extends BasePage{
	
	@FindBy(xpath = "//div[contains(@class,'v7W49e')]//div[contains(@class, 'MjjYud')]")
	List<WebElement> firstPageSearchResults;
	
	public GoogleSearchResultPage(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements( driver, this); 
	}
	
	public List<String> PageResults() {
		List<String> res= new ArrayList<>();
		
		for(WebElement result : firstPageSearchResults) {
			String text = result.findElement(By.xpath("//div[contains(@class, 'yuRUbf')]//h3[contains(@class, 'LC20lb MBeuO DKV0Md')]")).getText();
			res.add(text);			
		}
		return res;
	}
}
