package Test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testclass 
{
 WebDriver driver;
 @BeforeTest
	public void lauchDriver()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
	}
 @Test
	public void test1()
	{
		driver.get("https://vguard.suneratech.com/");
		driver.findElement(By.xpath("")).sendKeys("");
	}
 @AfterTest
 void teardown()
 {
	 driver.quit();
	 
 }
 
}
