package commonFunctions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeSuite;

public class CommonFunctions {
	public static Properties properties=null;
	public static WebDriver driver;
	
	public Properties loadPropertyFile() throws IOException {
		
		FileInputStream fileInputStream = new FileInputStream("config.properties");
	    properties = new Properties();
		properties.load(fileInputStream);
		return properties;

	}
	@BeforeSuite
	public void launchBrowser() throws IOException { 
		loadPropertyFile();
		String browser = properties.getProperty("browser");
		String url = properties.getProperty("url");
		String driverLocation = properties.getProperty("driverlocation");
		
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\New_Project\\driver\\chromedriver.exe");
		     driver = new ChromeDriver();
		}else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "D:\\Eclipse\\New_Project\\driver\\chromedriver.exe");
			 driver = new FirefoxDriver();
		}
       driver.get(url);
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
}
