package utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase {
	WebDriver driver;
	@BeforeMethod
	public void doSetup()
	{
		
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	@Test
	public void doLogin()
	{
		driver.get("https://gmail.com");
		driver.findElement(By.id("identifierId")).sendKeys("nagakowsalya");
		
	}
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}
