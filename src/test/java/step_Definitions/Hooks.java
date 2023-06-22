package step_Definitions;

import org.openqa.selenium.chrome.ChromeDriver;

import base.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks extends Base{
	
	@Before
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("Before Run");
	}
	
	@After
	public void tearDown() {
		driver.close();
		System.out.println("After Run");
	}

}//class
