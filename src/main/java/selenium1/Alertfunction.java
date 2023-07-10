package selenium1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertfunction {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        WebDriver driver=new ChromeDriver();
        driver.get("https://demo.automationtesting.in/Alerts.html");
        driver.findElement(By.linkText("Alert with OK")).click();
        driver.findElement(By.xpath("//*[@id=\"OKTab\"]/button")).click();
        Thread.sleep(3000);
        driver.switchTo().alert().accept();
        driver.findElement(By.linkText("Alert with OK & Cancel")).click();
        driver.findElement(By.xpath("//*[@id=\"CancelTab\"]/button")).click();
        String msg=driver.switchTo().alert().getText();
        Alert a=driver.switchTo().alert();
        a.dismiss();
        System.out.println(msg);
        String a1=driver.findElement(By.xpath("//p[@id='demo']")).getText();
	    System.out.println(a1);
	    driver.findElement(By.linkText("Alert with Textbox")).click();
	    driver.findElement(By.xpath("//*[@id=\"Textbox\"]/button  ")).click();
	    Alert a2=driver.switchTo().alert();
	    a2.sendKeys("helllo");
	    a2.accept();
	}

}
