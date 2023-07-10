package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathclass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        Thread.sleep(4000);
        //driver.findElement(By.xpath("//*[contains(@id,'email')]")).sendKeys("hello world");
	  //driver.findElement(By.xpath("//*[contains(text(),'Forgotten password?')]")).click();
	//driver.findElement(By.xpath("//*[@id='email' or @name ='email'] ")).sendKeys("hell");
	//driver.findElement(By.xpath("//*[@id='email' and @name ='email'] ")).sendKeys("hell");
//    driver.findElement(By.xpath("//input[starts-with(@id,'email')]")).sendKeys("hello");
        //driver.findElement(By.xpath("//*[@type='text']//following::input[1]")).sendKeys("hello");
    	//driver.findElement(By.xpath("//*[@class='_6lux']//child::input[1]")).sendKeys("hello");
	
	}

}
