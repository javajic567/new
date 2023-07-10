package selenium1;

import java.io.PrintStream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssSelectorclass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.facebook.com/");
    Thread.sleep(5000);
   // driver.findElement(By.cssSelector("input#email")).sendKeys("hello ");
   //driver.findElement(By.cssSelector("input[placeholder='First Name']")).sendKeys("hello");
  // driver.findElement(By.cssSelector("input.form-control")).sendKeys("hello");
  // driver.findElement(By.cssSelector("input.form-control[placeholder='Last Name']")).sendKeys("hello");
   //driver.findElement(By.cssSelector("input[id^='e']")).sendKeys("hello");
  // driver.findElement(By.cssSelector("input[id^='e']")).clear();
   //Thread.sleep(3000);
   //driver.findElement(By.cssSelector("input[id$='il']")).sendKeys("hello");
   //driver.findElement(By.cssSelector("input[id*='i']")).sendKeys("hello");
  // driver.findElement(By.partialLinkText("Forgotten password?")).click();
   //driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[1]/input")).sendKeys("hello");
  //xpath
  //  driver.findElement(By.xpath("//input[@id='email']")).sendKeys("hello");
  String name=driver.findElement(By.xpath("//h2[@class='_8eso']")).getText();
//driver.findElement(By.xpath("//*[@id='email']")).sendKeys("hello:");
//  driver.findElement(By.xpath("a[@href='http://www.facebook.com/recover/initiate/?privacy_mutation_token=eyJ…DYwOTg1LCJjYWxsc2l0ZV9pZCI6MzgxMjI5MDc5NTc1OTQ2fQ%3D%3D&ars=facebook_login']")).click();
//driver.navigate().to("https://accounts.google.com/");
  driver.findElement(By.xpath("//*a:contains('Forgotten password?')")).click();
  System.out.println(name);
 
  
  Thread.sleep(4000);
  
  driver.close();
	}

}
