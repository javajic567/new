package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstProgram {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
      WebDriver driver=new ChromeDriver();
      driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
      String title=driver.getTitle();
      if (title.equals("OrangeHRM"))
      {
    	  System.out.println("given title is matched");
      }
      else
      {
    	  System.out.println("given title not matched");
      }
      
      String name=driver.getCurrentUrl();
      System.out.println(name);
      String page_source=driver.getPageSource();
      System.out.println(page_source);
      Thread.sleep(5000);
      driver.findElement(By.cssSelector("#app > div.orangehrm-login-layout > div > div.orangehrm-login-container > div > div.orangehrm-login-slot > div.orangehrm-login-form > form > div:nth-child(2) > div > div:nth-child(2) > input")).sendKeys("Admin");
      driver.findElement(By.name("password")).sendKeys("admin123");
      driver.findElement(By.cssSelector("#app > div.orangehrm-login-layout > div > div.orangehrm-login-container > div > div.orangehrm-login-slot > div.orangehrm-login-form > form > div.oxd-form-actions.orangehrm-login-action > button")).click();
      Thread.sleep(5000);
      driver.close();
	}

}
