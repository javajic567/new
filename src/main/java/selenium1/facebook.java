package selenium1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class facebook {
	static String driverPath = "C:\\Users\\dell\\Downloads\\geckodriver-v0.29.1-win64\\GeckoDriver.exe";
    static public WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.gecko.driver", driverPath);
	       ;
	        driver = new FirefoxDriver();
	        driver.get("http://demo.guru99.com/selenium/guru99home/");
	}

}
