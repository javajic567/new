package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseAction {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver(); 
		driver.get("https://demo.automationtesting.in/Frames.html");
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.linkText("SwitchTo"))).build().perform();
        act.moveToElement(driver.findElement(By.linkText("Interactions"))).sendKeys(Keys.ARROW_DOWN).click().perform();
	    Thread.sleep(1000);
        act.moveToElement(driver.findElement(By.linkText("Static"))).build().perform();
	    
        driver.navigate().to("https://demoqa.com/droppable");
        Actions act1 =new Actions(driver);
      
	}

}