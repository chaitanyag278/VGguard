package Test;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testclass {
	WebDriver driver;

	@Test
	public void lauchDriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://vguard.suneratech.com/");
	}

	
	public void find() {
		driver.close();
	}

}
