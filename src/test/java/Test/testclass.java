package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testclass {
	WebDriver driver;

	
	@BeforeTest
	public void lauchDriver() {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(option);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://vguard.suneratech.com");
	}
@Test
	public void logincredentials() throws Exception
	{
		driver.findElement(By.name("email")).sendKeys("vipin.rapheal@vguard.in");
		Thread.sleep(1000);
		driver.findElement(By.name("password")).sendKeys("vguard@123");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//header/nav[1]/a[1]")).click();
		Thread.sleep(2000);
		}
@Test
public void inspect() throws InterruptedException
{
	driver.findElement(By.xpath("//span[contains(text(),'Inspect')]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//body/div[1]/aside[1]/section[1]/ul[1]/li[16]/ul[1]/li[1]/a[1]")).click();
}

}
