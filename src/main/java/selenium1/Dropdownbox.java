package selenium1;

import java.util.List;

import org.checkerframework.checker.units.qual.s;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdownbox {
public static void main(String args[]) throws InterruptedException
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.automationtesting.in/Register.html");
	WebElement element=driver.findElement(By.id("Skills"));
	Select S=new Select(element);
//	S.selectByIndex(3);
//	Thread.sleep(1000);
//	S.selectByValue("Android");
//	Thread.sleep(1000);
//	S.selectByVisibleText("C");
//	String anme=S.getOptions().toString();
//	
//	List<WebElement> a=S.getAllSelectedOptions();
//	     
//	System.out.println(anme);
	driver.navigate().to("https://demoqa.com/select-menu");
	WebElement element1=driver.findElement(By.xpath("//*[@id=\"cars\"]"));
	Select s=new Select(element1);
	s.selectByIndex(1);
	s.selectByValue("audi");
	s.selectByVisibleText("Opel");
	List<WebElement> list=s.getOptions();
	int i=0;
	while(i<list.size())
	{
		System.out.println(list.get(i).getText());
		i++;
	}
	System.out.println("selected elements");
	List<WebElement> a=s.getAllSelectedOptions();
	i=0;
	while(i<a.size())
	{
		System.out.println(a.get(i).getText());
		i++;
	}
	s.deselectAll();
	driver.navigate().to("https://www.facebook.com");
	List<WebElement> li=driver.findElements(By.tagName("a"));
	i=0;
	
	while(i<li.size())
	{
		System.out.println(li.get(i).getText());
		i++;
	}
     Thread.sleep(5000);
	driver.close();

}
}
