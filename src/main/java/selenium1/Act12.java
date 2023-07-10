package selenium1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Act12 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
	     driver.get("https://demoqa.com/droppable");
	     Actions act=new Actions(driver);
//	     act.moveToElement(driver.findElement(By.xpath("//a[normalize-space()='Interactions']"))).sendKeys(Keys.ARROW_DOWN).build().perform();
//	     Thread.sleep(2000);
//	     act.click(driver.findElement(By.xpath("//a[normalize-space()='Static']"))).build().perform();
//    act.clickAndHold(driver.findElement(By.id("mongo")))
//    .pause(Duration.ofSeconds(2))
//    .moveToElement( driver.findElement(By.id("droparea")))
//    .pause(Duration.ofSeconds(2))
//    .build()
//    .perform();
	     Thread.sleep(2000);
	     act.dragAndDrop(driver.findElement(By.id("draggable")), driver.findElement(By.id("droppable"))).build().perform();
	    act.
	}

}
