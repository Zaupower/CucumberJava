package StepDefinitions;

import io.cucumber.java.Before;

import org.openqa.selenium.chrome.ChromeDriver;

import Context.DataContext;
import io.cucumber.java.After;


public class Hooks extends DataContext {

	private DataContext Context;


    public Hooks(DataContext context)
    {
        this.Context = context;
    }
    
	@Before
	public void BeforeScenario() {
		Context.Driver = new ChromeDriver();
		Context.Driver.manage().window().maximize();
		
	}
	
	@After
	public void AfterScenario() {
		Context.Driver.quit();
	}
}
