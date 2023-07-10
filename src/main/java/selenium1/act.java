package selenium1;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class act {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  WebDriver driver = new ChromeDriver();

		  driver.get("https://www.amazon.in/");

		  driver.manage().window().maximize();
		  Set<Cookie> cookie=driver.manage().getCookies();
		  System.out.println(cookie.size());
//		  for(Cookie co:cookie)
//		  {
//			  System.out.println(co.getName()+":"+co.getValue());
//			  System.out.println(co.getDomain()+"\n"+co.getPath()+"\n"+co.getSameSite()+"\n"+co.getExpiry()+"\n"+co.toJson()+"\n"+co.isSecure()+"\n"+co.isHttpOnly());
//			  System.out.println("-----------------------");
//		  }
		  System.out.println(driver.manage().getCookieNamed("session-id-time"));
	  Cookie obj1=new Cookie("mycookie","12334455");
	  driver.manage().addCookie(obj1);
	  cookie=driver.manage().getCookies();
	  System.out.println(cookie.size());
	  for(Cookie co:cookie)
		  {
			  System.out.println(co.getName()+":"+co.getValue());
			  System.out.println(co.getDomain()+"\n"+co.getPath()+"\n"+co.getSameSite()+"\n"+co.getExpiry()+"\n"+co.toJson()+"\n"+co.isSecure()+"\n"+co.isHttpOnly());
			  System.out.println("-----------------------");
		  }
	  
	
	driver.manage().deleteCookie(obj1);
	cookie=driver.manage().getCookies();
	  System.out.println(cookie.size());
	  for(Cookie co:cookie)
		  {
			  System.out.println(co.getName()+":"+co.getValue());
			  System.out.println(co.getDomain()+"\n"+co.getPath()+"\n"+co.getSameSite()+"\n"+co.getExpiry()+"\n"+co.toJson()+"\n"+co.isSecure()+"\n"+co.isHttpOnly());
			  System.out.println("-----------------------");
		  }
	  
	}

}
