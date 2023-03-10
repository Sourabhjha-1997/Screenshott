package baseclass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testbase {
	static WebDriver driver;
	   public static ThreadLocal<WebDriver> tdriver = new ThreadLocal<WebDriver>();
	   public WebDriver initialize_driver(){
		   System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
		   //System.setProperty("webdriver.chrome.driver","ChromeDriver.exe");
			//ChromeDriver  driver = new ChromeDriver();
		   WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.manage().window().maximize();
			tdriver.set(driver);
			return getDriver();
		}
		
		public static synchronized WebDriver getDriver() {
			return tdriver.get();

}
}
