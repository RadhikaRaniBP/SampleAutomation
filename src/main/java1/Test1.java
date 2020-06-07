import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test1 {
	
	WebDriver driver;
	
	@BeforeMethod
	public void driverinstantiate() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\govin\\.m2\\repository\\org\\seleniumhq\\selenium\\selenium-chrome-driver\\3.141.0\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
	}
	
	@Test
public void sample1() throws InterruptedException {

		driver.findElement(By.name("q")).sendKeys("Krishna");
		Thread.sleep(3000);
	}
	@Test
	public void sample2() throws InterruptedException {

		driver.get("https://www.google.com");
		Thread.sleep(3000);
	}
	@Test
	public void sample3() throws InterruptedException {

		driver.get("https://www.google.com");
		Thread.sleep(3000);
	}
	
	@AfterMethod
	public void driverclose()
	{
		driver.quit();
	}

}
