package Com.BaseLayer;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Baseclass11 {

	public static WebDriver driver;

	public static void inc () {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Datta\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().deleteAllCookies();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	
		
		
		
	}
}