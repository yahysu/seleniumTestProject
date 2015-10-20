package seleniumTestProject;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class GoogleSearchTest {
	protected WebDriver driver;
	
	
	@Before
	public void setUp(){
		driver = new FirefoxDriver();
		driver.get("http://www.google.com");
	}
	
	@Test
	public void test() throws Exception {		
		WebElement element =  driver.findElement(By.name("q"));
		element.sendKeys("테스");
		element.submit();

		// wait for title to contain
		WebDriverWait wait = new WebDriverWait( driver, 5);
		wait.until(ExpectedConditions.titleContains("테스"));

		
		// quit driver
		//driver.quit();
	}

}
