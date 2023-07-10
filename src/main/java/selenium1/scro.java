package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.KeyInput;

public class scro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     WebDriver driver=new ChromeDriver();
     driver.get("https://builtin.com/software-engineering-perspectives/convert-list-to-dictionary-python");
     Actions act=new Actions(driver);
     act.scrollToElement(driver.findElement(By.xpath("//*[@id=\"page-main-content\"]/div/div/div/div/div/div[1]/div/div/div[1]/article/div[2]/div[1]/figure[1]/img"))).perform();
    
	}

}
