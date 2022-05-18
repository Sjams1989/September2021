package variousConcepts;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnLocators {

	WebDriver driver;

	@Before
	public void LaunchBrowser() {
		System.setProperty("webdriver.chrome.driver" ,"driver\\chromedriver101.exe");
		driver = new ChromeDriver();
		driver.get("https://objectspy.space/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		

	}

	@Test
	public void TestLocators() throws InterruptedException {
		
		
	//driver.findElement(By.linkText("OS-API Product FrontEnd")).click();
	//driver.navigate().back();
	//driver.findElement(By.partialLinkText("TF-API")).click();
		
	//CSS SELECTORS EXAMPLE:
	
	driver.findElement(By.cssSelector("input#sex-1")).click();
	Thread.sleep(3000);
	driver.findElement(By.cssSelector("input[value='Enter keywords.....']")).click();
	
	
	//XPATH Syntax using Attribute nodes/value ->  //Tag[@AttributeNode='Value']
	//or //Tag[@Attribute Node='Value' and @Attribute Node='Value'] if more trying to find element using more than one attribute.
	
	driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("12345");
	
	
	//XPATH Syntax for links -> //Tag[text()='Value'] or if you can use contain() method Tag//[contains(text(),'Value']
	
	//driver.findElement(By.xpath("//strong[text()='Link Test : New Page']")).click();
	//driver.findElement(By.xpath("//strong[contains(text(),'Link Test : Page Change')]")).click();
	
	driver.findElement(By.xpath("//input[@id='tool-1']")).click();   
	driver.findElement(By.xpath("//input[@id=\"tool-1\"]")).click();
	
	
	
	}
}
