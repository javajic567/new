package selenium1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiple_window {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        WebDriver driver=new ChromeDriver();
        driver.get("https://demo.automationtesting.in/Windows.html");
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a")).click();
	  Thread.sleep(5000);
	  String window1=driver.getWindowHandle();
	  driver.findElement(By.xpath("//*[@id=\"Seperate\"]/button")).click();
	  Thread.sleep(5000); 
	  String name= driver.getWindowHandle();
	   driver.switchTo().window(window1);
	  Thread.sleep(5000);
        driver.quit();
	}

}
