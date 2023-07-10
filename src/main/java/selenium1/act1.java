package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class act1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String baseUrl = "http://www.facebook.com/"; 
		WebDriver driver = new ChromeDriver();

		driver.get(baseUrl);
		WebElement txtUsername = driver.findElement(By.id("email"));

		Actions b = new Actions(driver);
		Action Ac = b
			.moveToElement(txtUsername)
			.click()
			.keyDown(txtUsername, Keys.SHIFT)
			.sendKeys(txtUsername, "hello")
			.keyUp(txtUsername, Keys.SHIFT)
			.doubleClick(txtUsername)
			.contextClick()
			.build();
			
		Ac.perform();
	}

}
