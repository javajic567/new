package selenium1;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
driver.get("https://demoqa.com/droppable");

   Actions a=new Actions(driver);
   a.dragAndDrop(driver.findElement(By.id("draggable")), driver.findElement(By.id("droppable"))).build().perform();
	a.moveToElement(driver.findElement(By.linkText("Accept"))).click().build().perform();
	WebElement e=driver.findElement(By.linkText("Accept"));
	System.out.println(e.getAccessibleName());
	WebElement element=driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div/div[2]/div/div[2]"));    
	
	a.clickAndHold(driver.findElement(By.id("acceptable")))
	.pause(Duration.ofSeconds(3))
	.moveToElement(element)
	.pause(Duration.ofSeconds(3))
	.release()
	.build()
	.perform();
	a.dragAndDropBy(driver.findElement(By.id("dragBox")), 401, 38).build().perform();
	
	}

}
