package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
     WebDriver driver=new ChromeDriver();
     driver.get("https://demo.automationtesting.in/Frames.html");
//     WebElement element=driver.findElement(By.id("singleframe"));
//     driver.switchTo().frame(element);
//     driver.findElement(By.xpath("//input[@type='text']")).sendKeys("hello world");
//    
//     Thread.sleep(4000);
     driver.findElement(By.linkText("Iframe with in an Iframe")).click();
     WebElement element1=driver.findElement(By.xpath("//*[@id=\"Multiple\"]/iframe"));
     driver.switchTo().frame(element1);
    driver.switchTo().frame(0);
     
     driver.findElement(By.xpath("//input[@type='text']")).sendKeys("hello");
     Thread.sleep(4000);
     driver.close();
	}

}
