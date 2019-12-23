import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class myClass2 {
  @Test
  public void Test02() throws InterruptedException, MalformedURLException {
	  DesiredCapabilities chromeDC = DesiredCapabilities.chrome();
	  
	  WebDriver driver = new RemoteWebDriver(new URL("http://192.168.99.100:4444/wd/hub"), chromeDC);
	  driver.get("http://atidcollege.co.il/");
	  driver.manage().window().maximize();
	  Thread.sleep(4000);
	  driver.quit();	
	  System.out.println("Test02 from class 2 Completed successfully");
  }
}
